package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ClientController {

    @RequestMapping("/getALL")
    public List<String> getAll(){
        System.out.println("membermembermembermembermembermembermembermember");
        List<String> list = new ArrayList<>();
        list.add("aaaaaaaaaaaaaaa");
        list.add("bbbbbbbbbbbbbbb");
        list.add("ccccccccccccccc");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return list;
    };

}
