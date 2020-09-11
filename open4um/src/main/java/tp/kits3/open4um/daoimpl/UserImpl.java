package tp.kits3.open4um.daoimpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import tp.kits3.open4um.config.ConnectionFactory;
import tp.kits3.open4um.dao.UserDao;
import tp.kits3.open4um.dto.UserLoginDto;
import tp.kits3.open4um.dto.UserRoleDto;
import tp.kits3.open4um.vo.RoleUser;
import tp.kits3.open4um.vo.User;

/*
 * author nguyenthai
 */
@Repository
public class UserImpl implements UserDao {

	public int insertUser(User user) {
		SqlSession session = ConnectionFactory.getInstance().openSession();
		int row = session.insert("mappers.userMapper.insertUser", user);
		session.commit();
		session.close();
		return row;
	}

	public User selectUser(String us) {
		SqlSession session = ConnectionFactory.getInstance().openSession(); 
		User user = session.selectOne("mappers.userMapper.selectOne", us);
		session.commit();
		session.close();
		return user;
	}

	public int insertRoleUser(RoleUser roleUser) {
		SqlSession session = ConnectionFactory.getInstance().openSession();
		int row = session.insert("mappers.roleuserMapper.insertRoleUser", roleUser);
		session.commit();
		session.close();
		return row;
	}
	public List<UserLoginDto> selectLogin(String username) {
		SqlSession session = ConnectionFactory.getInstance().openSession();
		List<UserLoginDto> list = session.selectList("mappers.userLoginMapper.selectLogin", username);
		session.commit();
		session.close();
		return list;	 
	}
//Thong profile
	@Override
	public User selectProfile(int id) {
		SqlSession session = ConnectionFactory.getInstance().openSession();
		User list = session.selectOne("mappers.userMapper.selectProfile", id);
		session.commit();
		session.close();
		return list ;
	}
	public void update(User user) {
		SqlSession session = ConnectionFactory.getInstance().openSession();
		session.update("mappers.userMapper.update", user);
		session.commit();
		session.close();
	}
	//author:Toan
	public List<User> selectUserName() {
		SqlSession session1 = ConnectionFactory.getInstance().openSession();
		List<User> list = session1.selectList("mappers.userMapper.selectCountUserId");
		System.out.println("aaaa" +  list.size());
		session1.commit();
		session1.close();
		return list;
	}


public List<UserRoleDto> selectThanhviencu() {
	SqlSession session2 = ConnectionFactory.getInstance().openSession();
	List<UserRoleDto> list1 = session2.selectList("mappers.userroleMapper.selectThanhviencu");
	session2.commit();
	session2.close();
	return list1;
}

}
