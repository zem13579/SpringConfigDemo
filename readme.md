## Spiring Cloud config 实例
### 1. 使用方式
直接启动就好,无需添加运行参数，spring.profile.active 可以设置多个配置文件
### 2. 启动oracle 
```shell
docker run --restart always -d -p 8080:8080 -p 1521:1521 --name orac truevoly/oracle-12c

```
参考 https://www.jianshu.com/p/fb00d47ba3d9
### 3. 启动顺序 先configserver 后 configclient

### 4. 参考实现文档
> https://www.cnblogs.com/liukaifeng/p/10052583.html

> https://docs.spring.io/spring-cloud-config/reference/server/environment-repository/jdbc-backend.html