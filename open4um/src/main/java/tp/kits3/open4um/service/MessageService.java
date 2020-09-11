package tp.kits3.open4um.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tp.kits3.open4um.config.ConnectionFactory;
import tp.kits3.open4um.dao.MessageDao;
import tp.kits3.open4um.daoimpl.MessageImpl;
import tp.kits3.open4um.vo.Message;

@Service
public class MessageService {
	@Autowired
	private MessageImpl dao;
	
	public List<Message> selectAll(int id) {
	return dao.selectAll(id);
	}
	//<!--Author:Toan-->

		public List<Message> selectMessageName() {
			// TODO Auto-generated method stub
			List<Message> list2 = dao.selectMessageName();
			return list2;
		}

		

}
