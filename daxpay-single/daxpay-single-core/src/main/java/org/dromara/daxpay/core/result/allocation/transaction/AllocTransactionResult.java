package org.dromara.daxpay.core.result.allocation.transaction;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.experimental.Accessors;
import org.dromara.daxpay.core.enums.AllocTransactionResultEnum;
import org.dromara.daxpay.core.enums.AllocTransactionStatusEnum;
import org.dromara.daxpay.core.enums.ChannelEnum;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 分账订单返回结果
 * @author xxm
 * @since 2024/5/21
 */
@Data
@Accessors(chain = true)
@Schema(title = "分账订单返回结果")
public class AllocTransactionResult {

    /** 分账单号 */
    @Schema(description = "分账单号")
    private String allocNo;

    /** 商户分账单号 */
    @Schema(description = "商户分账单号")
    private String bizAllocNo;

    /** 通道分账号 */
    @Schema(description = "通道分账号")
    private String outAllocNo;

    /**
     * 支付订单号
     */
    @Schema(description = "支付订单号")
    private String orderNo;

    /** 商户支付订单号 */
    @Schema(description = "商户支付订单号")
    private String bizOrderNo;

    /** 通道支付订单号 */
    @Schema(description = "通道支付订单号")
    private String outOrderNo;

    /**
     * 支付订单标题
     */
    @Schema(description = "支付订单标题")
    private String title;

    /**
     * 所属通道
     * @see ChannelEnum
     */
    @Schema(description = "所属通道")
    private String channel;

    /**
     * 总分账金额
     */
    @Schema(description = "总分账金额")
    private Integer amount;

    /**
     * 分账描述
     */
    @Schema(description = "分账描述")
    private String description;

    /**
     * 状态
     * @see AllocTransactionStatusEnum
     */
    @Schema(description = "状态")
    private String status;

    /**
     * 处理结果
     * @see AllocTransactionResultEnum
     */
    @Schema(description = "处理结果")
    private String result;

    /**
     * 错误码
     */
    @Schema(description = "错误码")
    private String errorCode;

    /**
     * 错误信息
     */
    @Schema(description = "错误原因")
    private String errorMsg;

    /** 分账订单完成时间 */
    @Schema(description = "分账订单完成时间")
    private LocalDateTime finishTime;

    /** 分账明细 */
    @Schema(description = "分账明细")
    private List<AllocDetailResult> details;

}
