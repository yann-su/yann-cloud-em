package com.yann.em.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Order {
    private String orderId; // 订单 id

    private Long userId; // 用户 id

    private Date createDate; // 创建时间

    private Date updateDate; // 修改时间

    private String orderDetails; // 订单详情
}

