package com.qin.service.impl;

import com.qin.dao.IAccountDao;
import com.qin.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

//账户业务层实现类
@Controller("accountServiceImpl")
public class AccountServiceImpl implements IAccountService {

    /*
    注解
    用于创建对象的
        和在xnl中bean标签实现的功能一样的
        @Component:
            用于把当前对象存入Spring容器中
            属性：
                value 用于指定bean的id,当我们不写时，他的默认值是当前类名，且首字母小写
        @Controller 一般用于表现层
        @Service  一般用于业务层
        @Repository  一般用于持久层
        以上3个注解的作用和属性与Component是一摸一样的。他们三个是Spring框架为我们提供明确的三层使用的注解
        是我们的三层框架更加清晰

     用于注入数据的
        和xml配置文件中的bean标签中写一个《property》标签的作用一样的
        @Autowired:
            作用：自动按照类型注入。只要容器中有唯一的一个bean对象类型和要注入的变量类型匹配，就可以注入成功。
                 如果IOC容器中由多个类型匹配时，就需要对象名来判别
            出香位置：
                可以是成员，也可以是变量
            细节：
                在使用注解注入时，set方法就不是必须的
        @Qualifier：
            作用：在按照类中注解注入的基础上在按照名称注入。他给类成员参数注入是不能单独使用，但是再给方法参数注入是可以。
            属性：
                value ：用于指定bean的id

        @Resource
            作用：直接按照bean的id注入，可以独立使用
            属性：
                name：用于指定bean的id
        以上3中类型都只能注入其他bean类的数据，而基本类型和String类型无法使用上述注解实现。

        @Value
            作用：用于注入基本类型和String类型的数据
            属性：
                value：用于指定数据的值，他可以使用Spring中的SpEl（也就是Spring的el表达式）
                SpEl的写法，${表达式}

    用于改变作用防伪的：
        作用就和在bean标签中使用scope属性实现的功能一样
        @Scope
            作用 用于指定bean的作用范围
            属性：
                value：指定范围的取值。常用取值，singLeton， prototype
    和生命周期相关
        和bean标签中使用init-method 和 destory-method的作用是一样的
        @PreDestory
            用于指定销毁
        @PostConstruct
            用于指定初始化
     */
    @Autowired
    @Qualifier("accountDao")
//    @ImportResource(name = "accountDao")
    public IAccountDao accountDao = null;

//    public AccountServiceImpl(){
//        System.out.println("对象初始化。。。");
//    }

    public void saveAccount() {
        accountDao.saveAccount();
    }

}

