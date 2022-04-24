// JDBC is an api of java for accessing database from a java program.

package com.Practice.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    private static final String dataBaseConnectionURL = "jdbc:mysql://localhost:3306/sakila";
    private static final String user = "root";
    private static final String password = "first92992%sqlme8*:";

    public static void main(String[] args) {
        //        All the jdbc code must be inside try block to handle exception.
        try {
            //            Load the driver. Previous version "com.mysql.jdbc.Driver" was deprecated.
            Class.forName("com.mysql.cj.jdbc.Driver");

            //            Get the connection of database by specifying its connection path.
            Connection connection = DriverManager.getConnection(dataBaseConnectionURL, user, password);

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM actor");

            while(resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
            }

            connection.close();
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            System.out.println(e.getClass());
        }
    }
}
