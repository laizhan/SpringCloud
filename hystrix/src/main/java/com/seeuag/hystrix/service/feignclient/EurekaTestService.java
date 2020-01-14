package com.seeuag.hystrix.service.feignclient;

import com.seeuag.hystrix.serviceimpl.feignclient.EurekaTestServiceImpHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author laizh
 */
@FeignClient(value = "NETCOREEUREKA",fallback = EurekaTestServiceImpHystrix.class)
public interface EurekaTestService {
    /**
     * ²âÊÔEureka½Ó¿Ú
     * @param id
     * @return
     */
    @RequestMapping(value = "/api/values/{id}",method = RequestMethod.GET)
    String get(@PathVariable("id")int id);
}
