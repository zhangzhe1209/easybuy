package com.bdqn.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class BaseDao {
	
	public Connection getConnection(){
		return null;
	}
	
	public void closeAll(Connection conn,Statement stat,ResultSet rs){
		
	}
}
