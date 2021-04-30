package com.rashi.jdbcdemo.st;

import com.rashi.jdbcdemo.util.DbConnectionUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDemo {

    public static final String SQL = "select * from user_tbl";

    public static void main(String[] args) {
        try (
                Statement st = DbConnectionUtil.getConnection().createStatement();
        ) {
            ResultSet rs  = st.executeQuery(SQL);
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
