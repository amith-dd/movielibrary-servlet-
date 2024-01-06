package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;
import dto.Admin;
@WebServlet("/adminlogin")
public class AdminLogin extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String adminmail = req.getParameter("adminmail");
		String adminpassword= req.getParameter("adminpassword");
		
		Dao dao = new Dao();
		try {
			Admin admin = dao.findByEmail(adminmail);
			if(admin!=null) {
				if(admin.getAdminpassword().equals(adminpassword)) {
					req.setAttribute("movies", dao.getAllMovies());
					RequestDispatcher dispatcher = req.getRequestDispatcher("home.jsp");
					dispatcher.include(req, resp);
				}
				else {
					req.setAttribute("message","password is wrong");
					RequestDispatcher dispatcher = req.getRequestDispatcher("alogin.jsp");
					dispatcher.include(req, resp);
				}
			}
			else {
				req.setAttribute("message","email is wrong");
				RequestDispatcher dispatcher = req.getRequestDispatcher("alogin.jsp");
				dispatcher.include(req, resp);
			}
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
