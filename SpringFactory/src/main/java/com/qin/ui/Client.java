package com.qin.ui;

import com.qin.factory.BeanFactory;
import com.qin.service.IAccountService;
import com.qin.service.impl.AccountServiceImpl;

//模拟一个表现层用于调用业务层
public class Client {

    public static void main(String[] args){
//        IAccountService as = new AccountServiceImpl();
        for (int i = 0; i <= 4; i++) {
            //此时为多例，并非单例
            IAccountService as = (IAccountService) BeanFactory.getBean("accountService");
            System.out.println(as);
//            as.saveAccount();
        }
    }
}
