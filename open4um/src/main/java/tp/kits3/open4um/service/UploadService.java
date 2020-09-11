package tp.kits3.open4um.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tp.kits3.open4um.dao.UploadDao;
import tp.kits3.open4um.dto.Upload;
/**
 * 
 * @author Thong
 *
 */
@Service
public class UploadService {
	@Autowired
	private UploadDao dao;
	public List<Upload> selectUpload(int id){
		return dao.selectUpload(id);
	}
	public List<Upload> selectSearch(int id, String freeText) {
		return dao.selectSearch(id, freeText);
	}
}
