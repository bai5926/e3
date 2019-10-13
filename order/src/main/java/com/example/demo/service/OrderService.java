package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    RestTemplate restTemplate;

    public List<String> getALL(){
        String url = "http://service-member/getALL/";
        return restTemplate.getForObject(url,List.class);
    }
}
