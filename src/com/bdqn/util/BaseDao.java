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
	 * ������ݿ�����
	 * @return ��������
	 */
	public Connection getConnection(){
		return null;
	
	}
	
	/**
	 * �ر���Դ
	 * @param conn Ҫ�رյ�Connection
	 * @param stat Ҫ�رյ�Statement
	 * @param rs Ҫ�رյ�ResultSet
	 */
	public void closeAll(Connection conn,Statement stat,ResultSet rs){
		if(conn!=null){}
	}
}
