package com.rashi.jdbcdemo.ps;

import com.rashi.jdbcdemo.util.DbConnectionUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteDemo {

    public static final String SQL = "delete from user_tbl where id = ?";

    public static void main(String[] args) {
        try (
                PreparedStatement ps = DbConnectionUtil.getConnection().prepareStatement(SQL);
        ) {
            ps.setInt(1, 5);
            ps.executeUpdate();
            System.out.println("data deleted");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
