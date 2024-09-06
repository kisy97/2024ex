package controller;

import java.io.IOException;
import java.util.ArrayList;

import dao.MemberDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vo.MemberMoneyVO;



public class MemberMoneyListController implements Controller{
	
	@Override
	public Myview precess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberMoneyVO> memberMoneyList = dao.getMemberMoney();
		
		req.setAttribute("memberMoneyList", memberMoneyList);
		return new Myview("/view/memberMoneyList.jsp");
	}
	
}
