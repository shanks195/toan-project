package tp.kits3.open4um.dto;

import org.springframework.stereotype.Component;

@Component
public class UserLoginDto {
	private Integer userid;

    private String username;

    private String password;

    private String status;
    
    private int roleid;
    
    private String roleaccount_name;

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getRoleid() {
		return roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

	public String getRoleaccount_name() {
		return roleaccount_name;
	}

	public void setRoleaccount_name(String roleaccount_name) {
		this.roleaccount_name = roleaccount_name;
	}
    
    
}
