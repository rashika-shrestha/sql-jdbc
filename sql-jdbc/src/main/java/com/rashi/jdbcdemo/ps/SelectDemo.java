package com.rashi.jdbcdemo.ps;

import com.rashi.jdbcdemo.util.DbConnectionUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDemo {

    public static final String SQL = "select * from user_tbl where id=?";

    public static void main(String[] args) {
        try (
                PreparedStatement ps = DbConnectionUtil.getConnection().prepareStatement(SQL);
        ) {
            ps.setInt(1, 3);
            ResultSet rs  = ps.executeQuery();
            while(rs.next()){
                System.out.print("id is: "+rs.getInt("id"));
                System.out.println(" username is: "+rs.getString("user_name"));
                System.out.println("==============");
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
