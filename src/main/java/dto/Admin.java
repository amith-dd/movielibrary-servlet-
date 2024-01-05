package dto;

public class Admin {
	
	private int adminid;
	private String adminname;
	private long admincontact;
	private String adminmail;
	private String adminpassword;
	public int getAdminid() {
		return adminid;
	}
	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}
	public long getAdmincontact() {
		return admincontact;
	}
	public void setAdmincontact(long admincontact) {
		this.admincontact = admincontact;
	}
	public String getAdminmail() {
		return adminmail;
	}
	public void setAdminmail(String adminmail) {
		this.adminmail = adminmail;
	}
	public String getAdminpassword() {
		return adminpassword;
	}
	public void setAdminpassword(String adminpassword) {
		this.adminpassword = adminpassword;
	}
	@Override
	public String toString() {
		return "Admin [adminid=" + adminid + ", adminname=" + adminname + ", admincontact=" + admincontact
				+ ", adminmail=" + adminmail + ", adminpassword=" + adminpassword + "]";
	}
	
	
	
}
