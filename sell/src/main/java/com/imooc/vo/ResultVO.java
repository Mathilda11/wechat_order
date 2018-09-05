package com.imooc.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * http请求返回的最外层对象
 * Created by 54060 on 2018/9/2.
 */

@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultVO<T> {

    /** 错误码 */
    private Integer code;

    /** 提示信息 */
    private String message;

    /** 具体内容 */
    private T data;
}
