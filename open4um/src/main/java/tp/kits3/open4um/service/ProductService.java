package tp.kits3.open4um.service;

/**
 *	@author Huu Nghia  
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tp.kits3.open4um.dao.ProductDAO;
import tp.kits3.open4um.dao.ProductDaoAdmin;
import tp.kits3.open4um.dto.ProductRoleDto;
import tp.kits3.open4um.vo.Product;

@Service
public class ProductService {
	
	@Autowired
	private ProductDAO dao;
	@Autowired
	private ProductDaoAdmin da;
	
	public List<Product> selectAll() {
		List<Product> list = dao.selectAll();
		return list;
	}
	
	public List<Product> selectExciting() {
		List<Product> list = dao.selectExciting();
		return list;
	}

	public List<Product> search(String key) {
		List<Product> list = dao.search(key);
		return list;
	}

	public List<Product> selectCount(String key) {
		List<Product> list = dao.selectCount(key);
		return list;
	}
	
//	author:Toan
	public List<ProductRoleDto> selectdanhsachbaiviet() {
		List<ProductRoleDto> list1= da.selectdanhsachBaiViet();
		return list1;
	}
//het author:Toan	
	
	

}
