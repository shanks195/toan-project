package tp.kits3.open4um.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import tp.kits3.open4um.config.ConnectionFactory;
import tp.kits3.open4um.vo.OrderHistory;



@Repository
public class OrderDAO {
	//author:Toan
			public static List<OrderHistory> selectOrderHistoryName() {
				SqlSession session = ConnectionFactory.getInstance().openSession();
				List<OrderHistory> list3 = session.selectList("mappers.orderhistoryMapper.selectOrderHistoryId");
				System.out.println("aaaa" +  list3.size());
				session.commit();
				session.close();
				return list3;
			}

			
}
