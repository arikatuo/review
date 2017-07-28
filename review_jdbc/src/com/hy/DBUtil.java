package com.hy;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
    //定义数据库驱动程序
    private static final String DBDRIVER = "com.mysql.jdbc.Driver";
    //数据库连接地址
    private static final String DBURL = "jdbc:mysql://localhost:3306/school";//school表示数据库
    //数据库用户名
    private static final String DBUSER = "root";
    //电脑上的数据库密码
    private static final String DBPASS = "1996";

    public static Connection getconncetion() {
        Connection connection = null;
        try {
            Class.forName(DBDRIVER);
            DriverManager.getConnection(DBURL, DBUSER, DBPASS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void close(Statement statement, Connection connection) {
        try {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
