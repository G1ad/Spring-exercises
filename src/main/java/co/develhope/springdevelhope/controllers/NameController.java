package co.develhope.springdevelhope.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class NameController {

    @GetMapping(value = "/name")
    public String getName(){
        return "Raman";
    }
    @PostMapping("/{name}")
    public StringBuilder postName(@PathVariable String name){
        StringBuilder stringBuilder = new StringBuilder(name);
        return stringBuilder.reverse();
    }

    public NameController() {
    }
}
