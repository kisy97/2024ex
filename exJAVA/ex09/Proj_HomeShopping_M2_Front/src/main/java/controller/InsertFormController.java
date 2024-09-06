package controller;

import java.io.IOException;

import dao.MemberDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class InsertFormController implements Controller {

	@Override
	public MyView precess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		MemberDao dao = new MemberDao();
		int custno = dao.getMaxCustNo();
		request.setAttribute("custno", custno);

		return new MyView("/view/memberInsert.jsp");
	}

}
