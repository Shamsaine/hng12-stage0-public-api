package com.example.api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class ApiController {

    @GetMapping
    public ApiModel getInfo(){
        return new  ApiModel("shamsain3@gmail.com", "https://github.com/Shamsaine/hng12-stage0-public-api.git");
    }
    
}
