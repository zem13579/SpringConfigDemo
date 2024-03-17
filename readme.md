## Spiring Cloud config 实例
### 1.使用方式
请在启动配置上添加程序实参（非虚拟机参数）,两处服务都需要配置
```agsl
--spring.config.name=application-dev 
```
![img.png](doc/img.png)

### 2.为了使用spring-bus作为广播渠道，需要部署MQ,官方支持Rabbit和kafka,这里以Rabbit为例子部署本地，需要安装docker
```shell
# latest RabbitMQ 3.13
docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.13-management
```
打开 http://localhsot:15672 查看管理端口 输入密码guest/guest 

### 3.启动顺序 先configserver 后 configclient，configclient2

### 4.实现效果
相比与不带bus的版本，可以实现刷新一个 http://127.0.0.1:8083/actuator/bus-refresh/ 后所有的客户端都会刷新 ，但还是属于半自动，无法实现全自动
因为在springconfig的设计中应该由git的webhock来充当扳机，触发接口。

参考文档 https://www.cnblogs.com/fengzheng/p/11242128.html