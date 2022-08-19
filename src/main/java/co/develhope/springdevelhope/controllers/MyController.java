package co.develhope.springdevelhope.controllers;

import co.develhope.springdevelhope.servicies.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private MyService myService;

    @GetMapping("/getName")
    public String name(){
        return myService.getName();
    }
    public MyController(MyService myService) {
        System.out.println("MyController constructor has been called.");
        this.myService = myService;
    }
}
