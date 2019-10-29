package com.jiahao.server;

import com.jiahao.bean.IocDao;

public class IocDaoServiceImpl implements IocDaoService {
    private IocDao iocDao;  //创建一个接口.

    //编写IocDao接口对应的set方法用于依赖注入
    //依赖注入的方式有三种：接口注入，构造方法注入，set注入;
    //此处为set注入
    public void setIocDao(IocDao iocDao) {
        this.iocDao = iocDao;
    }
    public IocDao getIocDao() {
        return iocDao;
    }
    @Override
    public void sayhello() {
        // TODO Auto-generated method stub
        iocDao.sayhello();//调用接口方法
    }

}
