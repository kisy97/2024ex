
<%@page import="dao.MemberDAO"%>
<%@page import="vo.MemberVO"%>
<%
String name = request.getParameter("member_name");
String tel = request.getParameter("member_tel");

MemberVO vo = new MemberVO();
vo.setName(name);
vo.setTel(tel);

MemberDAO dao = new MemberDAO();
dao.insertMember(vo);


response.sendRedirect("index.jsp");
%>