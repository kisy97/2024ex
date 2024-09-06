package controller;

import java.io.IOException;

import dao.MemberDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vo.MemberVO;

public class UpdateFormController implements Controller{

	
	@Override
	public Myview precess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int custno = Integer.parseInt(req.getParameter("custno"));
		
		MemberDAO dao = new MemberDAO();
		MemberVO member = dao.getMemberSelected(custno);
		req.setAttribute("member", member);
		
		return new Myview("/view/memberUpdateForm.jsp");
		
	}
}
