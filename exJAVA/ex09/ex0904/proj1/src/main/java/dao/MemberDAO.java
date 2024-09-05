package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import common.DBUtils;
import vo.MemberVO;

public class MemberDAO {
	
	// 회원목록 조회
	public ArrayList<MemberVO> getMember() {
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		//DB
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		conn = DBUtils.getConnection();
		String sql = "SELECT custno, custname, phone, address, joindate,\r\n"
				+ "	decode(grade, 'A','VIP', 'B','일반', 'C','직원') grade, city\r\n"
				+ "from member_servlet\r\n"
				+ "order by custno";
		
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			while (rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setCustno(rs.getInt("custno"));
				vo.setCustname(rs.getString("custname"));
				vo.setPhone(rs.getString("phone"));
				vo.setAddress(rs.getString("address"));
				vo.setJoindate(rs.getDate("joindate"));
				vo.setGrade(rs.getString("grade"));
				vo.setCity(rs.getString("city"));
				list.add(vo);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("------------회원목록조회중 오류------------");
			e.printStackTrace();
		} finally {
			DBUtils.close(conn, psmt, rs);
		}
		
		return list;
	}

	// 회원 번호 조회
	public int getMaxNo() {
		int nextCustNO = 0;
		
		//DB
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		conn = DBUtils.getConnection();
		String sql = "select max(custno)+1 nextCustNO from member_servlet";
		
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				nextCustNO = rs.getInt("nextCustNO");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("---------회원 번호 조회중 오류------------");
			e.printStackTrace();
		} finally {
			DBUtils.close(conn, psmt, rs);
		}
		
		return nextCustNO;
	}

	// 회원 목록 추가
	public int insertMember(MemberVO vo) {
		int result = 0;
		
		Connection conn = null;
		PreparedStatement psmt = null;
		conn = DBUtils.getConnection();
		String sql = "insert into member_servlet\r\n"
				+ "values(?,?,?,?,?,?,?)";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, vo.getCustno());
			psmt.setString(2, vo.getCustname());
			psmt.setString(3, vo.getPhone());
			psmt.setString(4, vo.getAddress());
			psmt.setDate(5, vo.getJoindate());
			psmt.setString(6, vo.getGrade());
			psmt.setString(7, vo.getCity());
			result = psmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("-------------회원목록추가중 오류");
			e.printStackTrace();
		} finally {
			DBUtils.close(conn, psmt);
		}
		
		return result;
	}
	
	// 선택한 회원 조회
	public MemberVO getMemberSelected(int custno) {
		
		MemberVO vo = new MemberVO();
		//DB
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		conn = DBUtils.getConnection();
		String sql = "SELECT * FROM member_servlet WHERE custno=" + custno;
		
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			if (rs.next()) {
				vo.setCustno(rs.getInt("custno"));
				vo.setCustname(rs.getString("custname"));
				vo.setPhone(rs.getString("phone"));
				vo.setAddress(rs.getString("address"));
				vo.setJoindate(rs.getDate("joindate"));
				vo.setGrade(rs.getString("grade"));
				vo.setCity(rs.getString("city"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("------------선택한 회원조회중 오류-----------");
			e.printStackTrace();
		} finally {
			DBUtils.close(conn, psmt, rs);
		}
		
		return vo;
	}
	
	// 회원목록 수정
	public int updateMember(MemberVO vo) {
		
		int result = 0;
		
		Connection conn = null;
		PreparedStatement psmt = null;
		conn = DBUtils.getConnection();
		String sql = "update member_servlet\r\n"
				+ "set custname=?, phone=?, address=?, joindate=?, grade=?, city=?\r\n"
				+ "where custno=?";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getCustname());
			psmt.setString(2, vo.getPhone());
			psmt.setString(3, vo.getAddress());
			psmt.setDate(4, vo.getJoindate());
			psmt.setString(5, vo.getGrade());
			psmt.setString(6, vo.getCity());
			psmt.setInt(7, vo.getCustno());
			result = psmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("------------회원목록 수정 중 오류--------------");
			e.printStackTrace();
		} finally {
			DBUtils.close(conn, psmt);
		}
		
		return result;
	}

	// 회원삭제
	public int deleteMember(int custno) {
		int result = 0;
		
		Connection conn = null;
		PreparedStatement psmt = null;
		conn = DBUtils.getConnection();
		String sql = "delete from member_servlet where custno=?" ;
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, custno);
			result = psmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("------------회원 삭제중 오류-------------");
			e.printStackTrace();
		} finally {
			DBUtils.close(conn, psmt);
		}
		
		return result;
	}
}
