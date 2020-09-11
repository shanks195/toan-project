package tp.kits3.open4um.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import tp.kits3.open4um.config.ConnectionFactory;
import tp.kits3.open4um.vo.HistoryMoney;

@Repository
public class HistoryMoneyDao {
	public List<HistoryMoney> selectAll(int id){
		SqlSession session = ConnectionFactory.getInstance().openSession();
		List<HistoryMoney> list = session.selectList("mappers.historymoneyMapper.selectAll", id);
		session.commit();
		session.close();
		return list;
	}

	public List<HistoryMoney> selectSearch(int id, String searchInput) {
		HashMap<String, Object> param = new HashMap<String, Object>();
		param.put("userid", id);
		param.put("searchInput", searchInput);
		 SqlSession session = ConnectionFactory.getInstance().openSession();
		List<HistoryMoney> list = session.selectList("mappers.historymoneyMapper.selectSearch", param);
		session.commit();
		session.close();
		return list;
	}
}
