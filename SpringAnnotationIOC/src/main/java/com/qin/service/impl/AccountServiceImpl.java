package com.qin.service.impl;

import com.qin.dao.IAccountDao;
import com.qin.service.IAccountService;
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
        @Autow
     */

    public IAccountDao accountDao;

//    public AccountServiceImpl(){
//        System.out.println("对象初始化。。。");
//    }

    public void saveAccount() {
        accountDao.saveAccount();
    }

}

