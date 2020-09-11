package tp.kits3.open4um.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import tp.kits3.open4um.config.ConnectionFactory;
import tp.kits3.open4um.vo.Message;


public interface MessageDao {
	public List<Message> selectMessageName();
	public List<Message> selectAll(int id);
	
}
