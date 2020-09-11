package tp.kits3.open4um.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tp.kits3.open4um.dao.OrderDAO;

import tp.kits3.open4um.vo.OrderHistory;

@Service
public class OrderHistoryService {

	

	public List<OrderHistory> selectOrderHistoryName() {
		List<OrderHistory> list3 = OrderDAO.selectOrderHistoryName();
		// TODO Auto-generated method stub
		return list3;
	}

}
