package com.billyyccc.facadedemotest;

import com.billyyccc.facadedemo.OrderService;
import com.billyyccc.facadedemo.subsystem.PaymentService;
import com.billyyccc.facadedemo.subsystem.ShippingService;
import com.billyyccc.facadedemo.subsystem.WarehouseService;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Billy Yuan on 2017/5/24.
 * Email: billy112487983@gmail.com
 */

public class FacadeDemoTest {
    @Test
    public void orderBookTest() {
        OrderService orderService = new OrderService(new WarehouseService(), new ShippingService(), new PaymentService());
        boolean orderResult = orderService.order(100001, "Thinking In Java");
        assertThat(orderResult).isEqualTo(true);
    }
}
