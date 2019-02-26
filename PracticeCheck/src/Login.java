import java.io.IOException;  
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  
@WebServlet("/Login")  
public class Login extends HttpServlet {  
  
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)  
                            throws ServletException, IOException {  
          
  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        
        String name1=request.getParameter("userName"); 
        String pass1=request.getParameter("passWord");
        
        
  		try{  
  			Class.forName("com.mysql.jdbc.Driver");  
  			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/PracticeCheck","root","password-1");
  			
  			//here PracticeName is database name, root is username and password is password-1  
  			
  			Statement stmt=con.createStatement();  
  			ResultSet rs=stmt.executeQuery("select * from table1 where NAME='"+name1+"'OR EMAIL='"+name1+"'AND PASSWORD='"+pass1+"';");  
  			
  			if(rs.next())  
  				{
  					//if(name1.equals(rs.getString(2))|| name1.equals(rs.getString(3))&& pass1.equals(rs.getString(4)))
  				
  				 RequestDispatcher rd=request.getRequestDispatcher("/AddProduct.jsp");
  				 rd.include(request, response);
  				 
  				}
  				else
  					{
  						out.print("Wrong Username or Password");
  					}
  						
  			con.close();  
  			}
  		catch(Exception e){ System.out.println(e);}  
  			}  
			
}





