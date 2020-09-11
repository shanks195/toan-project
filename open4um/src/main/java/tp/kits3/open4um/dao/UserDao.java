package tp.kits3.open4um.dao;

 
import java.util.List;

import tp.kits3.open4um.dto.UserLoginDto;
import tp.kits3.open4um.vo.RoleUser;
import tp.kits3.open4um.vo.User;
/*
 * author nguyenthai
 */
public interface UserDao {
	public int insertUser(User user);
	public User selectUser(String us);
	public int insertRoleUser(RoleUser roleUser);
	public List<UserLoginDto> selectLogin(String username);
	//Thong profile
	public User selectProfile(int id); 
	public void update (User user);
}
