package uoc.edu.pdp.user.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/micro1")
public class Micro1Controller {

    @GetMapping
    public String SayHello() {
        return "Hi from microservice 1";
    }

}
