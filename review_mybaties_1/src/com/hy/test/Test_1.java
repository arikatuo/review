package com.hy.test;

import com.hy.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * Created by dell on 2017/7/25.
 */
public class Test_1 {
    //因为接下来的测试代码中，获取sqlSession这部分都相同，所以抽取成一个方法
    public SqlSession getSession() throws IOException {

        String resource = "com/hy/config/SqlMapConfig.xml"; //mybatis配置文件

        //得到配置文件的流
        InputStream inputStream = Resources.getResourceAsStream(resource);

        //创建会话工厂SqlSessionFactory,要传入mybaits的配置文件的流
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //通过工厂得到SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        return sqlSession;
    }

    //根据id查询用户的信息，得到一条记录的结果
    @Test
    public void findUserById() throws IOException {

        SqlSession sqlSession = getSession(); //调用上面的方法获取sqlSession

        //通过SqlSession操作数据库
        //第一个参数：映射文件中statement的id，= namespace + statement的id
        //第二个参数：指定和映射文件中所匹配的parameterType类型的参数
        //selectOne表示查询出一条记录进行映射
        User user = sqlSession.selectOne("com.hy.dao.UserMapper.findUserById", 1);

        System.out.println(user);

        //释放资源，最好放在finally中，这里只是测试程序，就不弄了
        sqlSession.close();
    }


    @Test
    public void findUserByName() throws IOException {

        SqlSession sqlSession = getSession();

        //selectList表示查询出一个列表（多条记录）进行映射
        List<User> list = sqlSession.selectList("test1.findUserByName", "张三");

        System.out.println(list);

        //释放资源，最好放在finally中，这里只是测试程序，就不弄了
        sqlSession.close();
    }

    @Test
    public void insertUser() throws IOException {

        SqlSession sqlSession = getSession();

        User user = new User(1, "倪升武", new Date(), "男", "同济大学");

        sqlSession.insert("test.insertUser", user); //添加一项

        //提交事务
        sqlSession.commit();

        System.out.println(user.getId()); //获取刚刚添加的id

        //释放资源，最好放在finally中，这里只是测试程序，就不弄了
        sqlSession.close();
    }

}
