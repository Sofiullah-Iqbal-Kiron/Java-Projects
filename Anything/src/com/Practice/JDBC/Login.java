// Login subsystem with jdbc and mysql.

package com.Practice.JDBC;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class Login {
    private static String databaseConnectionURL = "jdbc:mysql://127.0.0.1:3306/project278";
    private static String user = "root";
    private static String password = "first92992%sqlme8*:";

    public static void main(String[] args) {
        JFrame frame = new JFrame("Log in");

        JButton b = new JButton("Hello");

        frame.getContentPane().add(b);

        frame.setLocationRelativeTo(null);
        frame.setSize(new Dimension(100, 100));
        frame.setVisible(true);

        isValid("Kiron", "logKiron");
    }

    public static void isValid(String username, String passWord) {
        try {
//            Load the driver.
            Class.forName("com.mysql.cj.jdbc.Driver");

//            Get the connection.
            Connection connection = DriverManager.getConnection(databaseConnectionURL, user, password);

//            Create a statement.
            Statement statement = connection.createStatement();

//            Perform a query and store in a resultset.
            ResultSet resultSet = statement.executeQuery("SELECT username, password FROM user WHERE username='" + username + "'and password='" + passWord + "'");

            while (resultSet.next()) {
                String a = resultSet.getString(1), b = resultSet.getString(2);
                if (a == username && b == passWord) {
                    System.out.println("User authenticated.");
                    break;
                }
            }

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}