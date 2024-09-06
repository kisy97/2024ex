package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import common.JDBCUtil;
import vo.MoneyVO;
import vo.MemberVO;

public class MemberDao {

	/*
	 * //========== 회원목록조회 ========================================
	 */
	public ArrayList<MemberVO> getMemberList() {

		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		// DB
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM member_servlet";

		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setCustno(rs.getInt("custno"));
				vo.setCustname(rs.getString("custname"));
				vo.setPhone(rs.getString("phone"));
				vo.setAddress(rs.getString("address"));
				vo.setJoindate(rs.getDate("joindate"));
				vo.setGrade(rs.getString("grade"));
				vo.setCity(rs.getString("city"));

				String grade = rs.getString("grade");
				if (grade.equalsIgnoreCase("A"))
					grade = "VIP";
				else if (grade.equalsIgnoreCase("B"))
					grade = "일반";
				else if (grade.equalsIgnoreCase("C"))
					grade = "직원";
				else
					grade = "오류";
				vo.setGrade(grade);

				list.add(vo);
			}
		} catch (SQLException e) {
			System.out.println("----------회원목록조회중 오류---------- ");
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}

		return list;
	}

	/*
	 * //========== 회원_번호_조회 ========================================
	 */
	public int getMaxCustNo() {

		int custno = 0;
		// DB
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT MAX(custno)+1 max_no FROM member_servlet";

		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				custno = rs.getInt("max_no");
			}
		} catch (SQLException e) {
			System.out.println("----------회원_번호_조회중 오류---------- ");
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}

		return custno;
	}

	/*
	 * //========== 회원목록추가 ========================================
	 */
	public int insertMember(MemberVO vo) {

		int result = 0;
		// DB
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO member_servlet VALUES(?, ?, ?, ?, ?, ?, ?)";

		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getCustno());
			pstmt.setString(2, vo.getCustname());
			pstmt.setString(3, vo.getPhone());
			pstmt.setString(4, vo.getAddress());
			pstmt.setDate(5, vo.getJoindate());
			pstmt.setString(6, vo.getGrade());
			pstmt.setString(7, vo.getCity());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("----------회원목록추가중 오류---------- ");
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt);
		}

		return result;
	}

	/*
	 * //========== 선택한 회원조회 ========================================
	 */
	public MemberVO getMemberData(int custno) {

		MemberVO vo = new MemberVO();
		// DB
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM member_servlet where custno=?";

		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, custno);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				vo.setCustno(rs.getInt("custno"));
				vo.setCustname(rs.getString("custname"));
				vo.setPhone(rs.getString("phone"));
				vo.setAddress(rs.getString("address"));
				vo.setJoindate(rs.getDate("joindate"));
				vo.setGrade(rs.getString("grade"));
				vo.setCity(rs.getString("city"));
			}
		} catch (SQLException e) {
			System.out.println("----------선택한 회원조회중 오류---------- ");
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}

		return vo;
	}

	/*
	 * //========== 회원 정보 수정 ========================================
	 */
	public int updateMember(MemberVO vo) {

		int result = 0;

		Connection conn = null;
		PreparedStatement pstmt = null;
		//ResultSet rs = null;
		String sql = "UPDATE member_servlet \r\n"
				+ "SET custname=?, phone=?, address=?, joindate=?, grade=?, city=? \r\n" + "WHERE custno=?";

		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getCustname());
			pstmt.setString(2, vo.getPhone());
			pstmt.setString(3, vo.getAddress());
			pstmt.setDate(4, vo.getJoindate());
			pstmt.setString(5, vo.getGrade());
			pstmt.setString(6, vo.getCity());
			pstmt.setInt(7, vo.getCustno());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("----------회원목록수정중 오류---------- ");
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt);
		}

		return result;
	}

	/*
	 * //========== 회원삭제 ========================================
	 */
	public int deleteMember(int custno) {

		int result = 0;

		Connection conn = null;
		PreparedStatement pstmt = null;
		//ResultSet rs = null;
		String sql = "DELETE FROM member_servlet WHERE custno = ?";

		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, custno);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("----------회원삭제중 오류---------- ");
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt);
		}

		return result;
	}

	/*
	 * //========== 회원 매출 조회 ========================================
	 */
	public ArrayList<MoneyVO> getMoneyList() {

		ArrayList<MoneyVO> list = new ArrayList<MoneyVO>();

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT A.custno, A.custname, A.grade, SUM(B.price) sum_price \r\n"
				+ "FROM member_servlet A, money_servlet B \r\n" + "WHERE A.custno = B.custno \r\n"
				+ "GROUP BY A.custno, A.custname, A.grade \r\n" + "ORDER BY sum_price DESC";

		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				MoneyVO vo = new MoneyVO();
				vo.setCustno(rs.getInt("custno"));
				vo.setCustname(rs.getString("custname"));
				vo.setPrice(rs.getInt("sum_price"));

				String grade = rs.getString("grade");
				if (grade.equalsIgnoreCase("A"))
					grade = "VIP";
				else if (grade.equalsIgnoreCase("B"))
					grade = "일반";
				else if (grade.equalsIgnoreCase("C"))
					grade = "직원";
				else
					grade = "오류";
				vo.setGrade(grade);

				list.add(vo);
			}
		} catch (SQLException e) {
			System.out.println("----------회원 매출 조회중 오류---------- ");
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}

		return list;
	}

}
