package com.shampoo6.webmvc.core.exception;

import com.shampoo6.webmvc.core.constant.BizCode;
import lombok.Data;

@Data
public class BizException extends RuntimeException {
    private BizCode bizCode;
    private Object data;

    public BizException() {
    }

    public BizException(BizCode bizCode) {
        super(bizCode.getMsg());
        this.bizCode = bizCode;
    }

    public BizException(BizCode bizCode, Object data) {
        this(bizCode);
        this.data = data;
    }
}
