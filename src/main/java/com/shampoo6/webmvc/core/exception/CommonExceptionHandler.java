package com.shampoo6.webmvc.core.exception;

import com.shampoo6.webmvc.core.constant.BizCode;
import com.shampoo6.webmvc.core.model.BizResult;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

@Log4j2
@ControllerAdvice
public class CommonExceptionHandler {

    @ExceptionHandler(value = BizException.class)
    @ResponseBody
    public BizResult bizExceptionHandler(HttpServletRequest req, BizException e) {
        log.error("=============================>bizExceptionHandler");
        log.error(e);
        return BizResult.builder().code(e.getBizCode()).msg(e.getMessage()).data(e.getData()).build();
    }

    @ExceptionHandler(value = org.springframework.dao.DuplicateKeyException.class)
    @ResponseBody
    public BizResult duplicateKeyExceptionHandler(HttpServletRequest req, Exception e) {
        log.error("=============================>duplicateKeyExceptionHandler");
        log.error(e);
        String msg = e.getMessage();
        String key = msg.substring(msg.indexOf("index:") + 6, msg.indexOf("dup key:")).trim();
        String value = msg.substring(msg.indexOf("dup key: { : \"") + 14, msg.indexOf("\" };")).trim();
        HashMap<String, String> data = new HashMap<>();
        data.put("key", key);
        data.put("value", value);
        return BizResult.builder().code(BizCode.DuplicateKeyError).msg(BizCode.DuplicateKeyError.getMsg()).data(data).build();
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public BizResult exceptionHandler(HttpServletRequest req, Exception e) {
        log.error("=============================>exceptionHandler");
        log.error(e);
        return BizResult.builder().code(BizCode.Failure).msg(e.getMessage()).build();
    }
}
