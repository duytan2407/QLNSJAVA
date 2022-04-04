/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectToSql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Admin
 */
public class Database {
  public static final  String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=AAA;"
          + "user=sa;password=9091314";
  public static Connection getDBConnect()
  {     Connection conn = null;
      try
      {
          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      }
      catch(Exception e )
      {
          System.out.println("Chua co diver!"+ e.toString());
      }
      try {
          conn = DriverManager.getConnection(connectionUrl);
          return conn;
      } catch (Exception e) {
          System.out.println("loi ket noi"+ e.toString());
      }
      return null;
  }

  
}
    
