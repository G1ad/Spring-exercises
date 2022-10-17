package co.develhope.springdevelhope.controllers;

import co.develhope.springdevelhope.entities.Flight;
import co.develhope.springdevelhope.entities.Status;
import co.develhope.springdevelhope.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/flight")
public class FlightController {

    @Autowired
    FlightRepository repository;

    public String randomValue(){
        int leftLimit = 97;
        int rightLimit = 122;
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit,rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return generatedString;
    }

    @GetMapping("/get")
    public List<Flight> getFlights(){
        List<Flight> flightsList = new ArrayList<>();
        for(int i = 0; i < 50; i++) {
            flightsList.add(new Flight(i,randomValue(),randomValue(),randomValue(), Status.ONTIME));
        }
        repository.saveAllAndFlush(flightsList);
        return flightsList;
    }

    @GetMapping("/getAll")
    public List<Flight> getAllFlights(){
        return repository.findAll();
    }

    @GetMapping("/provisioning")
    public void provisioningFlights(@RequestParam(required = false) Integer n){
        if(n == null) n = 100;
        List<Flight> newFlightsList = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            Flight flight = new Flight();
            flight.setDescription(randomValue());
            flight.setFromAirport(randomValue());
            flight.setToAirport(randomValue());
            flight.setStatus(Status.randomStatus());
            newFlightsList.add(flight);
        }
        repository.saveAllAndFlush(newFlightsList);
    }

    @GetMapping("")
    public Page<Flight> getFlightsPage(@RequestParam int page, @RequestParam int size){
        return repository.findAll(PageRequest.of(page,size, Sort.by("fromAirport")));
    }

    @GetMapping("/custom")
    public List<Flight> getCustom(@RequestParam Status p1, @RequestParam Status p2){
        return repository.getCustom(p1, p2);
    }

}
