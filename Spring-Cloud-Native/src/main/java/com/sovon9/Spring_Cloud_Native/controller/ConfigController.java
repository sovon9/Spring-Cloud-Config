package com.sovon9.Spring_Cloud_Native.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @GetMapping("/status")
    public String getStatus()
    {
        return "running...";
    }

}
