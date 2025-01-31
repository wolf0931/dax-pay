package org.dromara.daxpay.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.dromara.daxpay.core.exception.ConfigNotExistException;

import java.util.Arrays;
import java.util.Objects;

/**
 * 收银台支付调起方式
 * 1. 扫码支付
 * 2. 条码支付
 * 3. 跳转链接
 * 4. 小程序支付
 * 5. 聚合支付
 * 6. APP支付
 * @author xxm
 * @since 2024/11/27
 */
@Getter
@AllArgsConstructor
public enum CheckoutCallTypeEnum {

    QR_CODE("qr_code", "扫码支付"),
    BAR_CODE("bar_code", "条码支付"),
    LINK("link", "跳转链接"),
    MINI_APP("mini_app", "小程序支付"),
    AGGREGATE("aggregate", "聚合支付"),
    APP("app", "APP支付"),
    ;

    private final String code;
    private final String name;

    public static CheckoutCallTypeEnum findBuyCode(String code){
        return Arrays.stream(values())
                .filter(value -> Objects.equals(value.getCode(), code))
                .findFirst()
                .orElseThrow(() -> new ConfigNotExistException("不支持的收银台类型"));

    }
}
