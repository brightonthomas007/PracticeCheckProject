import java.io.IOException;

import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ProductSave")  
public class ProductDatabase extends HttpServlet {  
  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)  
                            throws ServletException, IOException {  
		
		 response.setContentType("text/html");  
		 

		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/PracticeCheck","root","password-1");
			
			//here PracticeName is database name, root is username and password is password-1  
			
			Statement stmt=con.createStatement();  
			 
			 String productid=request.getParameter("productid");
			 String name=request.getParameter("Name");
			 String category=request.getParameter("Category");
			 String discription=request.getParameter("Discription"); 
			 String price=request.getParameter("Price");
			 String brand=request.getParameter("Brand");
			 
			 String rating=request.getParameter("Rating");
			 
			 String sql = "INSERT INTO product VALUES ('"+productid+"','"+category+"','"+name+"','"+discription+"','"+price+"','"+brand+"','"+rating+"');";
			 
			
		     stmt.executeUpdate(sql);
		    
		//	ResultSet rs=stmt.executeQuery(sql);  
			
			//while(rs.next())  
			//	{
			//	out.print(rs.getInt(1)+"<br>"+rs.getString(2)+"<br>"+rs.getString(3)+"<br>"+rs.getString(4)+"<br>"+rs.getString(5));  
				
			//	}
			
			con.close();  
			}
		catch(Exception e)
		{ 
			e.printStackTrace();
			}  
		
		
			RequestDispatcher rd=request.getRequestDispatcher("/AddProduct.jsp");
			rd.include(request, response);
			 
			}  

	
 
  
        
    }  