package com.jdbc.prepared;

import java.sql.*;
import java.time.LocalTime;

public class PreSelect {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String username = "root";
        String password = "root";
        String sql = "select * from cab where pickup=?";
        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement statement = connection.prepareStatement(sql);) {
            statement.setString(1,"btm");
            try (
                ResultSet resultSet = statement.executeQuery();
            ){
                while (resultSet.next()) {
                    int cabNumber = resultSet.getInt("cab_number");
                    String dropLocation = resultSet.getString("drop_location");
                    String pickup = resultSet.getString("pickup");
                    Time time = resultSet.getTime("pickup_time");
                    LocalTime localTime = LocalTime.parse(time.toString());
                    String pickupDate = resultSet.getString("pickup_date");
                    String driverName = resultSet.getString("driver_name");
                    System.out.println(cabNumber + "\t" + dropLocation + "\t" + pickup + "\t" + localTime + "\t" + pickupDate + "\t" + driverName);
                }
            }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
