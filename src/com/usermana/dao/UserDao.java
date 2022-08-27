package com.usermana.dao;


import com.usermana.entity.User;
import com.usermana.util.ConnectionUtil;
import com.usermana.util.Constant;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class UserDao {

    public void save(User user)  {
            Connection connection = ConnectionUtil.getConnection();
        try {
            PreparedStatement stmt  = connection.prepareStatement(Constant.SQL_INSERT_USER);
            stmt.setString(1, user.getUserName());
            stmt.setString(2, user.getPassWord());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
