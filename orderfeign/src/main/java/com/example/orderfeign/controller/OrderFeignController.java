package com.example.orderfeign.controller;


import com.example.orderfeign.service.MemberFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderFeignController {
    @Autowired
    private MemberFeign memberFeign;

    @RequestMapping("/getAllByFeign")
    public List<String> getAll(){
        return memberFeign.getAll();
    }

    @RequestMapping("/getFeignMsg")
    public String getFeignMsg(){
        return "this is feign msg";
    }
}
