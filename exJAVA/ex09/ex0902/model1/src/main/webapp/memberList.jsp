<%@page import="java.util.ArrayList"%>
<%@page import="dao.MemberDAO"%>
<%@page import="vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="./header.jsp"%>

<nav>
	<ul>
		<li><a href="./memberList.jsp">회원 목록 조회</a></li>
		<li><a href="./memberInsert.jsp">회원 추가</a></li>
	</ul>
</nav>
<section>
	<hr>
	<h1>회원 목록 테이블</h1>
	<table>
		<tr>
			<th>이름</th>
			<th>전화번호</th>
		</tr>
		<%
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberVO> list = dao.getMemberList();
		
		if(list !=null) {
			for(MemberVO vo : list) {
		%>
		<tr>
			<th><%=vo.getName() %></th>
			<th><%=vo.getTel() %></th>
		</tr>
		<%
			}
		}
		%>
	</table>
	<a href="./index.jsp">홈으로</a>
</section>

<%@ include file="./footer.jsp"%>