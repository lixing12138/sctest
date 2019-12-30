package com.lixing.eurekafeignclient.feign;

import com.lixing.eurekafeignclient.Config.EurekaClientFeign;
import org.springframework.stereotype.Component;

@Component
public class HiHystrix implements EurekaClientFeign {

    @Override
    public String sayHiFromClient(String name) {
        return "hi, " + name + "sorry, error";
    }
}
