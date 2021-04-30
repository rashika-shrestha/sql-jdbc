package com.rashi.jdbcdemo.ps;

import com.rashi.jdbcdemo.util.DbConnectionUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {

    public static final String SQL = "insert into user_tbl(user_name)values(?)";

    public static void main(String[] args) {
        try (
                PreparedStatement ps = DbConnectionUtil.getConnection().prepareStatement(SQL);
        ) {
            ps.setString(1, "mohan");
            ps.executeUpdate();
            System.out.println("data inserted");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
