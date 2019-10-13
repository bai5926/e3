package com.example.orderfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Component
@FeignClient(name = "service-member")
public interface MemberFeign {

    @RequestMapping("/getALL")
    List<String> getAll();
}
