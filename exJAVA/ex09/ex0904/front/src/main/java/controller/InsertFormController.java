package controller;

import java.io.IOException;

import dao.MemberDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class InsertFormController implements Controller{
	
	@Override
	public Myview precess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		MemberDAO dao = new MemberDAO();
		int custno = dao.getMaxNo();
		req.setAttribute("custno", custno);
		return new Myview("/view/memberInsertForm.jsp");
	}
}
