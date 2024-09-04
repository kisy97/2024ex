package controller;

import java.io.IOException;
import java.sql.Date;

import dao.MemberDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vo.MemberVO;


@WebServlet("/memberInsert")
public class MemberInsertController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		// form 에서 전달받은 데이터를 vo에 저장
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
		
		//insert 성공시에 회원조회화면으로 전황
		if (result > 0) {
			resp.sendRedirect("/memberList");
		} else {
			resp.sendRedirect("/memberInsert.jsp");
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}
