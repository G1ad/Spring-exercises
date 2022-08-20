package co.develhope.springdevelhope.controllers;

import co.develhope.springdevelhope.DTO.CarDTO;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class CarController {

    @GetMapping(value = "/cars")
    public CarDTO getCar(CarDTO carDTO){
        return new CarDTO("SH-4128","AudiTT RS",89000);
    }

    @PostMapping(value = "/cars")
    public String postCar(@Valid @RequestBody CarDTO carDTO){
        return carDTO.toString();
    }
}
