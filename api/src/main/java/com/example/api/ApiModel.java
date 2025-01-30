package com.example.api;

import java.time.Intant;

public class ApiModel{

    private String email;
    private String current_datetime;
    private String github_url;

    public ApiModel(String email, String github_url){
        this.email = email;
        this.current_datetime = Instant.now().toString();
        this.github_url = github_url;
    }

    public String getEmail(){
        return email;
    }

    public String getCurrent_datetime(){
        return current_datetime;
    }

    public String getGithub_url(){
        return github_url;
    }

}