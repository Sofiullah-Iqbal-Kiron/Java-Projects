/*
package com.RA.GUI;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class frmlogin extends JFrame
{

    private JPanel contentPane;
    private JTextField textField;
    private JPasswordField passwordField;
    private JFrame frame;
    private java.sql.Connection con;
    private JRadioButton alumni;
    private JRadioButton admin1;


    */
/**
     * Launch the application.
     *//*

    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                try
                {
                    frmlogin frame = new frmlogin();
                    frame.setVisible(true);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
    }

    */
/**
     * Create the frame.
     *//*

    public frmlogin()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 583, 515);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 0, 0));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JLabel lblNewLabel = new JLabel("LOGIN");
        lblNewLabel.setForeground(new Color(218, 165, 32));
        lblNewLabel.setFont(new Font("Malgun Gothic Semilight", Font.BOLD, 32));

        textField = new JTextField();
        textField.setColumns(10);

        passwordField = new JPasswordField();

        JLabel lblNewLabel_1 = new JLabel("NAME");
        lblNewLabel_1.setForeground(new Color(218, 165, 32));
        lblNewLabel_1.setFont(new Font("Malgun Gothic Semilight", Font.BOLD, 16));

        JLabel lblNewLabel_2 = new JLabel("PASSWORD");
        lblNewLabel_2.setForeground(new Color(218, 165, 32));
        lblNewLabel_2.setFont(new Font("Malgun Gothic Semilight", Font.BOLD, 16));

        JButton btnNewButton = new JButton("LOGIN");
        btnNewButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                if (textField.getText().isEmpty() || passwordField.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(frame, "PLEASE ENTER YOUR INFORMATION");

                }
                else
                {
                    try
                    {
                        String user = textField.getText();
                        String pass = String.valueOf(passwordField.getPassword());
                        Class.forName("com.mysql.jdbc.Driver");
                        con = (java.sql.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306" +
                                "/alumnimanagement", "root", "");
                        if (alumni.isSelected())
                        {
                            PreparedStatement stat = (PreparedStatement) con.prepareStatement("SELECT * from " +
                                    "alumni where name=? and password=?");
                            stat.setString(1, user);
                            stat.setString(2, pass);
                            ResultSet res = (ResultSet) stat.executeQuery();
                            if (res.next())
                            {
                                alumniaccount acc = new alumniaccount();
                                acc.show();
                                dispose();
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(frame, "INVALID NAME OR PASSWORD");
                            }
                        }
                        else
                        {
                            PreparedStatement stat = (PreparedStatement) con.prepareStatement("SELECT * from " +
                                    "admin where NAME=? and password=?");
                            stat.setString(1, user);
                            stat.setString(2, pass);
                            ResultSet res = (ResultSet) stat.executeQuery();
                            if (res.next())
                            {
                                adminaccount adacc = new adminaccount();
                                adacc.show();
                                dispose();
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(frame, "INVALID NAME OR PASSWORD");
                            }
                        }

                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                }

            }
        });
        btnNewButton.setForeground(new Color(0, 0, 0));
        btnNewButton.setBackground(new Color(218, 165, 32));
        btnNewButton.setFont(new Font("Malgun Gothic Semilight", Font.BOLD, 11));

        JButton btnNewButton_1 = new JButton("BACK");
        btnNewButton_1.setForeground(new Color(0, 0, 0));
        btnNewButton_1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                frmwelcome frm = new frmwelcome();
                frm.show();
                dispose();
            }
        });
        btnNewButton_1.setFont(new Font("Malgun Gothic Semilight", Font.BOLD, 11));
        btnNewButton_1.setBackground(new Color(218, 165, 32));

        JRadioButton alumni = new JRadioButton("Alumni");
        alumni.addActionListener(arg0 -> {
            AbstractButton btn = (AbstractButton) arg0.getSource();
            if (btn != null && btn.isSelected())
            {
                admin1.setSelected(false);
            }
        });
        alumni.setBackground(new Color(0, 0, 0));
        alumni.setForeground(new Color(218, 165, 32));

        JRadioButton admin1 = new JRadioButton("Admin");
        admin1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                if (admin1.isSelected())
                {
                    alumni.setSelected(false);
                }
            }
        });
        admin1.setForeground(new Color(218, 165, 32));
        admin1.setBackground(new Color(0, 0, 0));
        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane.createSequentialGroup().addGap(239).addComponent(lblNewLabel_2).addContainerGap(236, Short.MAX_VALUE)).addGroup(gl_contentPane.createSequentialGroup().addGap(227).addComponent(lblNewLabel).addContainerGap(231, Short.MAX_VALUE)).addGroup(gl_contentPane.createSequentialGroup().addGap(201).addComponent(btnNewButton).addGap(18).addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE).addContainerGap(196, Short.MAX_VALUE)).addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup().addContainerGap(172, Short.MAX_VALUE).addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane.createSequentialGroup().addGap(34).addComponent(alumni).addGap(28).addComponent(admin1)).addComponent(textField, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE).addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)).addGap(165)).addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup().addContainerGap(256, Short.MAX_VALUE).addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE).addGap(242)));
        gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane.createSequentialGroup().addGap(63).addComponent(lblNewLabel).addPreferredGap(ComponentPlacement.RELATED).addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(alumni).addComponent(admin1)).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(lblNewLabel_1).addGap(11).addComponent(textField, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(lblNewLabel_2).addPreferredGap(ComponentPlacement.RELATED).addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE).addGap(18).addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(btnNewButton).addComponent(btnNewButton_1)).addGap(117)));
        contentPane.setLayout(gl_contentPane);
    }
}*/
