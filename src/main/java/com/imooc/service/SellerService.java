package com.imooc.service;

import com.imooc.dataobject.SellerInfo;

/**
 * 卖家端
 * Created by 54060 on 2018/9/5.
 */
public interface SellerService {

    /**
     * 查询
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
