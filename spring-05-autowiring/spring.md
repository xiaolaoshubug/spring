һ��Spring��bean������װ����ƣ��ֱ��ǣ�

    1.��xml����ʽ���ã�
    2.��java����ʽ���ã�
    3.��ʽ��bean���ֻ��ƺ��Զ�װ�䡣
    
����autowire byName (�������Զ�װ��)

    �������ֶ�����xml�����У�����������ĸȱ©�ʹ�Сд�ȴ��󣬶��޷�������м�飬ʹ�ÿ���Ч�ʽ���
    �����Զ�װ�佫������Щ���󣬲���ʹ���ü򵥻���
 
����autowire byType (�������Զ�װ��)

    ʹ��autowire byType������Ҫ��֤��ͬһ���͵Ķ�����spring������Ψһ�������Ψһ���ᱨ��Ψһ���쳣������ʡ��bean �� id����
    
�ġ�ʹ��ע���Զ�װ��

    jdk1.5��ʼ֧��ע�⣬spring2.5��ʼȫ��֧��ע�⡣
    ׼������������ע��ķ�ʽע�����ԡ�
    1����spring�����ļ�������context�ļ�ͷ
        xmlns:context="http://www.springframework.org/schema/context"
        http://www.springframework.org/schema/context
        http://www.springframework.org/schema/context/spring-context.xsd
    2����������ע��֧�֣�
        2.1����ͷ�ļ� -> xml�����ļ�ͷ
            xmlns:context="http://www.springframework.org/schema/context"
            xmlns:aop="http://www.springframework.org/schema/aop"
            
            http://www.springframework.org/schema/context
            http://www.springframework.org/schema/context/spring-context.xsd
            http://www.springframework.org/schema/aop
            http://www.springframework.org/schema/aop/spring-aop.xsd
        2.2 �����Զ�ע��
            **<context:annotation-config/>**  ����ӷ����ע��ʧ��
        2.3 @Autowired
            @Autowired�ǰ������Զ�ת��ģ���֧��idƥ�䡣
            ��Ҫ���� spring-aop�İ�
    3.�����Զ�װ������ʡ�Ե�set����
    4.@Autowired���������������ϣ�����������set�����ϣ�һ��������������
    5.��С�������ʱ�䡿
        @Autowired(required=false)  ˵����false���������Ϊnull��true������������󣬲���Ϊnull��
        //����������Ϊnull������required = false,Ĭ��Ϊtrue
        @Autowired(required = false)
        private Cat cat;
    6.@Qualifier
        @Autowired�Ǹ��������Զ�װ��ģ�����@Qualifier����Ը���byName�ķ�ʽ�Զ�װ��
        @Qualifier���ܵ���ʹ�á�
    7.@Resource�Զ�ע��(javax.annotation.Resource������J2EE)
    8.���ǵ�������ͬ������ע�ⷽʽע����󣬵�ִ��˳��ͬ��@Autowired��byType��@Resource��byName
    
    
**https://mp.weixin.qq.com/s/kvp_3Uva1J2Q5ZVqCUzEsA**