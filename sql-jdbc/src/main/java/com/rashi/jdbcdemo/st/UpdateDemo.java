package com.rashi.jdbcdemo.st;

import com.rashi.jdbcdemo.util.DbConnectionUtil;

import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo {

    public static final String SQL = "update user_tbl set user_name ='krishna' where id = 4";

    public static void main(String[] args) {
        try (
                Statement st = DbConnectionUtil.getConnection().createStatement();
        ) {
            st.executeUpdate(SQL);
            System.out.println("data updated");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
