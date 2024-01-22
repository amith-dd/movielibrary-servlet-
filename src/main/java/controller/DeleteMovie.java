package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Dao;
@WebServlet("/deletemovie")
public class DeleteMovie extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		Dao dao = new Dao();
		try {
			
			HttpSession session = req.getSession();
			String adminname = (String)session.getAttribute("adminname");
			if(adminname!=null) {
				dao.deleteMovie(id);
				req.setAttribute("movies", dao.getAllMovies());
				RequestDispatcher dispatcher = req.getRequestDispatcher("home.jsp");
				dispatcher.include(req, resp);
			}
			else {
				req.setAttribute("message", "access denied, admin login required");
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
