package com.billyyccc.facadedemo;

import com.billyyccc.facadedemo.bean.Product;
import com.billyyccc.facadedemo.subsystem.PaymentService;
import com.billyyccc.facadedemo.subsystem.ShippingService;
import com.billyyccc.facadedemo.subsystem.WarehouseService;

/**
 * Created by Billy Yuan on 2017/5/24.
 * Email: billy112487983@gmail.com
 */

public class OrderService implements OrderServiceFacade {
    private WarehouseService warehouseService;
    private ShippingService shippingService;
    private PaymentService paymentService;

    public OrderService(WarehouseService warehouseService, ShippingService shippingService, PaymentService paymentService) {
        this.warehouseService = warehouseService;
        this.shippingService = shippingService;
        this.paymentService = paymentService;
    }

    @Override
    public boolean order(int productId, String productName) {
        boolean isOrderSuccessful = false;
        Product product = new Product(productId, productName);
        if (warehouseService.isAvailable(product)) {
            if (paymentService.isPaymentSuccessful()) {
                shippingService.shipProduct(product);
                System.out.println("ProductName : "
                        + product.getProductName()
                        + ", ProductId : "
                        + product.getProductId()
                        + ", is shipped...");
                System.out.println("Order is successful...");
                isOrderSuccessful = true;
            }
        }
        return isOrderSuccessful;
    }
}
