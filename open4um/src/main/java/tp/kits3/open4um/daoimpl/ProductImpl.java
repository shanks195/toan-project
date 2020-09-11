package tp.kits3.open4um.daoimpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import tp.kits3.open4um.config.ConnectionFactory;

import tp.kits3.open4um.dao.ProductDaoAdmin;
import tp.kits3.open4um.dto.ProductRoleDto;
import tp.kits3.open4um.vo.Product;
@Repository
public class ProductImpl  implements ProductDaoAdmin{
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
//	author:toan
	public List<ProductRoleDto> selectdanhsachBaiViet() {
		SqlSession session = ConnectionFactory.getInstance().openSession();
		List<ProductRoleDto> list = session.selectList("mappers.productroleMapper.selectdanhsachBaiViet");
		session.commit();
		session.close();
		return list;
		// TODO Auto-generated method stub
//het author:Toan
}
}
