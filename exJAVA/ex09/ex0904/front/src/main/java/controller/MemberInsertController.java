package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import dao.MemberDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vo.MemberVO;

public class MemberInsertController implements Controller {

	@Override
	public Myview precess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		System.out.println("MemberInsertController 실행...");

		MemberVO vo = new MemberVO();
		vo.setCustno(Integer.parseInt(req.getParameter("custno")));
		vo.setCustname(req.getParameter("custname"));
		vo.setPhone(req.getParameter("phone"));
		vo.setAddress(req.getParameter("address"));
		vo.setJoindate(Date.valueOf(req.getParameter("joindate")));
		vo.setGrade(req.getParameter("grade"));
		vo.setCity(req.getParameter("city"));

		// member_servlet 테이블에서 회원 자료 insert
		MemberDAO dao = new MemberDAO();
		int result = dao.insertMember(vo);
		
		if (result > 0) {
			out.println("<script>alert('회원 등록이 완료되었습니다.');</script>");
		}
		return new Myview("/member/insertForm");
	}
}
