package tp.kits3.open4um.dao;

import java.util.List;

import tp.kits3.open4um.vo.Source;

/*
 * author nguyenthai
 */
public interface SourceDao {
	public List<Source> ListSources();
	public List<Source> selectSourceName();
}
