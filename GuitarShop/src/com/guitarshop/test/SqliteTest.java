package com.guitarshop.test;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class SqliteTest {
	
		  public static void main(String[] args) throws Exception {
		    Class.forName("org.sqlite.JDBC");
		    Connection conn =
		      DriverManager.getConnection("jdbc:sqlite://d:/GuitarShop.db");
		    System.out.println(conn);//�������ݿ�����
		    
		    Statement stat = conn.createStatement();
		    ResultSet rs = stat.executeQuery("select * from Guitar");
		    
		   
		    
		    while (rs.next()) {
			      System.out.println("model = " + rs.getString(4));
		  }
		    
		    rs.close();
		    conn.close();
		  }
}
		   /* Statement stat = conn.createStatement();
		    stat.executeUpdate("drop table if exists people;");
		    stat.executeUpdate("create table people (name, occupation);");
		    PreparedStatement prep = conn.prepareStatement(
		      "insert into people values (?, ?);");

		    prep.setString(1, "Gandhi");
		    prep.setString(2, "politics");
		    prep.addBatch();
		    prep.setString(1, "Turing");
		    prep.setString(2, "computers");
		    prep.addBatch();
		    prep.setString(1, "Wittgenstein");
		    prep.setString(2, "smartypants");
		    prep.addBatch();

		    conn.setAutoCommit(false);
		    prep.executeBatch();
		    conn.setAutoCommit(true);

		    ResultSet rs = stat.executeQuery("select * from people;");
		    while (rs.next()) {
		      System.out.println("name = " + rs.getString("name"));
		      System.out.println("job = " + rs.getString("occupation"));
		    }
		    rs.close();
		    conn.close();
		  }
		}*/


