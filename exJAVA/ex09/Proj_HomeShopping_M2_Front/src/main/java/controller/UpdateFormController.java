package controller;

import java.io.IOException;
import dao.MemberDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vo.MemberVO;

public class UpdateFormController implements Controller {

	@Override
	public MyView precess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int custno = Integer.parseInt(request.getParameter("custno"));

		MemberDao dao = new MemberDao();
		MemberVO member = dao.getMemberData(custno);
		request.setAttribute("member", member);

		return new MyView("/view/memberUpdate.jsp");
	}

}
