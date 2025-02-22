package com.baxianguohai.hetao.service.controller;

import com.baxianguohai.hetao.service.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 订单主表
 *
 * @author code-generator
 * @date 2019-12-02 17:44:43
 */
@Slf4j
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/order/save")
    public String save(String userId, String productId) {
        String save = orderService.save(userId, productId);
        return save;
    }
}
