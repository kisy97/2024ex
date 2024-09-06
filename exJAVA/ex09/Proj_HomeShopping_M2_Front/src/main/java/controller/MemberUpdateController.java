package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import dao.MemberDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vo.MemberVO;

public class MemberUpdateController implements Controller {

	@Override
	public MyView precess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		System.out.println("MemberUpdateController 실행....");

		int custno = Integer.parseInt(request.getParameter("custno"));

		// ---------- <form>에서 전달받은 데이터를 VO에 저장 ----------
		MemberVO vo = new MemberVO();
		vo.setCustno(custno);
		vo.setCustname(request.getParameter("custname"));
		vo.setPhone(request.getParameter("phone"));
		vo.setAddress(request.getParameter("address"));
		vo.setJoindate(Date.valueOf(request.getParameter("joindate")));
		vo.setGrade(request.getParameter("grade"));
		vo.setCity(request.getParameter("city"));

		// ---------- member_tbl_02테이블에서 회원 자료 update ----------
		MemberDao dao = new MemberDao();
		int result = dao.updateMember(vo);

		// ---------- update성공시에 회원 조회화면으로 전환 ----------
		if (result > 0) {
			out.println("<script>alert('회원정보 수정이 완료되었습니다.');</script>");
		}

		return new MyView("/member/updateForm?custno=" + custno);
	}

}
