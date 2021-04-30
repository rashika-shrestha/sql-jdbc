package com.rashi.jdbcdemo.st;

import com.rashi.jdbcdemo.util.DbConnectionUtil;

import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableDemo {

    public static final String SQL = "create table user_tbl(id int not null auto_increment, user_name varchar(50), primary key(id))";


    public static void main(String[] args) {
        try (
                Statement st = DbConnectionUtil.getConnection().createStatement();
        ) {
            st.executeUpdate(SQL);
            System.out.println("table created!!!");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
