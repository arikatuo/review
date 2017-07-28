package com.hy.java;

/**
 * Created by dell on 2017/7/27.
 * <p>
 * Spring第一个HelloWorld
 *
 * @author 林炳文（邮箱ling20081005@126.com 博客：http://blog.csdn.net/evankaka）
 * @time 2015.4.1
 */
/**
 * Spring第一个HelloWorld
 * @author 林炳文（邮箱ling20081005@126.com 博客：http://blog.csdn.net/evankaka）
 * @time 2015.4.1
 */

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    private String who = null;

    public static void main(String[] args) {
        //获取Spring的ApplicationContext配置文件，注入IOC容器中
        //(Map: key:String, bean标签的id属性值 ==>value:Object, bean标签class属性所指类的实例)
        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld hw1 = (HelloWorld) factory.getBean("hello");//map.get("hello")
        System.out.println(hw1.getInfo());
        System.out.println(hw1);

    }
}
