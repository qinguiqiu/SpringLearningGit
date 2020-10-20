package com.qin.service.impl;

import com.qin.dao.IAccountDao;
import com.qin.dao.impl.AccountDaoImpl;
import com.qin.service.IAccountService;

//账户业务层实现类
public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao = new AccountDaoImpl();

    public void saveAccount() {
        accountDao.saveAccount();
    }
}
