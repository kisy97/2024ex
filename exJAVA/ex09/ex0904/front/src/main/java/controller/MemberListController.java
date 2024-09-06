package controller;

import java.io.IOException;
import java.util.ArrayList;

import dao.MemberDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vo.MemberVO;

public class MemberListController implements Controller {

	@Override
	public Myview precess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// member_servlet 테이블에서 회원자료 select
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberVO> memberList = dao.getMember();

		// req 객체에 담아서 보내기
		req.setAttribute("memberList", memberList);
		return new Myview("/view/memberList.jsp");
	}
}
