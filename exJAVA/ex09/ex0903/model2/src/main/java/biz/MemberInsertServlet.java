package biz;

import java.io.IOException;

import dao.MemberDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vo.MemberVO;

@WebServlet("/write.do")
public class MemberInsertServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		MemberVO vo = new MemberVO();
		vo.setName(req.getParameter("name"));
		vo.setTel(req.getParameter("tel"));
		
		MemberDAO dao = new MemberDAO();
		int result = dao.insertMember(vo);
		
		if(result == 1) {
			resp.sendRedirect("./index.jsp");
		} 
	}
}
