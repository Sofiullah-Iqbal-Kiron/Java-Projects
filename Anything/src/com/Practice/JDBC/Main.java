// JDBC is an api of java for accessing database from a java program.
/*
* If you need to connect to any other database then you need to change two things, the JDBC driver and the connection URL.
*/

package com.Practice.JDBC;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class Main {
    private static final String dataBaseConnectionURL = "jdbc:mysql://127.0.0.1:3306/sakila";
    private static final String user = "root";
    private static final String password = "first92992%sqlme8*:";

    public static void main(String[] args) {
        //        All the jdbc code must be inside try block to handle exception.
        try {
            //            Load the driver. Previous version "com.mysql.jdbc.Driver" was deprecated.
            Class.forName("com.mysql.cj.jdbc.Driver");

            //            Get the connection of database by specifying its connection path.
            Connection connection = DriverManager.getConnection(dataBaseConnectionURL, user, password);

            //            Create a statement line on this connection.
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM actor");

            int c = 0, value = 0;
            while (resultSet.next() && c++ < 2) {
                value += resultSet.getInt(1);
                System.out.println(value);
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally{

        }
    }
}