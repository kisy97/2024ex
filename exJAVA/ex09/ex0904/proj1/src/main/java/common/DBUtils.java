package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBUtils {
	public static Connection getConnection() {
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl21v","kk1","1234");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("---------------DB 연결 실패--------------");
			 e.printStackTrace();
		}
		
		return conn;
	}
	
	public static void close(Connection conn, PreparedStatement psmt) {
		if (psmt != null) {
			try {
				psmt.close();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("psmt.close 실패");
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("conn.close 실패");
				e.printStackTrace();
			}
		}
	}
	
	public static void close(Connection conn, PreparedStatement psmt, ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("rs.close 실패");
				e.printStackTrace();
			}
		}
		close(conn, psmt);
	}
}
