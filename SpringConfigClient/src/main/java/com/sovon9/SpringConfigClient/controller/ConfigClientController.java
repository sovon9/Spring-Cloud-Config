package com.sovon9.SpringConfigClient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {

    @GetMapping("/data")
    public String getPropertiesValue(@Value("${user.name}") String name)
    {
        return "<H1>Welcome "+name+"</H1>";
    }

}
