package com.imooc.dto;

import lombok.Data;

/**
 * Created by 54060 on 2018/9/3.
 */
@Data
public class CartDTO {
    private String productId;
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
