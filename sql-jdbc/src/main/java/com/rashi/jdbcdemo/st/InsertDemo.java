package com.rashi.jdbcdemo.st;

import com.rashi.jdbcdemo.util.DbConnectionUtil;

import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {
    public static final String SQL = "insert into user_tbl(user_name)values('aaa')";

    public static void main(String[] args) {
        try (
                Statement st = DbConnectionUtil.getConnection().createStatement();
        ) {
            st.executeUpdate(SQL);
            System.out.println("data inserted");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
