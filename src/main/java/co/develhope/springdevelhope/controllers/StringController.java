package co.develhope.springdevelhope.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class StringController {

    @GetMapping(value = "/strings")
    public String concatStrings(@RequestParam (required = true) String s1, @RequestParam (required = false) String s2 ){
        if (s2==null)
            return s1;
        else
            return s1+s2;
    }
}