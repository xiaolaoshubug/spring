一、Spring中bean有三种装配机制，分别是：

    1.在xml中显式配置；
    2.在java中显式配置；
    3.隐式的bean发现机制和自动装配。
    
二、autowire byName (按名称自动装配)

    由于在手动配置xml过程中，常常发生字母缺漏和大小写等错误，而无法对其进行检查，使得开发效率降低
    采用自动装配将避免这些错误，并且使配置简单化。
 
三、autowire byType (按类型自动装配)

    使用autowire byType首先需要保证：同一类型的对象，在spring容器中唯一。如果不唯一，会报不唯一的异常。可以省略bean 的 id属性
    
四、使用注解自动装配

    jdk1.5开始支持注解，spring2.5开始全面支持注解。
    准备工作：利用注解的方式注入属性。
    1、在spring配置文件中引入context文件头
        xmlns:context="http://www.springframework.org/schema/context"
        http://www.springframework.org/schema/context
        http://www.springframework.org/schema/context/spring-context.xsd
    2、开启属性注解支持！
        2.1配置头文件 -> xml配置文件头
            xmlns:context="http://www.springframework.org/schema/context"
            xmlns:aop="http://www.springframework.org/schema/aop"
            
            http://www.springframework.org/schema/context
            http://www.springframework.org/schema/context/spring-context.xsd
            http://www.springframework.org/schema/aop
            http://www.springframework.org/schema/aop/spring-aop.xsd
        2.2 开启自动注入
            **<context:annotation-config/>**  必须加否则会注入失败
        2.3 @Autowired
            @Autowired是按类型自动转配的，不支持id匹配。
            需要导入 spring-aop的包
    3.开启自动装配后可以省略掉set方法
    4.@Autowired可以作用于属性上，可以作用于set方法上，一般作用于属性上
    5.【小狂神科普时间】
        @Autowired(required=false)  说明：false，对象可以为null；true，对象必须存对象，不能为null。
        //如果允许对象为null，设置required = false,默认为true
        @Autowired(required = false)
        private Cat cat;
    6.@Qualifier
        @Autowired是根据类型自动装配的，加上@Qualifier则可以根据byName的方式自动装配
        @Qualifier不能单独使用。
    7.@Resource自动注入(javax.annotation.Resource，属于J2EE)
    8.它们的作用相同都是用注解方式注入对象，但执行顺序不同。@Autowired先byType，@Resource先byName
    
    
**https://mp.weixin.qq.com/s/kvp_3Uva1J2Q5ZVqCUzEsA**