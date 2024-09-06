package controller;

import java.io.IOException;
import java.io.PrintWriter;

import dao.MemberDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MemberDeleteController implements Controller {

	@Override
	public MyView precess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		int custno = Integer.parseInt(request.getParameter("custno"));

		MemberDao dao = new MemberDao();
		int result = dao.deleteMember(custno);
		if (result <= 0) {
			out.println("<script>alert('회원 삭제 실패');</script>");
		}
		//response.sendRedirect("/memberList");
		return new MyView("/member/memberList");
	}

}
