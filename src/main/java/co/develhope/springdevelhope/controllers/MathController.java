package co.develhope.springdevelhope.controllers;

import co.develhope.springdevelhope.entities.ArithmeticOperation;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController{

    @GetMapping(value = "")
    @ResponseStatus(HttpStatus.OK)
    @ApiResponses({
            @ApiResponse(code = 200, message = "Created"),
            @ApiResponse(code = 400, message = "Not found"),
            @ApiResponse(code = 500, message = "Internal server error")})
    @ApiOperation(value = "welcomes the user", notes = "print a welcome message")
    public String welcomeMathMsg(){
        return "Welcome to the math controller";
    }

    @GetMapping("/division-info")
    @ResponseStatus(HttpStatus.OK)
    @ApiResponses({
            @ApiResponse(code = 200, message = "Created"),
            @ApiResponse(code = 400, message = "Not found"),
            @ApiResponse(code = 500, message = "Internal server error")})
    @ApiOperation(value = "division properties", notes ="explains the properties of the division")
    public ArithmeticOperation infoDivision(){
        return new ArithmeticOperation(
                "Division",
                2,
                "The division is a method of distributing a group of things into equal parts",
                new String[]{"Distributive property","Invariant property"});
    }

    @GetMapping(value = "/multiplication")
    @ResponseStatus(HttpStatus.OK)
    @ApiResponses({
            @ApiResponse(code = 200, message = "Created"),
            @ApiResponse(code = 400, message = "Not found"),
            @ApiResponse(code = 500, message = "Internal server error")})
    @ApiOperation(value = "multiplication",notes = "returns the product of two numbers")
    public int multiplication(@RequestParam int int1, @RequestParam int int2){
        return  int1*int2;
    }

    @GetMapping(value = "/square/{n}")
    @ResponseStatus(HttpStatus.OK)
    @ApiResponses({
            @ApiResponse(code = 200, message = "Created"),
            @ApiResponse(code = 400, message = "Not found"),
            @ApiResponse(code = 500, message = "Internal server error")})
    @ApiOperation(value = "square", notes = "Takes a number and returns its square")
    public double square(@PathVariable double n){
        return Math.pow(n,2);
    }
}
