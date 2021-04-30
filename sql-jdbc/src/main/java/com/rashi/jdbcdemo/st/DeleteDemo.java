package com.rashi.jdbcdemo.st;

import com.rashi.jdbcdemo.util.DbConnectionUtil;

import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDemo {

    public static final String SQL = "delete from user_tbl where id = 4";

    public static void main(String[] args) {
        try (
                Statement st = DbConnectionUtil.getConnection().createStatement();
        ) {
            st.executeUpdate(SQL);
            System.out.println("data deleted");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
