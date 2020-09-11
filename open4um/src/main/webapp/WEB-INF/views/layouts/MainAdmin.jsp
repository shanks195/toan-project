<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
	
<!DOCTYPE html>
<html>
<head>

	<title>Web management page | Dashboard</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="author" content="Nguyen to the toan">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <link rel="stylesheet" href="<c:url value="/resources/css/admin.css"/>">
   <link rel="stylesheet" href="<c:url value="/resources/css/addBaiViet.css"/>">
    <link rel="stylesheet" href="<c:url value="/resources/css/addChuyenMuc.css"/>">
    <link rel="stylesheet" href="<c:url value="/resources/css/ListChuyenMuc.css"/>">
     <link rel="stylesheet" href="<c:url value="/resources/css/ListThe.css"/>">
       <link rel="stylesheet" href="<c:url value="/resources/css/profile.css"/>">
  <link rel="stylesheet" href="<c:url value="/resources/css/responsive.css"/>">
  <link href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700;1,900&display=swap" rel="stylesheet">
  <script src="https://kit.fontawesome.com/fa80a5a76b.js" crossorigin="anonymous"></script>
  <link rel="stylesheet" href="<c:url value="/resources/css/ListBaiViet.css"/>">
</head>
<body>


	<%@include file="/WEB-INF/views/layouts/FileGenaral/headerAdmin.jsp"%>

	<decorator:body />
	
	<%@include file="/WEB-INF/views/layouts/FileGenaral/footerAdmin.jsp"%>
	
	
  	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  	<script src="<c:url value="/resources/js/clickmenu.js" />">
		  
	</script>
	<script src="<c:url value="/resources/js/ajax.js" />">
		  
	</script>
</body>
</html>