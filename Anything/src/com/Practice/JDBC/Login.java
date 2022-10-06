// Login subsystem with jdbc and mysql.
// Success. Use built-in methods for comparing.

package com.Practice.JDBC;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class Login {
    private static String databaseConnectionURL = "jdbc:mysql://127.0.0.1:3306/project278";
    private static String user = "root";
    private static String password = "first92992%sqlme8*:";

    public static void main(String[] args) {
        if (isValid("Kiron", "logKiron"))
            System.out.println("Yes, validated.");
        else System.out.println("In-valid credentials.");
    }

    public static boolean isValid(String username, String passWord) {
        try {
//            Load the jdbc driver which will mediate between database and my java program.
            Class.forName("com.mysql.cj.jdbc.Driver");

//            Get connected with database.
            Connection connection = DriverManager.getConnection(databaseConnectionURL, user, password);

//            Create a statement.
            Statement statement = connection.createStatement();

//            Perform a query and store in a resultset.
            ResultSet resultSet = statement.executeQuery("SELECT username, password FROM user WHERE username='" + username + "'and password='" + passWord + "';");

            while (resultSet.next()) {
                String a = resultSet.getString(1), b = resultSet.getString(2);
                if (a.equals(username) && b.equals(passWord)) {
                    System.out.println("User authenticated.");
                    return true;
                }
            }

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}