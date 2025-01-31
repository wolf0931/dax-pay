package org.dromara.daxpay.service.entity.allocation.transaction;

import java.util.List;

/**
 * 分账订单和分账明细
 * @author xxm
 * @since 2024/11/14
 */
public record TransactionAndDetail(AllocTransaction transaction,
List<AllocDetail> details) {}
