package tp.kits3.open4um.daoimpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import tp.kits3.open4um.config.ConnectionFactory;
import tp.kits3.open4um.dao.MessageDao;
import tp.kits3.open4um.vo.Message;
@Repository
public class MessageImpl implements MessageDao {
	public List<Message> selectMessageName() {
		SqlSession session = ConnectionFactory.getInstance().openSession();
		return session.selectList("mappers.messageMapper.selectmessageId");
	}

	public List<Message> selectAll(int id){
		SqlSession session = ConnectionFactory.getInstance().openSession();
		List<Message> list = session.selectList("mappers.messageMapper.selectAll", id);
		session.commit();
		session.close();
		
		return list;
	}
}
