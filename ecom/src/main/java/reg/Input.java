package reg;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MySQLCon;

/**
 * Servlet implementation class Input
 */
@WebServlet("/input")
public class Input extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Input() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @throws IOException 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String uid=request.getParameter("uid");
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String pswd=request.getParameter("pswd");
		String cpswd=request.getParameter("cpswd");
		String email=request.getParameter("email");
		String cont=request.getParameter("no");
		String add=request.getParameter("add");
		String pcode=request.getParameter("pcode");
		String city=request.getParameter("city");
		String state=request.getParameter("state");
		
		out.println("uid="+uid);
		
		Connection con=MySQLCon.getConnection();

		try {
			PreparedStatement stmt=con.prepareStatement("insert into ecom(uid,fname,lname,pswd,cpswd,email,con,address,pcode,city,state) values(?,?,?,?,?,?,?,?,?,?,?)");
			
			int ui=Integer.parseInt(uid);
			stmt.setInt(1, ui);
			stmt.setString(2, fname);
			stmt.setString(3, lname);
			stmt.setString(4, pswd);
			stmt.setString(5, cpswd);
			stmt.setString(6, email);
			stmt.setString(7, cont);
			stmt.setString(8, add);
			
			int pc=Integer.parseInt(pcode);
			stmt.setInt(9, pc);
			stmt.setString(10, city);
			stmt.setString(11, state);
			
			int k=stmt.executeUpdate();
			if(k!=0)
				System.out.println("success");
			else
				System.out.println("failure");
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
