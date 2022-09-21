package co.develhope.springdevelhope.controllers;
import co.develhope.springdevelhope.entities.CarEntity;
import co.develhope.springdevelhope.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarRepository carRepository;


    @PostMapping("/addCar")
    public CarEntity addCar (@RequestBody CarEntity car){
        return carRepository.save(car);
    }

    @GetMapping("/getAllCars")
    public List<CarEntity> getAllCars(){
        return carRepository.findAll();
    }


    @GetMapping("/getCarById/{id}")
    public Optional<CarEntity> getCarById(@PathVariable Long id){
        if(carRepository.existsById(id)){
            return carRepository.findById(id);
        }else{
            return null;
        }
    }

    @PutMapping("/putCar/{id}")
    public CarEntity updateCar(@PathVariable Long id, @RequestBody CarEntity car){
        if(carRepository.existsById(id)){
            car.setId(id);
            carRepository.save(car);
            return car;
        }else{
            return null;
        }
    }

    @DeleteMapping("/deleteCar/{id}")
    public String deleteById(@PathVariable Long id, HttpServletResponse response){
        if(carRepository.existsById(id)){
            carRepository.deleteById(id);
            return "Car " + id + " has been deleted from the database.";
        }else{
            try {
                response.sendError(409, "conflict status");
            }catch (IOException e){
                e.printStackTrace();
            }
            return null;
        }
    }

    @DeleteMapping("/deleteAll")
    public String deleteAllCars(){
        carRepository.deleteAll();
        return "All cars have been deleted.";
    }
}
