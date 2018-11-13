package com.brad.controller;

import com.brad.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoubd
 * @Date 2018/11/13 10:11
 * @@Description
 */
@RestController("/")
public class HiController {
    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @GetMapping("hi")
    public String sayHi(@RequestParam String name) {
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
