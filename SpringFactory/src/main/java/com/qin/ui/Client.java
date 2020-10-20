package com.qin.ui;

import com.qin.service.IAccountService;
import com.qin.service.impl.AccountServiceImpl;

//模拟一个表现层用于调用业务层
public class Client {

    public static void main(String[] args){
        IAccountService as = new AccountServiceImpl();
        as.saveAccount();
    }
}
