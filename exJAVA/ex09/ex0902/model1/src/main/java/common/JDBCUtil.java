package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.eclipse.jdt.internal.compiler.ast.ThisReference;

public class JDBCUtil {
	// db 연결
	public static Connection getConnection() {
		Connection con = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl21v","kk1","1234");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("DB 연결 실패");
			e.printStackTrace();
		}
		return con;
	}
	// 연결 닫기 psmt,con
	public static void close(Connection con, PreparedStatement psmt) {
		if(psmt!=null) {
			try {
				psmt.close();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("psmt.close() 실패");
				e.printStackTrace();
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("con.close() 실패");
					e.printStackTrace();
				}
			}
		}
	}
	
	// 연결 닫기 rs,psmt,con
	public static void close(Connection con,PreparedStatement psmt, ResultSet rs) {
		if(rs!=null) {
			try {
				rs.close();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("rs.close() 실패");
				e.printStackTrace();
			}
		}
		close(con,psmt);
	}
	
}
