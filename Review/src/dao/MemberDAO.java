package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.NamingException;

import util.ConnectionPool;

public class MemberDAO {

   public int login(String uid, String ps)
      throws NamingException, SQLException {
      
      Connection conn = null;         // DB연결
      PreparedStatement stmt = null;  // SQL구문
      ResultSet rs = null;            // SQL결과
      
      conn = ConnectionPool.get();
      
      String sql = "SELECT id, password FROM user WHERE id = ?";
      stmt = conn.prepareStatement(sql);
         stmt.setNString(1, uid);
         
      rs = stmt.executeQuery();
      
      if(!rs.next()) return 1; //아이디가 존재하지 않는 경우
      if(!ps.contentEquals(rs.getString("password"))) return 2;//비밀번호 불일치
      return 0;
   }
   
   public boolean exist(String uid) throws NamingException, SQLException{
	   Connection conn = null;         // DB연결
	   PreparedStatement stmt = null;  // SQL구문
	   ResultSet rs = null;            // SQL결과
	   conn=ConnectionPool.get();
	   
	   String sql="SELECT id FROM user WHERE id=?";
	   stmt=conn.prepareStatement(sql);
	   stmt.setNString(1, uid);
	   rs=stmt.executeQuery();
	   
	   return rs.next();
   }
   public boolean insert(String uid, String ups, String una, String uem, String uge) 
		   throws NamingException, SQLException{
	   Connection conn = null;         // DB연결
	   PreparedStatement stmt = null;  // SQL구문
	   //결과값 필요 x
	   conn=ConnectionPool.get();
	   String sql="INSERT INTO user(id, password, name,gender,email) VALUES(?,?,?,?,?)";
	   
	   stmt=conn.prepareStatement(sql);
	   		stmt.setNString(1, uid); // (sql 구문에 몇번째 물음표, 넣을 문자)
	   		stmt.setNString(2, ups);
	   		stmt.setNString(3, una);
	   		stmt.setNString(4, uge);
	   		stmt.setNString(5, uem);
	   //결과 성공 1 실패 0
	   	int result=stmt.executeUpdate();
	   return result==1;
	   
   }
   
   public boolean delete(String uid) throws NamingException, SQLException{
	   Connection conn = null;         // DB연결
	   PreparedStatement stmt = null;  // SQL구문
	             // SQL결과
	   conn=ConnectionPool.get();
	   String sql="DELETE FROM user WHERE id=?";
	   stmt=conn.prepareStatement(sql);
	   		stmt.setNString(1, uid);
	   	int result=stmt.executeUpdate();
	   	
	   return result==1;
   }
}

