<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쇼핑몰 회원관리 FrontController</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css">
</head>
<body>
	<header>쇼핑몰 회원관리 FrontController ver2.0</header>
	<nav>
		<ul>
			<li><a
				href="<%=request.getContextPath()%>/member/insertForm">회원등록</a></li>
			<li><a href="<%=request.getContextPath()%>/member/memberList">회원목록조회/수정</a></li>
			<li><a
				href="<%=request.getContextPath()%>/member/moneyList">회원매출조회</a></li>
			<li><a href="<%=request.getContextPath()%>/index.jsp">홈</a></li>
		</ul>
	</nav>