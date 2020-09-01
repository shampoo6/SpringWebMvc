package com.shampoo6.webmvc.core.model;

import com.shampoo6.webmvc.core.constant.BizCode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class BizResult {
    private String msg;
    private BizCode code;
    private Object data;

    public static BizResult success(Object data) {
        return builder().msg(BizCode.Success.getMsg()).code(BizCode.Success).data(data).build();
    }
}
