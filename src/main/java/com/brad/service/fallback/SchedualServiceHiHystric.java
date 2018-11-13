package com.brad.service.fallback;

import com.brad.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @author zhoubd
 * @Date 2018/11/13 11:33
 * @@Description
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
