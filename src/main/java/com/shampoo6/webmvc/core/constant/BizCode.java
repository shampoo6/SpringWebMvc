package com.shampoo6.webmvc.core.constant;

public enum BizCode {
    Success("业务成功"),
    Failure("业务失败"),
    DuplicateKeyError("重复键异常"),
    MinGanCi("敏感词异常");

    private String msg;

    BizCode(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
