package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import common.JDBCUtil;
import vo.MemberVO;

public class MemberDAO {

	public ArrayList<MemberVO> getMemberList() {
		ArrayList<MemberVO> list = new ArrayList<>();

		// db연결
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM member_test";

		try {
			con = JDBCUtil.getConnection();
			psmt = con.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setName(rs.getString("name"));
				vo.setTel(rs.getString("tel"));

				list.add(vo);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, psmt, rs);
		}

		return list;
	}

	public void insertMember(MemberVO vo) {
		

		Connection con = null;
		PreparedStatement psmt = null;
		String sql = "INSERT INTO member_test VALUES (?,?)";

		try {
			con = JDBCUtil.getConnection();
			psmt = con.prepareStatement(sql);
			
			psmt.setString(1, vo.getName());
			psmt.setString(2, vo.getTel());
			
			psmt.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("회원정보 입력중 예외 발생");
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, psmt);
		}
		
	}
}
