import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Save")  
public class Database extends HttpServlet {  
  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)  
                            throws ServletException, IOException {  
		
		 response.setContentType("text/html");  
		 
		 PrintWriter out=response.getWriter();  
		
 
		 String name=request.getParameter("firstname");
		 String email=request.getParameter("email");
		 String pass1=request.getParameter("password1");
		 //String pass2=request.getParameter("password2");

		 
		 String phno=request.getParameter("number");
		 
		 out.print(phno);
          
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/PracticeCheck","root","password-1");
			
			//here PracticeName is database name, root is username and password is password-1  
			
			Statement stmt=con.createStatement();  
			 
			 String sql = "INSERT INTO table1 VALUES ('"+name+"','"+email+"','"+pass1+"','"+phno+"');";
			 
		   stmt.executeUpdate(sql);
		    
		//	ResultSet rs=stmt.executeQuery(sql);  
			
			//while(rs.next())  
			//	{
			//	out.print(rs.getInt(1)+"<br>"+rs.getString(2)+"<br>"+rs.getString(3)+"<br>"+rs.getString(4)+"<br>"+rs.getString(5));  
				
			//	}
			
			con.close();  
			}catch(Exception e){ System.out.println(e);}  
		
		
			RequestDispatcher rd=request.getRequestDispatcher("/AddProduct.jsp");
			 rd.include(request, response);
			 
			}  

	
 
  
        
    }  