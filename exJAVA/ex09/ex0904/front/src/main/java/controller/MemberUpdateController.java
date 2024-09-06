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

public class MemberUpdateController implements Controller {

	@Override
	public Myview precess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter out = resp.getWriter();
		System.out.println("MemberUpdateController 실행...");

		int custno = Integer.parseInt(req.getParameter("custno"));
		// form에서 전달받은 데이터를 vo에 저장
		MemberVO vo = new MemberVO();
		vo.setCustno(custno);
		vo.setCustname(req.getParameter("custname"));
		vo.setPhone(req.getParameter("phone"));
		vo.setAddress(req.getParameter("address"));
		vo.setJoindate(Date.valueOf(req.getParameter("joindate")));
		vo.setGrade(req.getParameter("grade"));
		vo.setCity(req.getParameter("city"));

		// member_servlet테이블에서 회원 자료 update
		MemberDAO dao = new MemberDAO();
		int result = dao.updateMember(vo);

		if (result > 0) {
			out.println("<script>alert('회원정보 수정이 완료되었습니다.');</script>");
		}
		return new Myview("/member/updateForm?custno=" + custno);
	}

}
