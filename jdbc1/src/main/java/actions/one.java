package actions;
import java.sql.*;
import dao.MySQLCon;

class one {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Connection con=MySQLCon.getConnection();
		PreparedStatement stmt=con.prepareStatement("select * from customer");
		
		ResultSet rset=stmt.executeQuery();
		
		while(rset.next())
			System.out.println(rset.getString(1)+"\t"+rset.getString(2)+"\t"+rset.getString(3));
		
		
	}

}
