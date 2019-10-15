package com.example.orderfeign.service.impl;

import com.example.orderfeign.service.MemberFeign;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FeignFallBackService implements MemberFeign {
    @Override
    public List<String> getAll() {
        List<String> listUser = new ArrayList<String>();
        listUser.add("not orderUser list");
        return listUser;
    }
}
