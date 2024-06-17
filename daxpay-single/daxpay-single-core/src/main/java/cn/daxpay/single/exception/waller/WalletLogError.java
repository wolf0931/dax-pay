package cn.daxpay.single.exception.waller;

import cn.bootx.platform.common.core.exception.FatalException;
import cn.daxpay.single.code.DaxPayCommonErrorCode;

/**
 * 钱包日志错误
 *
 * @author xxm
 * @since 2020/12/8
 */
public class WalletLogError extends FatalException {

    public WalletLogError() {
        super(DaxPayCommonErrorCode.WALLET_LOG_ERROR, "钱包日志错误");
    }

}
