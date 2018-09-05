package com.imooc.service;

import com.imooc.dataobject.ProductCategory;

import java.util.List;

/**
 * Created by 54060 on 2018/9/2.
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);

}
