package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.NamingException;

import util.ConnectionPool;

public class MemoDAO {
	   public boolean insert(String uid, String ume) 
			   throws NamingException, SQLException{
		   Connection conn = null;         // DB연결
		   PreparedStatement stmt = null;  // SQL구문
		   //결과값 필요 x
		   conn=ConnectionPool.get();
		   String sql="INSERT INTO memo(id,memo) VALUES(?,?)";
		   
		   stmt=conn.prepareStatement(sql);
		   		stmt.setNString(1, uid); // (sql 구문에 몇번째 물음표, 넣을 문자)
		   		stmt.setNString(2, ume);
		   		
		   //결과 성공 1 실패 0
		   int result=stmt.executeUpdate();
		   return result==1;
		   
	   }
}







