# 单商户
## 3.0.0.bate2: 功能完善第二阶段
- 优化:
- [ ] 增加首页驾驶舱功能
- [ ] 分账功能
    - [x] 分账接收方配置
    - [ ] 分账单管理
    - [ ] 分账接口开发
- [ ] 网关配套移动端开发
    - [ ] 同步回调页
- [x] 微信通道添加单独的认证跳转地址, 处理它的特殊情况
- [x] 支付订单新增待支付状态
## 3.0.0.beta3
- [ ] 收银台台功能
  - [x] 收银台配置
    - [x] 分类配置
    - [x] 明细配置
    - [x] 聚合支付配置
  - [ ] 支持通过订单信息生成多种类型的收银台链接,
    - [ ] pc收银台
      - [ ] 扫码支付
      - [ ] 条码支付
      - [ ] 跳转支付
      - [ ] 聚合支付(生成扫码链接)
    - [ ] H5收银台
      - [ ] 跳转支付
      - [ ] ~~APP调起支付~~
      - [ ] ~~小程序支付~~
    - [ ] 聚合收银台
      - [ ] Jsapi调用
      - [ ] 跳转支付
- [x] 支付码牌功能改造
  - [x] 一个应用支持多码牌
  - [x] 码牌不再使用应用号作为标识, 使用独立的编码
  - [x] 码牌H5页面对接

## bugs
- [x] 修复 BigDecimal 类型数据序列化和签名异常问题
- [x] 获取是否订阅消息通知类型查询范围错误问题

## 任务池
- [ ] 定时同步任务频次不要太高, 预防产生过多的数据
- [ ] 退款支持以撤销的方式进行退款
- [ ] 商户应用增加启停用状态
- [ ] 商户应用应该要有一个类似删除的功能, 实现停用冻结, 但不影响数据的关联
