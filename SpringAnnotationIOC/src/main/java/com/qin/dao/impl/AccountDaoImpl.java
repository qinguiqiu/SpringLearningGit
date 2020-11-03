package com.qin.dao.impl;

import com.qin.dao.IAccountDao;
import org.springframework.stereotype.Repository;


//持久层实现类
@Repository("accountDaoImpl")
public class AccountDaoImpl implements IAccountDao {
    public void saveAccount() {
        System.out.println("保存了账户。。。。");
    }
}
