package com.example.api;

import org.springframework.stereotype.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
public class ApiController {

    @Autowired
    public ApiService apiService;

    @GetMapping("/url")
    public ApiModel getInfo(){
        return apiService.getInfo();
    }
    
}
