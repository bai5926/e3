package com.example.demo.controller;

import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;


    @RequestMapping("getALL")
    public List<String> getALL(){
        System.out.println("orderorderorderorderorderorderorderorderorderorderorder");
        return orderService.getALL();
    }

}
