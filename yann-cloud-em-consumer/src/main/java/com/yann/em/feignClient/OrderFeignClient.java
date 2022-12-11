package com.yann.em.feignClient;

import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "service-provider")
public interface OrderFeignClient {

    /** 获取订单信息
     *
     * @return
     */
    @RequestMapping(value = "/api/order/getInfos", method = RequestMethod.GET)
    JSONObject getInfos();
}

