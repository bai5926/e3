package com.example.orderfeign.service;

import com.example.orderfeign.service.impl.FeignFallBackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@FeignClient(name = "service-member",fallback = FeignFallBackService.class)
public interface MemberFeign {

    @RequestMapping("/getALL")
    List<String> getAll();
}
