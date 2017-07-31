package com.hy.java;

import com.hy.model.TeachFile;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
/**
 * Created by dell on 2017/7/31.
 */
public class TeacherFileTest {
    public static void main(String[] args) {
        Resource res = new ClassPathResource("applicationContext.xml");
        BeanFactory bf = new XmlBeanFactory(res);
        TeachFile tf1 = (TeachFile) bf.getBean("teachFile1");
        TeachFile tf2 = (TeachFile) bf.getBean("teachFile2");
        TeachFile tf3 = (TeachFile) bf.getBean("teachFile3");
        TeachFile tf4 = (TeachFile) bf.getBean("teachFile4");


        System.out.println("默认情况下，通过'ref’来装配bean");
        tf1.print();
        System.out.println("根据byName自动装配bean");
        tf2.print();
        System.out.println("根据byType自动装配bean");
        tf3.print();
        System.out.println("根据constructor自动装配bean");
        tf4.print();

    }
}
