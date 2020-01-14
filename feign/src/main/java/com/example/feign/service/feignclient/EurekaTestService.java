package com.example.feign.service.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author laizh
 */
@FeignClient(value = "NETCOREEUREKA")
public interface EurekaTestService {

    /**
     * 测试eureka接口
     * @param id
     * @return
     */
    @RequestMapping(value = "/api/values/{id}",method = RequestMethod.GET)
    String get(@PathVariable("id") int id);
}
