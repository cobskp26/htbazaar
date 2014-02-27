
	package dao;
	import java.sql.*;

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
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/enum","root","tushar");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			}
		return con;
		}

	}


