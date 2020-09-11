package tp.kits3.open4um.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tp.kits3.open4um.dao.UserDao;
import tp.kits3.open4um.daoimpl.UserImpl;
import tp.kits3.open4um.dto.UserLoginDto;
import tp.kits3.open4um.dto.UserRoleDto;
import tp.kits3.open4um.vo.RoleUser;
import tp.kits3.open4um.vo.User;

/*
 * author nguyenthai
 */
@Service
public class UserService implements UserDao{
	
	@Autowired
	private UserImpl dao;
	public int insertUser(User user) {
		return dao.insertUser(user);
	}
	public int insertRoleUser(RoleUser roleUser) {
		return dao.insertRoleUser(roleUser);	
	}
	public List<UserLoginDto> selectLogin(String username) {
		UserImpl userImpt = new UserImpl();
		return userImpt.selectLogin(username);
	}
	public User selectUser(String us) {
		return dao.selectUser(us);
	}
	//Thong profile
	public User selectProfile(int id) {		
		return dao.selectProfile(id) ;
	}
	public void update(User user) {
		dao.update(user);
	}
	
//<!--Author:Toan-->
	public List<User> selectuserName() {
		List<User> list = dao.selectUserName();
		return list;
	}

	
	public List<UserRoleDto> selectthanhviencu(){
		List<UserRoleDto> list1= dao.selectThanhviencu();
		return list1;
	}
}
