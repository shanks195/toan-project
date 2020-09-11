package tp.kits3.open4um.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import tp.kits3.open4um.config.ConnectionFactory;
import tp.kits3.open4um.dto.Upload;
import tp.kits3.open4um.vo.Source;
@Repository
public class UploadDao {
	public List<Upload> selectUpload(int id){
		SqlSession session = ConnectionFactory.getInstance().openSession();
		List<Upload> list = session.selectList("mappers.uploadMapper.selectUpload", id);
		session.commit();
		session.close();
		return list;
	}

	public List<Upload> selectSearch(int id, String freeText) {
		HashMap<String, Object> param = new HashMap<String, Object>();
		param.put("userid", id);
		param.put("sourcename",freeText);
		SqlSession session = ConnectionFactory.getInstance().openSession();
		List<Upload> list = session.selectList("mappers.uploadMapper.selectSearch", param);
		session.commit();
		session.close();
		return list;
	}
}
