package com.yann.em.controller;


import com.alibaba.fastjson.JSONObject;
import com.yann.em.feignClient.OrderFeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Resource
    private OrderFeignClient orderFeignClient;

    @RequestMapping("/getInfos")
    public JSONObject getInfos() {
        return orderFeignClient.getInfos();
    }
}

