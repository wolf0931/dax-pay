package cn.daxpay.single.exception.pay;

import cn.bootx.platform.common.core.exception.BizException;
import cn.daxpay.single.code.DaxPayCommonErrorCode;

/**
 * 支付错误
 *
 * @author xxm
 * @since 2020/12/8
 */
public class PayFailureException extends BizException {

    public PayFailureException(String message) {
        super(DaxPayCommonErrorCode.PAY_FAILURE, message);
    }

    public PayFailureException() {
        super(DaxPayCommonErrorCode.PAY_FAILURE, "支付失败");
    }

}
