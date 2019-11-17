/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impound;

/**
 *
 * @author ASUS
 */

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

class test{
        public static void main(String[] args)
{       Frame f=new Frame();
        Label label1=new Label("Bill Number: ");
        Label label2=new Label("Client Name: ");
        Label label3=new Label("Amount: ");
        final TextField text1=new TextField(20);
        final TextField text2=new TextField(20);
        final TextField text3=new TextField(20);
        Button b=new Button("Update");
        b.addActionListener((java.awt.event.ActionEvent e) -> {
            String v1=text1.getText();
            String v2=text2.getText();
            String v3=text3.getText();
            int v4=Integer.parseInt(v3);
            try{
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","sanjana","sanjana");
                Statement st=con.createStatement();
                int i =st.executeUpdate("insert into bill(bill_no,client_name,amount)values('"+v1+"','"+v2+"','"+v4+"')");
                JOptionPane.showMessageDialog(null,"Data inserted successfully");
            }
            catch(Exception ex){
                System.out.println(ex);
            }
        });
        Panel p=new Panel(new GridLayout(6,2));
        p.add(label1);
        p.add(text1);
        p.add(label2);
        p.add(text2);
        p.add(label3);
        p.add(text3);
        p.add(b);
        f.add(p);
        f.setVisible(true);
        f.pack();
    }
}
        
