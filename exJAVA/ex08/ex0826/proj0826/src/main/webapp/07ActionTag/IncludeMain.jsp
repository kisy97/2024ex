<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String outerPath1 = "./inc/OuterPage1.jsp";
    String outerPath2 = "./inc/OuterPage2.jsp";

    pageContext.setAttribute("pAttr", "동명왕");
    request.setAttribute("rAttr", "온조왕");
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>지시어와 액션 태그 동작 방식 비교</h2>
	
	<h3>지시어로 페이지 포함하기</h3>
	<%@include file="./inc/OuterPage1.jsp" %>
	<!-- 이 방식은 오류 -->
	<%-- <%@include file="<%= outerPath1 %>" %> --%>
	<p>외부 파일에 선언한 변수 : <%=newVa1 %></p>
	
	<h3>액션 태그로 페이지 포함히기</h3>
	<!-- 두 방식 모두 문제 없음  -->
	<jsp:include page="./inc/OuterPage2.jsp"></jsp:include>	
	<jsp:include page="<%=outerPath2 %>"></jsp:include>
	<!-- 액션태그는 실행 결과값만 가져온다 jsp코드는 가져오지 않음  -->
	<p>외부 파일에 선언한 변수 : <%-- <%=newVa2 %> --%></p>
</body>
</html>