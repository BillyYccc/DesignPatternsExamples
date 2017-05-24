package com.billyyccc.facadedemo.subsystem;

import com.billyyccc.facadedemo.bean.Product;

/**
 * Created by Billy Yuan on 2017/5/24.
 * Email: billy112487983@gmail.com
 */

public class WarehouseService {
    public boolean isAvailable(Product product) {
        //check whether product in warehouse is available
        System.out.println("Product-->" + product.getProductName() + "  in No.1 warehouse is available...");
        return true;
    }
}
