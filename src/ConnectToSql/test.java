/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectToSql;

import Models.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
/**
 *
 * @author Admin
 */
public class test {
    public static void main(String[] args) {
        Connection conn = Database.getDBConnect();
//        userDao dao = new  userDao();
        if(conn !=null)
        {
            System.out.println("Thanh cong");
            //User us = new User("duytan","1234","tan");
           // dao.add(us);
        }
        else
        {
            System.out.println("That bai");
        }
    }
}
