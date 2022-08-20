package co.develhope.springdevelhope.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetSocketAddress;

@RestController
public class HeaderController {

    @GetMapping(value = "/headers")
    public InetSocketAddress getHeaders(@RequestHeader HttpHeaders headers){
        return headers.getHost();
    }
}
