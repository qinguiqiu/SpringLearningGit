package com.qin.ui;

import com.qin.dao.IAccountDao;
import com.qin.service.IAccountService;
import com.qin.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

//模拟一个表现层用于调用业务层
public class Client {

    /*
    获取spring的IOC核心容器， 并根据ID获取对象

    ApplicationContext 的三个常用的实现类
            ClassPathXmlApplicationContext 可以加载类路径下的配置文件，要求配置文件必须在类路径下，不在的化，加载不了(常用）
            FileSystemXmlApplicationContext  可以加载磁盘人意路径下的配置文件（必须有访问全限）
            AnnotationConfigApplicationContext  用于读写注解创建文件
    核型容器的两个接口引发的问题：
    ApplicationContext：
        它在构建核心容器时，创建对象采用的策略是采用立即加载的方式。也就是说只要一读完配置文件马上就创建配置文件中配置的对象。
    BeanFactory：

     */
    public static void main(String[] args){
        //1 获取核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//        ApplicationContext ac = new FileSystemXmlApplicationContext("src/main/resources/bean.xml");
        //2 根据id获取Bean对象
        IAccountService as = (IAccountService)ac.getBean("accountService");
        IAccountDao adao = ac.getBean("accountDao", IAccountDao.class);

        System.out.println(as);
        System.out.println(adao);
        adao.saveAccount();
//        ac.saveAccount();
    }
}
