package com.yann.em.Controller;


import com.alibaba.fastjson.JSONObject;
import com.yann.em.service.OrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Resource
    private OrderService orderService;

    /** 获取订单信息
     *
     * @return
     */
    @RequestMapping("/getInfos")
    public JSONObject getInfos() {
        return orderService.getInfos();
    }
}

