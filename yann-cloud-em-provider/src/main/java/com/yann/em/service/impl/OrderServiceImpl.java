package com.yann.em.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yann.em.entity.Order;
import com.yann.em.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class OrderServiceImpl implements OrderService {
    /** 获取订单信息
     *
     * @return
     */
    @Override
    public JSONObject getInfos() {
        Order order = new Order();
        order.setOrderId("1");
        order.setUserId(1L);
        order.setCreateDate(new Date());
        order.setUpdateDate(new Date());
        order.setOrderDetails("订单详情");
        return JSONObject.parseObject(JSON.toJSONString(order));
    }
}
