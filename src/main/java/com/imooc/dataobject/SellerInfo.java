package com.imooc.dataobject;

import lombok.Data;
import javax.persistence.Id;

import javax.persistence.Entity;

/**
 * Created by 54060 on 2018/9/5.
 */
@Data
@Entity
public class SellerInfo {

    @Id
    private String sellerId;

    private String username;

    private String password;

    private String openid;
}
