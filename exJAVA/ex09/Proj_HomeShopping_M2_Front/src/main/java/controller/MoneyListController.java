package controller;

import java.io.IOException;
import java.util.ArrayList;

import dao.MemberDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vo.MoneyVO;

public class MoneyListController implements Controller {

	@Override
	public MyView precess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// ---------- money_tbl_02테이블에서 회원 매출 자료 select ----------
		MemberDao dao = new MemberDao();
		ArrayList<MoneyVO> list = dao.getMoneyList();

		// ---------- request객체에 담아서 보내기 ----------
		request.setAttribute("moneyList", list);

		return new MyView("/view/moneyList.jsp");
	}

}
