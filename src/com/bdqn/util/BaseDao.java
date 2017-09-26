package com.bdqn.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 * @version 1.0
 * @author Zeus
 *
 */
public class BaseDao {
	private String name;

	/**
	 * 获得数据库连接
	 * @return 返回连接
	 */
	public Connection getConnection(){
		return null;
	
	}
	
	/**
	 * 关闭资源
	 * @param conn 要关闭的Connection
	 * @param stat 要关闭的Statement
	 * @param rs 要关闭的ResultSet
	 */
	public void closeAll(Connection conn,Statement stat,ResultSet rs){
		if(conn!=null){}
	}
}
