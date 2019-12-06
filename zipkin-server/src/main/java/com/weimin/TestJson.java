package com.weimin;

import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.nashorn.internal.objects.annotations.Where;
import org.jooq.tools.json.JSONObject;

import java.io.IOException;
import java.sql.*;

/**
 * @author weimin
 * @ClassName TestJson
 * @Description TODO
 * @date 2019/12/5 20:47
 */
public class TestJson {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://123.207.253.16:3306/miaosha?useUnicode=true&characterEncoding=UTF8&serverTimezone=GMT%2B8";
        Connection connection = DriverManager.getConnection(url, "root", "123456");
        System.out.println(connection);
        String sql = null;
        sql = "SELECT `code`,json_extract(msg,'$.sex') AS 'sex' FROM t_student;";
        sql = "SELECT `code`,msg AS 'sex' FROM t_student;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            String sex = resultSet.getString("sex");
            if(sex!=null){
                ObjectMapper objectMapper = new ObjectMapper();
                User user = objectMapper.readValue(sex, User.class);
                System.out.println(user+"--->"+sex);
            }
        }
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }
}
