package tp.kits3.open4um.daoimpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import tp.kits3.open4um.config.ConnectionFactory;
import tp.kits3.open4um.dao.SourceDao;
import tp.kits3.open4um.vo.Source;

/*
 * author nguyenthai
 */
@Repository
public class SourceImpl implements SourceDao {

	public List<Source> ListSources() {
		SqlSession session = ConnectionFactory.getInstance().openSession();
		List<Source> listSource = session.selectList("mappers.sourceMapper.selectAll");
		session.commit();
		session.close();
		return listSource;
	}
	@Override
	public List<Source> selectSourceName() {
		SqlSession session = ConnectionFactory.getInstance().openSession();
		List<Source> list1 = session.selectList("mappers.sourceMapper.selectCountSourceId");
		System.out.println("aaaa" +  list1.size());
		session.commit();
		session.close();
		return list1;
	}

}
