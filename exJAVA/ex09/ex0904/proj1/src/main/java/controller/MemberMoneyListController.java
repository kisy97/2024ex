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


@WebServlet("/memberMoneyList")
public class MemberMoneyListController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberMoneyVO> memberMoneyList = dao.getMemberMoney();
		
		req.setAttribute("memberMoneyList", memberMoneyList);
		req.getRequestDispatcher("/memberMoneyList.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}
