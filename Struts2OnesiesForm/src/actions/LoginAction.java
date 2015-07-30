package actions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private String user;
	private String password;
	private String name;

	public String execute() {
		String ret = ERROR;
		Connection conn = null;

		try {
			conn = DBUtils.getConnection();
			String sql = "SELECT userid FROM OnesiesMember WHERE";
			sql+=" USERID = ? AND PASSWORD = ?";
			System.out.println(sql);
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, user);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			System.out.println(user);
			System.out.println(password);

			while (rs.next()) {
				name = rs.getString(1);
				System.out.println(name);
				System.out.println(user);
				ret = SUCCESS;
				
			}
		} catch (Exception e) {
			ret = ERROR;
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
				}
			}
		}
		return ret;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String username) {
		this.user = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
