package com.imooc.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by 54060 on 2018/9/3.
 */
@Data
@Component
@ConfigurationProperties(prefix="wechat")
public class WechatAccountConfig {

    private String mpAppId;

    private String mpAppSecret;

    private String mchId;

    private String mchKey;

    private String keyPath;

    private String notifyUrl;
}
