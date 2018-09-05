package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * Created by 54060 on 2018/9/3.
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message){
        super(message);
        this.code = code;

    }

}
