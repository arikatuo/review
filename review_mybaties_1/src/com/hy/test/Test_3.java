package com.hy.test;

import com.hy.dao.UserMapperOrders;
import com.hy.model.Orders;
import com.hy.model.OrdersCustom;
import com.hy.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * Created by dell on 2017/7/26.
 */
public class Test_3 {
    private SqlSessionFactory sqlSessionFactory;

    @Before //创建sqlSessionFactory
    public void setUp() throws Exception {
        String resource = "com/hy/config/SqlMapConfig.xml"; //mybatis配置文件
        //得到配置文件的流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //创建会话工厂SqlSessionFactory,要传入mybaits的配置文件的流
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void testUserMapperOrders() throws Exception {
        //获取sqlSessionFactory的代码省略了
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapperOrders userMapperOrders = sqlSession.getMapper(UserMapperOrders.class);
        List<OrdersCustom> list = userMapperOrders.findOrdersUser();
        System.out.println(list);
    }


    @Test
    public void testUserMapperOrdersResultMap() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapperOrders userMapperOrders = sqlSession.getMapper(UserMapperOrders.class);
        List<OrdersCustom> list = userMapperOrders.findOrdersUserResultMap();
        System.out.println(list);
    }

    @Test
    public void testFindOrdersAndOrderDetailResultMap() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapperOrders userMapperOrders = sqlSession.getMapper(UserMapperOrders.class);
        List<Orders> list = userMapperOrders.findOrdersAndOrderDetailResultMap();
        System.out.println(list);
    }

    @Test
    public void findUserAndItemsResultMap() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapperOrders userMapperOrders = sqlSession.getMapper(UserMapperOrders.class);
        List<User> list = userMapperOrders.findUserAndItemsResultMap();
        System.out.println(list);
    }

}
