package tp.kits3.open4um.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import tp.kits3.open4um.dto.ProductRoleDto;


public interface ProductDaoAdmin {
	public List<ProductRoleDto> selectdanhsachBaiViet();
}
