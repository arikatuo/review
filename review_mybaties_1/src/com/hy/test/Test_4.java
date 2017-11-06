package com.hy.test;

import com.hy.dao.UserMapper;
import com.hy.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

/**
 * Created by dell on 2017/7/26.
 */
public class Test_4 {
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
    public void testCache1() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();//创建代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        //下边查询使用一个SqlSession
        //第一次发起请求，查询id为1的用户
        User user1 = userMapper.findUserById(10);
        System.out.println(user1);

//      如果sqlSession去执行commit操作（执行插入、更新、删除），清空SqlSession中的一级缓存，这样做的目的为了让缓存中存储的是最新的信息，避免脏读。

        //更新user1的信息
        user1.setName("测试用22");
        userMapper.updateUser(user1);
        //执行commit操作去清空缓存
        sqlSession.commit();

        //第二次发起请求，查询id为1的用户
        User user2 = userMapper.findUserById(10);
        System.out.println(user2);

        sqlSession.close();

    }
}
