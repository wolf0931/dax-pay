package org.dromara.daxpay.single.sdk.param.channel;

import org.dromara.daxpay.single.sdk.param.ChannelParam;
import lombok.Getter;
import lombok.Setter;

/**
 * 云闪付参数
 * @author xxm
 * @since 2024/3/13
 */
@Getter
@Setter
public class UnionPayParam implements ChannelParam {

    /** 授权码(主动扫描用户的付款码) */
    private String authCode;

}
