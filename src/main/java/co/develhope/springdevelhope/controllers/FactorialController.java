package co.develhope.springdevelhope.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
public class FactorialController {


    @GetMapping(value = "/controller/{n}")
    public BigInteger getFactorial(@PathVariable int n){
        BigInteger result = BigInteger.ONE;
        for(int i = 2; i <=n ; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
