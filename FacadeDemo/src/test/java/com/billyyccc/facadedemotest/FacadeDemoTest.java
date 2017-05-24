package com.billyyccc.facadedemotest;

import com.billyyccc.facadedemo.OrderService;
import com.billyyccc.facadedemo.subsystem.PaymentService;
import com.billyyccc.facadedemo.subsystem.ShippingService;
import com.billyyccc.facadedemo.subsystem.WarehouseService;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Billy Yuan on 2017/5/24.
 * Email: billy112487983@gmail.com
 */

public class FacadeDemoTest {
    @Test
    public void OrderABookTest() {
        OrderService orderService = new OrderService(new WarehouseService(), new ShippingService(), new PaymentService());
        boolean orderResult = orderService.order(100001, "Thinking In Java");
        assertThat(orderResult, is(true));
    }
}