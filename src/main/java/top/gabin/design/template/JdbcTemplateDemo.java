/**
 * Copyright (c) 2016 云智盛世
 * Created with JdbcTemplateDemo.
 */
package top.gabin.design.template;

import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Class description
 *
 * @author linjiabin on  16/5/9
 */
public class JdbcTemplateDemo {
    private static JdbcTemplate jdbcTemplate;

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 这是JDBC版本
        Class.forName("com.mysql.jdbc.Driver");
        String DB_URL = "jdbc:mysql://localhost:3306/shop";
        String USER = "root";
        String PASS = "";
        Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = connection.createStatement();
        statement.executeUpdate("");
        statement.close();
        connection.close();


        // 这是Spring JDBC模板的版本
        jdbcTemplate.update("");
        jdbcTemplate.execute("");
    }

}
