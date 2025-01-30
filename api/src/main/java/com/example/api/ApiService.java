package com.example.api;

import org.springframework.stereotype.Service;

@Service
public class ApiService {

    private ApiModel apiModel = new ApiModel("shamsain3@gmail.com", "https://github.com/Shamsaine/hng12-stage0-public-api.git");
    
    public ApiModel getInfo(ApiModel apiModel){
        return apiModel;
    }
    
}
