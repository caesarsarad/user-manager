package com.usermana.util;

import javax.annotation.Resource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionUtil {
//    @Resource(name="jdbc/MySQL")
//    private static DataSource dataSource;
//
//    public static void setDataSource(DataSource dataSource) {
//        ConnectionUtil.dataSource = dataSource;
//    }

    public static  Connection getConnection() {
        try {

            Context context = new InitialContext();
            DataSource dataSource = (DataSource)context.lookup("java:comp/env/jdbc/MySQL");
            Connection conn =  dataSource.getConnection();
            System.out.println(123);

            return conn;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (NamingException e) {
            throw new RuntimeException(e);
        }
    }
}
