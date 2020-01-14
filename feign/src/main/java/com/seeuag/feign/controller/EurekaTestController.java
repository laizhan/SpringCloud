package com.seeuag.feign.controller;

import com.seeuag.feign.service.feignclient.EurekaTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaTestController {

    @Autowired
    private EurekaTestService eurekaTestService;

    /**
     * 测试Eureka接口
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/eureka/get/{id}", method = RequestMethod.GET)
    public String get(@PathVariable("id") int id) {
        return eurekaTestService.get(id);
    }
}
