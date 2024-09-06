package controller;

import java.io.IOException;
import java.util.ArrayList;

import dao.MemberDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vo.MemberVO;

public class MemberListController implements Controller {

	@Override
	public MyView precess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// ---------- member_tbl_02테이블에서 회원 자료 select ----------
		MemberDao dao = new MemberDao();
		ArrayList<MemberVO> memberList = dao.getMemberList();

		// ---------- request객체에 담아서 보내기 ----------
		request.setAttribute("memberList", memberList);

		return new MyView("/view/memberList.jsp");
	}

}
