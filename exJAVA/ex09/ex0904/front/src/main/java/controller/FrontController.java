package controller;

import java.io.IOException;
import java.util.HashMap;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/member/*")
public class FrontController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	private HashMap<String, Controller> controllerMap = new HashMap<>();
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		//컨트롤러 등록
		controllerMap.put("/member/memberList", new MemberListController());
		controllerMap.put("/member/memberDelete", new MemberDeleteController());
		controllerMap.put("/member/memberUpdate", new MemberUpdateController());
		controllerMap.put("/member/updateForm", new UpdateFormController());
		controllerMap.put("/member/memberInsert", new MemberInsertController());
		controllerMap.put("/member/insertForm", new InsertFormController());
		controllerMap.put("/member/memberMoneyList", new MemberMoneyListController());
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		String requestURI = req.getRequestURI();
		String contextPath = req.getContextPath();
		String path = requestURI.substring(contextPath.length());
		
		//uri: /front/member/memberList
		//context path: /front
		//path: /member/memberList
		
		Controller controller = controllerMap.get(path);
		if (controller == null) {
			resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
			return;
		}
		Myview view = controller.precess(req, resp);
		view.render(req, resp);
	}
}
