# `一、spring常用依赖`

```xml
<!-- junit -->
<dependency>
   <groupId>junit</groupId>
   <artifactId>junit</artifactId>
   <version>4.12</version>
</dependency>

<!-- mybatis -->
<dependency>
   <groupId>org.mybatis</groupId>
   <artifactId>mybatis</artifactId>
   <version>3.5.2</version>
</dependency>

<!-- mysql -->
<dependency>
   <groupId>mysql</groupId>
   <artifactId>mysql-connector-java</artifactId>
   <version>5.1.47</version>
</dependency>

<!-- spring -->
<dependency>
   <groupId>org.springframework</groupId>
   <artifactId>spring-webmvc</artifactId>
   <version>5.1.10.RELEASE</version>
</dependency>
<dependency>
   <groupId>org.springframework</groupId>
   <artifactId>spring-jdbc</artifactId>
   <version>5.1.10.RELEASE</version>
</dependency>

<!-- spring aop -->
<dependency>
   <groupId>org.aspectj</groupId>
   <artifactId>aspectjweaver</artifactId>
   <version>1.9.4</version>
</dependency>

<!-- spring-mybayis -->
<dependency>
   <groupId>org.mybatis</groupId>
   <artifactId>mybatis-spring</artifactId>
   <version>2.0.2</version>
</dependency>

<!-- lombok -->
<dependency>
   <groupId>org.projectlombok</groupId>
   <artifactId>lombok</artifactId>
   <version>1.16.10</version>
</dependency>

<!--log4j日志输出-->
<dependency>
   <groupId>log4j</groupId>
   <artifactId>log4j</artifactId>
   <version>1.2.17</version>
</dependency>

<!-- 配置Maven静态资源过滤问题 -->
    <build>
        <resources>
            <resource>
                <directory>src/main/java</directory>
                <includes>
                    <include>**/*.properties</include>
                    <include>**/*.xml</include>
                </includes>
                <filtering>false</filtering>
            </resource>
            <resource>
                <directory>src/main/resources</directory>
                <includes>
                    <include>**/*.properties</include>
                    <include>**/*.xml</include>
                </includes>
                <filtering>false</filtering>
            </resource>
        </resources>
    </build>
```

# `二、Spring 配置文件->头文件`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xmlns:aop="http://www.springframework.org/schema/aop"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
            http://www.springframework.org/schema/beans/spring-beans.xsd
            http://www.springframework.org/schema/context
            http://www.springframework.org/schema/context/spring-context.xsd
            http://www.springframework.org/schema/aop
            http://www.springframework.org/schema/aop/spring-aop.xsd">

    <context:annotation-config/>
    <aop:aspectj-autoproxy />
</beans>
```

# `三、Spring 常用注解`

## 	@Autowired（自动注入）

```xml
@Autowired：先byType，当对象不唯一时使用 Qualifier(value="对象名")
    @Resource：先byName （属于J2EE范围）
    Autowired和Resource都可以作用于属性、set方法上面
    工作中常用@Autowired注解
    Autowired注解注意点：
        1.xml配置文件需要引入头文件地址
            xmlns:context="http://www.springframework.org/schema/context"
            xmlns:aop="http://www.springframework.org/schema/aop"
            http://www.springframework.org/schema/context
            http://www.springframework.org/schema/context/spring-context.xsd
            http://www.springframework.org/schema/aop
            http://www.springframework.org/schema/aop/spring-aop.xsd
        2.开启自动装配
            <context:annotation-config/>
```

## @Component（自动注入）

```
@Component（自动装配）
	@Component相当于配置文件里面的  <bean id="dog" class="com.oay.pojo.Dog"/>
        @Component三个衍生注解
        为了更好的进行分层，Spring可以使用其它三个注解，功能一样，目前使用哪一个功能都一样。
        @Controller：web层
        @Service：service层
        @Repository：dao层
```

## @Configuration（配置类）

```
@Configuration相当于配置XX.xml，作用于类上面
    @bean：在方法上加上bean注解，注册bean，相当于id属性，方法的返回值相当于class属性
        @bean
        public User getUser(){
            return new User();
        }
```

## @scope（作用域）

```
	scope("signtolen")：默认的，Spring会采用单例模式创建这个对象。关闭工厂 ，所有的对象都会销毁。
    scope("prototypr")：多例模式。关闭工厂 ，所有的对象不会销毁。内部的垃圾回收机制会回收。
```

## @Import

```
	Import：配置文件引入，相当于两个bean配置文件整合在一起，@Import(UserConfig.class)
```

# `四、Spring IOC`

```
控制反转IoC(Inversion of Control)，是一种设计思想，DI(依赖注入)是实现IoC的一种方法，也有人认为DI只是IoC的另一种说法。没有IoC的程序中我们使用面向对象编程对象的创建与对象间的依赖关系完全硬编码在程序中，对象的创建由程序自己控制，控制反转后将对象的创建转移给第三方，个人认为所谓控制反转就是：获得依赖对象的方式反转了。
```



# `五、代理模式 (代理的对象一定要是接口)`

```html
代理模式：   (spring-07-proxy --------> demo2)
    静态代理：（使用了set方法代理）
        静态代理的好处:
            可以使得我们的真实角色更加纯粹 . 不再去关注一些公共的事情 .
            公共的业务由代理来完成 . 实现了业务的分工 ,
            公共业务发生扩展时变得更加集中和方便 .
        缺点 :
            类多了 , 多了代理类 , 工作量变大了 . 开发效率降低 .
            我们想要静态代理的好处，又不想要静态代理的缺点，所以 , 就有了动态代理 !
    动态代理
        动态代理的好处
            静态代理有的它都有，静态代理没有的，它也有！
            可以使得我们的真实角色更加纯粹 . 不再去关注一些公共的事情 .
            公共的业务由代理来完成 . 实现了业务的分工 ,
            公共业务发生扩展时变得更加集中和方便 .
            一个动态代理 , 一般代理某一类业务
            一个动态代理可以代理多个类，代理的是接口！
```

# `六、Spring AOP    (spring-08-aop ---- applicationContext.xml)`
```tex
第一种实现方式通过Spring的API接口实现
第二章实现方式通过自定义类来实现
第三种实现方式通过注解实现 （两种实现方式：接口，类，
    默认使用jdk接口实现 <aop:aspectj-autoproxy proxy-target-class="false"/> ，
    <aop:aspectj-autoproxy proxy-target-class="true"/> 使用cglib实现）。
**Spring AOP：不改变原来代码的情况下，实现代码的增强。**
```

# `七、Spring-mybatis (Spring整合mybatis)`
    官网地址：http://mybatis.org/spring/zh/index.html
    1.实体类
    2.接口
    3.配置mybatis
    4.Spring整合mybatis
    5.测试调用

# `八、Spring 事务`
    事务四个属性ACID原则
        原子性（atomicity）
            事务是原子性操作，由一系列动作组成，事务的原子性确保动作要么全部完成，要么完全不起作用
        一致性（consistency）
            一旦所有事务动作完成，事务就要被提交。数据和资源处于一种满足业务规则的一致性状态中
        隔离性（isolation）
            可能多个事务会同时处理相同的数据，因此每个事务都应该与其他事务隔离开来，防止数据损坏
        持久性（durability）
            事务一旦完成，无论系统发生什么错误，结果都不会受到影响。通常情况下，事务的结果被写到持久化存储器中