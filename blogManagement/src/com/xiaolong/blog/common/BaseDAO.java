package com.xiaolong.blog.common;

import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

public class BaseDAO extends NamedParameterJdbcDaoSupport {
	
	/**
	 * 更新操作
	 */
	protected void executeUpdate(String sql){
		try {
			getJdbcTemplate().execute(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 查询
	 * @param sql
	 * @param args
	 * @param rowMapper
	 * @return
	 * @throws DBException
	 */
	protected List<Object> query(String sql, Object[] args, RowMapper<Object> rowMapper) {
			return getJdbcTemplate().query(sql, args, rowMapper);
	}
}
