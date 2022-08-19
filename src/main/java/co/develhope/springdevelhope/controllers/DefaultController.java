package co.develhope.springdevelhope.controllers;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DefaultController {

    @GetMapping(value = "")
    @ApiOperation(value = "Welcome in Swagger", notes = "Print out a welcome message ")
    @ResponseStatus(HttpStatus.OK)
    @ApiResponses({
            @ApiResponse(code = 400, message = "Bad input data"),
            @ApiResponse(code = 500, message = "Internal error from Spring", response = String.class),
            @ApiResponse(code = 202, message = "Created")
    })
    public String sayWelcome(){
        return "Welcome in Swagger";
    }
}
