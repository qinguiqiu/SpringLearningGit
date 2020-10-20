package com.qin.factory;


import java.util.Properties;

//创建Bean对象的工厂
/*
Bean在计算机英语中表示可重用组建
javaBean 不等于 实体类
javaBean 远大于实体类 表示用java语言编写的可重用组建
    它就是创建我们的service和dao对象的。

    第一个： 需要一个配置文件来配置我们的service和dao
            配置内容， 唯一标志 等于 全限定类名（key = value）
    第二个： 通过读取配置文件中的内容 反射创建对象

    我们的配置文件可以是xml 也可以是properties
 */
public class BeanFactory {
    //定义一个Properties对象
    private static Properties props;

    //使用静态代码块为Properties对象赋值
    static {
        props = new Properties();
    }
}
