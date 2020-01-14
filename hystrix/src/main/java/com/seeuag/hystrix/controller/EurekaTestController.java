package com.seeuag.hystrix.controller;

import com.seeuag.hystrix.service.feignclient.EurekaTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author laizh
 */
@RestController
public class EurekaTestController {
    @Autowired
    private EurekaTestService eurekaTestService;

    @RequestMapping("/eureka/get/{id}")
    public  String get(@PathVariable("id")int id){
        return eurekaTestService.get(id);
    }
}
