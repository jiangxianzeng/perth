# Perth
spring boot 框架学习

## [Spring Boot 系列目录]

1. Spring Boot 基础介绍
1. Spring Boot 配置文件详解
1. Spring Boot RestFul API 统一格式返回 + 全局异常处理
1. Spring Boot 整合GraphQL


打包：
mvn package -P test -Dmaven.test.skip=true

运行：
java -jar bcs-0.0.1-SNAPSHOT.jar

##Table:
```sql
CREATE TABLE `t_user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `age` int(11) DEFAULT NULL,
  `salary` double DEFAULT NULL,
  `name` varchar(128) DEFAULT NULL,
  `nick_name` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
```
