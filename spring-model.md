# `һ��spring��������`

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

<!--log4j��־���-->
<dependency>
   <groupId>log4j</groupId>
   <artifactId>log4j</artifactId>
   <version>1.2.17</version>
</dependency>

<!-- ����Maven��̬��Դ�������� -->
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

# `����Spring �����ļ�->ͷ�ļ�`

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

# `����Spring ����ע��`

## 	@Autowired���Զ�ע�룩

```xml
@Autowired����byType��������Ψһʱʹ�� Qualifier(value="������")
    @Resource����byName ������J2EE��Χ��
    Autowired��Resource���������������ԡ�set��������
    �����г���@Autowiredע��
    Autowiredע��ע��㣺
        1.xml�����ļ���Ҫ����ͷ�ļ���ַ
            xmlns:context="http://www.springframework.org/schema/context"
            xmlns:aop="http://www.springframework.org/schema/aop"
            http://www.springframework.org/schema/context
            http://www.springframework.org/schema/context/spring-context.xsd
            http://www.springframework.org/schema/aop
            http://www.springframework.org/schema/aop/spring-aop.xsd
        2.�����Զ�װ��
            <context:annotation-config/>
```

## @Component���Զ�ע�룩

```
@Component���Զ�װ�䣩
	@Component�൱�������ļ������  <bean id="dog" class="com.oay.pojo.Dog"/>
        @Component��������ע��
        Ϊ�˸��õĽ��зֲ㣬Spring����ʹ����������ע�⣬����һ����Ŀǰʹ����һ�����ܶ�һ����
        @Controller��web��
        @Service��service��
        @Repository��dao��
```

## @Configuration�������ࣩ

```
@Configuration�൱������XX.xml��������������
    @bean���ڷ����ϼ���beanע�⣬ע��bean���൱��id���ԣ������ķ���ֵ�൱��class����
        @bean
        public User getUser(){
            return new User();
        }
```

## @scope��������

```
	scope("signtolen")��Ĭ�ϵģ�Spring����õ���ģʽ����������󡣹رչ��� �����еĶ��󶼻����١�
    scope("prototypr")������ģʽ���رչ��� �����еĶ��󲻻����١��ڲ����������ջ��ƻ���ա�
```

## @Import

```
	Import�������ļ����룬�൱������bean�����ļ�������һ��@Import(UserConfig.class)
```

# `�ġ�Spring IOC`

```
���Ʒ�תIoC(Inversion of Control)����һ�����˼�룬DI(����ע��)��ʵ��IoC��һ�ַ�����Ҳ������ΪDIֻ��IoC����һ��˵����û��IoC�ĳ���������ʹ����������̶���Ĵ����������������ϵ��ȫӲ�����ڳ����У�����Ĵ����ɳ����Լ����ƣ����Ʒ�ת�󽫶���Ĵ���ת�Ƹ���������������Ϊ��ν���Ʒ�ת���ǣ������������ķ�ʽ��ת�ˡ�
```



# `�塢����ģʽ (����Ķ���һ��Ҫ�ǽӿ�)`

```html
����ģʽ��   (spring-07-proxy --------> demo2)
    ��̬������ʹ����set��������
        ��̬����ĺô�:
            ����ʹ�����ǵ���ʵ��ɫ���Ӵ��� . ����ȥ��עһЩ���������� .
            ������ҵ���ɴ�������� . ʵ����ҵ��ķֹ� ,
            ����ҵ������չʱ��ø��Ӽ��кͷ��� .
        ȱ�� :
            ����� , ���˴����� , ����������� . ����Ч�ʽ��� .
            ������Ҫ��̬����ĺô����ֲ���Ҫ��̬�����ȱ�㣬���� , �����˶�̬���� !
    ��̬����
        ��̬����ĺô�
            ��̬�����е������У���̬����û�еģ���Ҳ�У�
            ����ʹ�����ǵ���ʵ��ɫ���Ӵ��� . ����ȥ��עһЩ���������� .
            ������ҵ���ɴ�������� . ʵ����ҵ��ķֹ� ,
            ����ҵ������չʱ��ø��Ӽ��кͷ��� .
            һ����̬���� , һ�����ĳһ��ҵ��
            һ����̬������Դ������࣬������ǽӿڣ�
```

# `����Spring AOP    (spring-08-aop ---- applicationContext.xml)`
```tex
��һ��ʵ�ַ�ʽͨ��Spring��API�ӿ�ʵ��
�ڶ���ʵ�ַ�ʽͨ���Զ�������ʵ��
������ʵ�ַ�ʽͨ��ע��ʵ�� ������ʵ�ַ�ʽ���ӿڣ��࣬
    Ĭ��ʹ��jdk�ӿ�ʵ�� <aop:aspectj-autoproxy proxy-target-class="false"/> ��
    <aop:aspectj-autoproxy proxy-target-class="true"/> ʹ��cglibʵ�֣���
**Spring AOP�����ı�ԭ�����������£�ʵ�ִ������ǿ��**
```

# `�ߡ�Spring-mybatis (Spring����mybatis)`
    ������ַ��http://mybatis.org/spring/zh/index.html
    1.ʵ����
    2.�ӿ�
    3.����mybatis
    4.Spring����mybatis
    5.���Ե���

# `�ˡ�Spring ����`
    �����ĸ�����ACIDԭ��
        ԭ���ԣ�atomicity��
            ������ԭ���Բ�������һϵ�ж�����ɣ������ԭ����ȷ������Ҫôȫ����ɣ�Ҫô��ȫ��������
        һ���ԣ�consistency��
            һ��������������ɣ������Ҫ���ύ�����ݺ���Դ����һ������ҵ������һ����״̬��
        �����ԣ�isolation��
            ���ܶ�������ͬʱ������ͬ�����ݣ����ÿ������Ӧ��������������뿪������ֹ������
        �־��ԣ�durability��
            ����һ����ɣ�����ϵͳ����ʲô���󣬽���������ܵ�Ӱ�졣ͨ������£�����Ľ����д���־û��洢����