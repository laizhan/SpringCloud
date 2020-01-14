package com.seeuag.hystrix.serviceimpl.feignclient;

import com.seeuag.hystrix.service.feignclient.EurekaTestService;
import org.springframework.stereotype.Component;

/**
 * @author laizh
 */
@Component
public class EurekaTestServiceImpHystrix implements EurekaTestService {

    @Override
    public String get(int id) {
        return id + ",this message send failed";
    }
}
