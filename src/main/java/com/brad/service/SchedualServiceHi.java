package com.brad.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhoubd
 * @Date 2018/11/13 10:08
 * @@Description
 */
@FeignClient(value = "${micro-service.name}")
public interface SchedualServiceHi {
    @GetMapping("/hi")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
