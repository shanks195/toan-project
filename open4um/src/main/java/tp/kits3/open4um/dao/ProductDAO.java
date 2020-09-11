package tp.kits3.open4um.dao;

/**
 *	@author Huu Nghia 
 */
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import tp.kits3.open4um.config.ConnectionFactory;
import tp.kits3.open4um.vo.Product;

@Repository
public class ProductDAO {

	public List<Product> selectAll() {
		SqlSession session = ConnectionFactory.getInstance().openSession();
		return session.selectList("mappers.productMapper.selectAll");
	}
	
	public List<Product> selectExciting() {
		SqlSession session = ConnectionFactory.getInstance().openSession();
		return session.selectList("mappers.productMapper.selectExciting");
	}

	public List<Product> search(String key) {
		SqlSession session = ConnectionFactory.getInstance().openSession();
		List<Product> list = session.selectList("mappers.productMapper.search",key);
		session.commit();
		session.close();
		return list;
	}

	public List<Product> selectCount(String key) {
		SqlSession session = ConnectionFactory.getInstance().openSession();
		List<Product> list = session.selectList("mappers.productMapper.selectCount",key);
		session.commit();
		session.close();
		return list;
	}

}
