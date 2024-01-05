package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.Admin;

public class Dao {
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/movielibrary","root","root");
		
	}
	
	public int saveAdmin(Admin admin) throws ClassNotFoundException, SQLException {
		Connection conn = getConnection();
		PreparedStatement pst = conn.prepareStatement("insert into admin values(?,?,?,?,?)");
		pst.setInt(1, admin.getAdminid());
		pst.setString(2, admin.getAdminname());
		pst.setLong(3, admin.getAdmincontact());
		pst.setString(4, admin.getAdminmail());
		pst.setString(5,admin.getAdminpassword());
		
		return pst.executeUpdate();
	}
	
	public Admin findByEmail(String adminmail) throws ClassNotFoundException, SQLException {
		Connection conn = getConnection();
		PreparedStatement pst = conn.prepareStatement("select * from admin where adminmail=?");
		pst.setString(1, adminmail);
		ResultSet rs = pst.executeQuery();

		rs.next();
		Admin admin = new Admin();
		admin.setAdminid(rs.getInt(1));
		admin.setAdminname(rs.getString(2));
		admin.setAdmincontact(rs.getLong(3));
		admin.setAdminmail(rs.getString(4));
		admin.setAdminpassword(rs.getString(5));
		return admin;
		
		
	}
	
}
