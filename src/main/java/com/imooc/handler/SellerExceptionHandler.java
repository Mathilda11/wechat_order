package com.imooc.handler;

import com.imooc.exception.ResponseBankException;
import com.imooc.exception.SellAuthorizeException;
import com.imooc.exception.SellException;
import com.imooc.utils.ResultVOUtil;
import com.imooc.vo.ResultVO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 54060 on 2018/9/5.
 */
@ControllerAdvice
public class SellerExceptionHandler {

    //拦截登录异常
    @ExceptionHandler(value= SellAuthorizeException.class)
    public ModelAndView handlerAuthorizeException(){
        return new ModelAndView("redirect:http://mathilda.s1.natapp.cc/sell/seller/login ");
    }
    @ExceptionHandler(value=SellException.class)
    @ResponseBody
    public ResultVO handlerSellException(SellException e){
        return ResultVOUtil.error(e.getCode(),e.getMessage());

    }

    @ExceptionHandler(value= ResponseBankException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public void handlerResponseBankException(){

    }

}
