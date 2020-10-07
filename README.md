#Netflix版
# 1、服务注册与发现
## 1.1、eureka
## 1.2、zookeeper
## 1.3、consul

# 2、负载均衡Ribbon

## 2.1、概念
- 客户端负载均衡和服务转发工具。
- 替换：spring-cloud-balancer
- 本地负载均衡。
- Ribbon+RestTemplate
## 2.2、负载均衡策略及切换
### 2.2.1、负载均衡策略
#### 2.2.1.1、AvailabilityFilteringRule：
过滤故障服务，选择并发少的服务
#### 2.2.1.2、BestAvailableRule
过滤多次故障或处于断路器状态的服务，选择并发少的服务
#### 2.2.1.3、RandomRule
随机规则。
#### 2.2.1.4、RetryRule
先轮询，失败后重试
#### 2.2.1.5、RoundRobinRule
轮询规则。
#### 2.2.1.6、WeightedResponseTimeRule
扩展RoundRobinRule，选择响应快的服务。
#### 2.2.1.7、ZoneAvoidanceRule
区域可用性。
## 2.2.2、更换默认策略
### 2.2.2.1、创建策略配置
- 不在被@ComponentScan 扫描
- 新建
### 2.2.2.2、启动类增加配置
`@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MySelfRule.class)`
### 2.2.2.3、RandomRule


# 3、负载均衡OpenFeign
## 3.1、