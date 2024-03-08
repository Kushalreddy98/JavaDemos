package com.jdbc.prepared;

import java.sql.*;
import java.util.Scanner;

public class PreInsert {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String username = "root";
        String password = "root";
        String sql="insert into cab values(?,?,?,?,?,?)";
        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement statement = connection.prepareStatement(sql);
             ) {
            Scanner sc=new Scanner(System.in);
           for(int i=0;i<5;i++){
               System.out.println("Enter cab number");
               int cabNumber=sc.nextInt();
               System.out.println("Enter cab drop location");
               String drop=sc.next();
               System.out.println("Enter cab pickup location");
               String pickup=sc.next();
               System.out.println("Enter cab pickup time");
               String timestamp=sc.next();//"16:00:00";
               System.out.println("Enter cab pickup date");
               String date=sc.next();//"2024-03-07";
               System.out.println("Enter cab driver name");
               String driverName=sc.next();

               statement.setInt(1,cabNumber);
               statement.setString(2,drop);
               statement.setString(3,pickup);
               statement.setTime(4,Time.valueOf(timestamp));
               statement.setDate(5,Date.valueOf(date));
               statement.setString(6,driverName);
               boolean result=statement.execute();
               System.out.println(result);
           }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
