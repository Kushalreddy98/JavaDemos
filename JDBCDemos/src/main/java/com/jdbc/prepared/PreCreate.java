package com.jdbc.prepared;

import java.sql.*;

public class PreCreate {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String username = "root";
        String password = "root";
        String sql="create table cab(cab_number int primary key," +
                "drop_location varchar(20)," +
                "pickup varchar(20)," +
                "pickup_time time," +
                "pickup_date date," +
                "driver_name varchar(20))";
        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement statement = connection.prepareStatement(sql);) {
           boolean result=statement.execute();
            System.out.println("Table is created "+!result);


        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
