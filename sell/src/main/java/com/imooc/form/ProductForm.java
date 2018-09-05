package com.imooc.form;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by 54060 on 2018/9/5.
 */
@Data
public class ProductForm {

    private String productId;

    private String productName;

    private BigDecimal productPrice;

    private Integer productStock;

    private String productDescription;

    private String productIcon;

    private Integer categoryType;

}
