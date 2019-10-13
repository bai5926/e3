package com.example.member02.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ClientController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/getALL")
    public List<String> getAll(){
        List<String> list = new ArrayList<>();
        list.add("aaaaaaaaaaaaaaa");
        list.add("bbbbbbbbbbbbbbb");
        list.add("ccccccccccccccc");
        list.add("dddddddddddddddd");
        return list;
    };

}
