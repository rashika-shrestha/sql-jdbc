package com.rashi.jdbcdemo.ps;

import com.rashi.jdbcdemo.util.DbConnectionUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDemo {

    public static final String SQL = "update user_tbl set user_name = ? where id = ?";

    public static void main(String[] args) {
        try (
                PreparedStatement ps = DbConnectionUtil.getConnection().prepareStatement(SQL);
        ) {
            ps.setString(1, "gopal");
            ps.setInt(2, 5);
            ps.executeUpdate();
            System.out.println("data updated");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
