<%@page import="common.JDBCUtil"%>
<%@page import="vo.MemberVO"%>
<%@page import="dao.MemberDAO"%>
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
	<form name="inserFrm" method="post" action="./insertProcess.jsp">
		<table>
			<tr>
				<td>이름</td>
				<td><input type="text" name="member_name"></td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><input type="text" name="member_tel"></td>
			</tr>
			<tr>
				<td><button type="submit"
						onclick="location.href='index.jsp';">입력</button></td>
			</tr>
		</table>
	</form>
	<a href="./index.jsp">홈으로</a>
	<hr>
</section>

<%@ include file="./footer.jsp"%>
