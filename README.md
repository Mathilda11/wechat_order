Spring Boot点餐系统
===========
项目设计
------
#### 角色划分
* 买家
* 卖家
#### 功能分析
* 商品
  商品列表
* 订单
  订单创建 订单查询 订单取消 …
* 类目
  订单管理 商品管理 类目管理 …
#### MySQL数据库设计
* 类目表(product_category) 
* 商品表(product_info) 
* 订单主表(order_master) 
* 订单详情表(order_detail) 
* 卖家信息表(order_detail)

#### 项目详情
##### 技术支持
* 日志：logback  
* 持久层：JPA 
* 后端模板：freemarker
* 消息推送：WebSocket 
##### 买家端
* 开发顺序dao->service->api 分别进行单元测试
##### 卖家端
* 登录/登出操作，使用redis和cookie存储用户信息
* 用户访问商品列表等时需要校验，使用AOP
##### 压测
* 使用简易工具Apache ab
##### 秒杀
* Reids实现分布式锁
##### Redis缓存
* 命中@Cacheable
* 失效@CacheEvict
* 更新@CachePut
