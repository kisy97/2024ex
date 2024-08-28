package model1.board;

import java.util.List;
import java.util.Map;
import java.util.Vector;

import common.JDBConnect;
import jakarta.servlet.ServletContext;

public class BoardDAO extends JDBConnect {

	public BoardDAO(ServletContext application) {
		super(application);
	}

	// 검색 조건에 맞는 게시물의 개수를 반환
	public int selectCount(Map<String, Object> map) {
		int totalCount = 0; // 결과(게시물 수)를 담을 변수

		// 게시물 수를 얻어오는 쿼리문 작성
		String query = "SELECT COUNT(*) FROM board";
		if (map.get("searchWord") != null) {
			query += " WHERE " + map.get("searchField") + " " + " LIKE '%" + map.get("searchWord") + "%'";
		}

		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			rs.next();
			totalCount = rs.getInt(1);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("게시물 수를 구하는 중 예외 발생");
			e.printStackTrace();
		}
		return totalCount;
	}

	// 검색 조건에 맞는 게시물 목록 반환
	public List<BoardDTO> selectList(Map<String, Object> map) {
		List<BoardDTO> bbs = new Vector<BoardDTO>();

		String query = "SELECT * FROM board";
		if (map.get("searchWord") != null) {
			query += " WHERE " + map.get("searchField") + " " + " LIKE '%" + map.get("searchWord") + "%'";
		}
		query += " ORDER BY num DESC ";

		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				BoardDTO dto = new BoardDTO();

				dto.setNum(rs.getString("num"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setPostdate(rs.getDate("postdate"));
				dto.setId(rs.getString("id"));
				dto.setVisitcount(rs.getString("visitcount"));

				bbs.add(dto);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return bbs;
	}

	// 게시글 데이터를 받아 DB에 추가
	public int insertWrite(BoardDTO dto) {
		int result = 0;

		try {
			// INSERT 쿼리문 작성
			String query = "INSERT INTO board (" + "num,title,content,id,visitcount) " + "VALUES ("
					+ "seq_board_num.NEXTVAL, ?, ?, ?,0)";

			psmt = con.prepareStatement(query); // 동적 쿼리
			psmt.setString(1, dto.getTitle());
			psmt.setString(2, dto.getContent());
			psmt.setString(3, dto.getId());

			result = psmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("게시물 입력 중 예외 발생");
			e.printStackTrace();
			// TODO: handle exception
		}

		return result;
	}

	// 지정한 게시물을 찾아 내용을 반환
	public BoardDTO selectView(String num) {
		BoardDTO dto = new BoardDTO();

		String query = "select B.*, M.name " + "from member M " + "inner join board B " + "on M.id=B.id "
				+ "where num=?";

		try {
			psmt = con.prepareStatement(query);
			psmt.setString(1, num);
			rs = psmt.executeQuery();

			if (rs.next()) {
				dto.setNum(rs.getString("num"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setPostdate(rs.getDate("postdate"));
				dto.setId(rs.getString("id"));
				dto.setVisitcount(rs.getString(6));
				dto.setName(rs.getString("name"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("게시물 상세보기 중 예외 발생");
			e.printStackTrace();
		}

		return dto;
	}

	// 지정한 게시물 조회수를 1 증가
	public void updateVisitCount(String num) {
		// 쿼리문 준비
		String query = "update board set " + "visitcount=visitcount+1 " + "where num=?";

		try {
			psmt = con.prepareStatement(query);
			psmt.setString(1, num);
			rs = psmt.executeQuery();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("게시물 조회수 증가 중 예외 발생");
			e.printStackTrace();
		}

	}

	// 지정한 게시물을 수정
	public int updateEdit(BoardDTO dto) {
		int result = 0;

		try {
			// INSERT 쿼리문 작성
			String query = "update board set " 
						+ "title=?, content=? " 
						+ "where num=?";

			psmt = con.prepareStatement(query); // 동적 쿼리
			psmt.setString(1, dto.getTitle());
			psmt.setString(2, dto.getContent());
			psmt.setString(3, dto.getNum());

			result = psmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("게시물 입력 중 예외 발생");
			e.printStackTrace();
			// TODO: handle exception
		}

		return result;
	}

	//지정한 게시물을 삭제
	public int deletePost(BoardDTO dto) {
		int result = 0;

		try {
			// INSERT 쿼리문 작성
			String query = "DELETE FROM board WHERE num=?";

			psmt = con.prepareStatement(query); // 동적 쿼리
			psmt.setString(1, dto.getNum());
			
			result = psmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("게시물 삭제 중 예외 발생");
			e.printStackTrace();
			// TODO: handle exception
		}

		return result;
	}
}
