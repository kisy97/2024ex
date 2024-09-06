package controller;

import java.io.IOException;
import java.util.HashMap;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/member/*")
public class FrontController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private HashMap<String, Controller> controllerMap = new HashMap<>();

	@Override
	public void init(ServletConfig config) throws ServletException {
		// super.init(config); 삭제해주세요
		// 컨트롤러 등록
		controllerMap.put("/member/insertForm", new InsertFormController());
		controllerMap.put("/member/memberInsert", new MemberInsertController());
		controllerMap.put("/member/memberList", new MemberListController());
		controllerMap.put("/member/updateForm", new UpdateFormController());
		controllerMap.put("/member/memberUpdate", new MemberUpdateController());
		controllerMap.put("/member/memberDelete", new MemberDeleteController());
		controllerMap.put("/member/moneyList", new MoneyListController());
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		// uri: /Proj_HomeShopping/member/memberInsert
		// context path: /Proj_HomeShopping
		// path: /member/memberInsert
		// -------------------------------------------------------
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String path = requestURI.substring(contextPath.length());

		Controller controller = controllerMap.get(path);
		if (controller == null) {
			response.setStatus(HttpServletResponse.SC_NOT_FOUND);
			return;
		}
		MyView view = controller.precess(request, response);
		view.render(request, response);

	}

}
