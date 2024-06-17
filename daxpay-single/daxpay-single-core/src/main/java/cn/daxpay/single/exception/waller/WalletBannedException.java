package cn.daxpay.single.exception.waller;

import cn.bootx.platform.common.core.exception.BizException;
import cn.daxpay.single.code.DaxPayCommonErrorCode;

/**
 * 钱包被禁用
 *
 * @author xxm
 * @since 2020/12/8
 */
public class WalletBannedException extends BizException {

    public WalletBannedException() {
        super(DaxPayCommonErrorCode.WALLET_BANNED, "钱包被禁用");
    }

}
