package com.imooc.utils;

import java.util.Random;

/**
 * Created by 54060 on 2018/9/3.
 */
public class KeyUtil {
    /**
     * 生成唯一的主键
     * 格式：时间+随机数
     * @return
     */
    public static synchronized String genUniqueKey(){
        Random random = new Random();
        int number = random.nextInt(900000) + 100000;//6位随机数

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
