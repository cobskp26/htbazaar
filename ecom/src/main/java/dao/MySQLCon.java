package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLCon {


	static Connection con;
	static 
	{
		try
		{
			Class.forName("com.mysql.JDBC.driver");
				
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
	
	}
public static Connection getConnection()
{
	try{
	if((con==null)||(con.isClosed()))	
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecom","root","tushar");
	}
	catch(SQLException e)
	{
		e.printStackTrace();
		}
	return con;
	}

}
