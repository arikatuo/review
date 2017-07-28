package com.hy;

import com.mysql.jdbc.*;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.Statement;

import static com.hy.DBUtil.*;

/**
 * Created by dell on 2017/7/20.
 */
public class JdbcUtil {
    public void createTable() {
        com.mysql.jdbc.Connection connection = getconncetion();
        Statement statement = null;

        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String sql = "CREATE TABLE student(sid INT PRIMARY KEY,sname VARCHAR(20),age INT)";

        try {
            ResultSet resultSet = statement.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        DBUtil.close(statement, connection);
    }


    public void insert(int id, String name, int age) {
        com.mysql.jdbc.Connection connection = getconncetion();

        PreparedStatement preparedStatement = null;


        String sql = "INSERT INTO student " +
                "VALUES (?,?,?)";
        try {
            preparedStatement = connection.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }


        try {
            preparedStatement.setInt(1, 2);
            preparedStatement.setString(2, "a");
            preparedStatement.setInt(3, 2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        DBUtil.close(preparedStatement, connection);
    }


}
