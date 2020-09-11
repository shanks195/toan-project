package tp.kits3.open4um.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import tp.kits3.open4um.dao.SourceDao;
import tp.kits3.open4um.daoimpl.SourceImpl;
import tp.kits3.open4um.vo.Source;
/*
 * author nguyenthai
 */
@Service
public class SourceService {

		@Autowired
		private SourceImpl sourceImpl;
		@Autowired
		private SourceDao Sourcedao;
		
		public List<Source> ListSources(){
			return sourceImpl.ListSources();
		}
		//<!--Author:Toan-->


		public List<Source> selectsourceName() {
			List<Source> list1 = Sourcedao.selectSourceName();
			return list1;
		}
}
