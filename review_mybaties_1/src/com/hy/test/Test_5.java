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
public class Test_5 {
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
    public void testCache2() throws Exception {
        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        SqlSession sqlSession3 = sqlSessionFactory.openSession();
        System.out.println("-----------------------0000000000000000000000-------------");
        // 创建代理对象
        UserMapper userMapper1 = sqlSession1.getMapper(UserMapper.class);
        // 第一次发起请求，查询id为1的用户
        User user1 = userMapper1.findUserById(1);
        System.out.println("-------------1111111111111111111----------------------");
        System.out.println(user1);
        //这里执行关闭操作，将sqlsession中的数据写到二级缓存区域
        sqlSession1.close();

        //sqlSession3用来清空缓存的，如果要测试二级缓存，需要把该部分注释掉
        //使用sqlSession3执行commit()操作
        UserMapper userMapper3 = sqlSession3.getMapper(UserMapper.class);
        User user = userMapper3.findUserById(1);
        user.setName("倪升");
        userMapper3.updateUser(user);
        //执行提交，清空UserMapper下边的二级缓存
        sqlSession3.commit();
        sqlSession3.close();
        System.out.println("------------------33333333333333333-----------------");
        UserMapper userMapper2 = sqlSession2.getMapper(UserMapper.class);
        // 第二次发起请求，查询id为1的用户
        User user2 = userMapper2.findUserById(1);
        System.out.println("----------22222222222222222222222222--------------------");
        System.out.println(user2);
        sqlSession2.close();

    }
}
