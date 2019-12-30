package com.lixing.eurekafeignclient.Config;

import com.lixing.eurekafeignclient.feign.HiHystrix;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "client", configuration = FeignAutoConfiguration.class,fallback = HiHystrix.class)
public interface EurekaClientFeign {
    @GetMapping("/hello")
    String sayHiFromClient(@RequestParam(value = "name")String name);
}
