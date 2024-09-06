<%@page import="vo.MoneyVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../header.jsp"%>

<%
MemberVO member = (MemberVO) request.getAttribute("member");
%>
<section>
	<div class="container">
		<h1 class="title">회원 목록 수정</h1>
		<form action="<%=request.getContextPath()%>/member/memberUpdate"
			method="post">
			<table>
				<tr>
					<td>회원번호</td>
					<td><input type="number" value="${member.custno}"
						name="custno" readonly="readonly"></td>
				</tr>
				<tr>
					<td>회원성명</td>
					<td><input type="text" value="${member.custname}"
						name="custname"></td>
				</tr>
				<tr>
					<td>회원전화</td>
					<td><input type="text" value="${member.phone}" name="phone"></td>
				</tr>
				<tr>
					<td>회원주소</td>
					<td><input type="text" value="${member.address}"
						name="address"></td>
				</tr>
				<tr>
					<td>가입일자</td>
					<td><input type="date" value="${member.joindate}"
						name="joindate"></td>
				</tr>
				<tr>
					<td>고객등급[A:VIP, B:일반, C:직원]</td>
					<td><input type="text" value="${member.grade}" name="grade"></td>
				</tr>
				<tr>
					<td>도시코드</td>
					<td><input type="text" value="${member.city}" name="city"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="수정">
						<a href="<%=request.getContextPath()%>/member/memberList"><input
							type="button" value="조회"></a></td>
				</tr>
			</table>
		</form>
	</div>
</section>

<%@ include file="../footer.jsp"%>






