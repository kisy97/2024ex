package controller;

import java.io.IOException;
import java.io.PrintWriter;

import dao.MemberDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MemberDeleteController implements Controller{

	@Override
	public Myview precess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		int custno = Integer.parseInt(req.getParameter("custno"));
		
		MemberDAO dao = new MemberDAO();
		int result = dao.deleteMember(custno);
		if(result <=0) {
			out.println("<script>alert('회원 삭제 실패');</script>");
		}
		
		return new Myview("/member/memberList");
	}
}
