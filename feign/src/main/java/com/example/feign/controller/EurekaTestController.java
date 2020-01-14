package com.example.feign.controller;

import com.example.feign.service.feignclient.EurekaTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author laizh
 */
@RestController
public class EurekaTestController {
    @Autowired
    private EurekaTestService eurekaTestService;

    @GetMapping("/eurekaTest/get/{id}")
    public String get(@PathVariable("id")int id){
        return eurekaTestService.get(id);
    }
}
