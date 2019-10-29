package com.jiahao;

import com.jiahao.ClassPathXml.ClassPathXmlApplicationContext;
import com.jiahao.server.IocDaoService;

public class Ioc {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("src/bean.xml");
        IocDaoService ids=(IocDaoService)applicationContext.getBean("iocService");
        ids.sayhello();
    }
}
