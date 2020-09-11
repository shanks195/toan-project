<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<head>
	<title>Web management page | Dashboard</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="author" content="Nguyen to the toan">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <link rel="stylesheet" href="<c:url value="/resources/css/admin.css"/>">
  <link rel="stylesheet" href="<c:url value="/resources/css/responsive.css"/>">
  <link href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700;1,900&display=swap" rel="stylesheet">
  <script src="https://kit.fontawesome.com/fa80a5a76b.js" crossorigin="anonymous"></script>
</head>
<body>	
<div id="body">
		<div class="nav-container" id="container">
			<div class="lop-ngoai">
				<div class="user">
					<div class="image-user">
						<img src="<c:url value="/resources/images/2744528.jpg" />" alt="">
					</div>
					<div class="title-user">
						<h1>Admin</h1>
						<p>Nguyễn Tô Thế Toàn</p>
						<div class="center">
							<div class="left">
								<p><a href="profile.html"> Profile</a></p>
							</div>
							<div class="right">
								<p><a href="">Đăng Xuất</a></p>
							</div>
						</div>
					</div>						
				</div>
				<div class="accordion" id="accordionExample">
					  	<div class="card">
					    	<div class="card-header" id="headingOne">
							    <h2 class="mb-0">
							        <button class="btn btn-link btn-block text-left text-center" type="button" data-toggle="collapse" data-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
							        	<div class="icon"><i class="fas fa-address-card"></i></div><div class="title"><p >QUẢN LÝ THÀNH VIÊN</p></div>
							        </button>
							    </h2>
					    	</div>

					    	<div id="collapseOne" class="collapse show" aria-labelledby="headingOne" data-parent="#accordionExample">
					      		<div class="card-body">
					        		<ul>
					        			<li ><a href="ListUser.html">DANH SÁCH THÀNH VIÊN</a></li>
					        		</ul>
					      		</div>
					    	</div>
					  	</div>
					  	<div class="card">
					    	<div class="card-header" id="headingTwo">
						      	<h2 class="mb-0">
						       		<button class="btn btn-link btn-block text-left collapsed text-center" type="button" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
						         <div class="icon"><i class="far fa-clone"></i></div><div class="title"><p >QUẢN LÝ BÀI VIẾT</p></div> 
						        	</button>
						      	</h2>
						    </div>
						    <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionExample">
						      	<div class="card-body">
							        <ul>
							        	<li class="active"><a href="addBaiViet.html">THÊM BÀI VIẾT</a></li>						        	
							        </ul>
						    	</div>
						    	<div class="card-body">
							        <ul>						      
							        	<li class="active"><a href="ListBaiViet.html">DANH SÁCH BÀI VIẾT</a></li>
							        </ul>
						    	</div>
						    </div>
					  	</div>
					  	<div class="card">
					    	<div class="card-header" id="headingThree">
					      		<h2 class="mb-0">
						        	<button class="btn btn-link btn-block text-left collapsed text-center" type="button" data-toggle="collapse" data-target="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
						         	<div class="icon"><i class="fas fa-file-word"></i></div><div class="title"><p >QUẢN LÝ CHUYÊN MỤC</p></div>
						        	</button>
					      		</h2>
					    	</div>
					    	<div id="collapseThree" class="collapse" aria-labelledby="headingThree" data-parent="#accordionExample">
					      		<div class="card-body">
						        	<ul>
						        		
						        		<li class="active"><a href="ListChuyenMuc.html">DANH SÁCH CHUYÊN MỤC</a></li>
						        	</ul>
					      		</div>
					      		
					    	</div>
					    </div>	
					    <div class="card">
					    	<div class="card-header" id="headingFour">
					      		<h2 class="mb-0">
						        	<button class="btn btn-link btn-block text-left collapsed text-center" type="button" data-toggle="collapse" data-target="#collapseFour" aria-expanded="false" aria-controls="collapseFour">
						         <div class="icon"><i class="fas fa-tag"></i></div><div class="title"><p>QUẢN LÝ THẺ</p></div>
						        	</button>
					      		</h2>
					    	</div>
					    	<div id="collapseFour" class="collapse" aria-labelledby="headingFour" data-parent="#accordionExample">
					      		<div class="card-body">
						        	<ul>
						        		<li class="active"><a href="ListThe.html">DANH SÁCH THẺ</a></li>
						        	</ul>
					      		</div>
					    	</div>
					    </div>
					     <div class="card">
					    	<div class="card-header" id="headingFour">
					      		<h2 class="mb-0">
						        	<button class="btn btn-link btn-block text-left collapsed text-center" type="button" data-toggle="collapse" data-target="#collapseFour" aria-expanded="false" aria-controls="collapseFour">
						         <div class="icon"><i class="far fa-angry"></i></div><div class="title"><p>REPORT</p></div>
						        	</button>
					      		</h2>
					    	</div>
					    	<div id="collapseFour" class="collapse" aria-labelledby="headingFour" data-parent="#accordionExample">
					      		<div class="card-body">
						        	<ul>
						        		<li class="active"><a href="ListThe.html">DANH SÁCH THẺ</a></li>
						        	</ul>
					      		</div>
					    	</div>
					    </div>		
				</div>
			</div>
		</div>
			

		<section>
		<!-- 	tin nhan -->
		
			<h1>Xin Chào Admin</h1>
			<div class="infor-row">
				<div class="infor-box user">
					<div class="icon-user">
						<i class="fas fa-users"></i>
					</div>
					<div class="infor-user">
						<h4>Số Lượng Thành Viên</h4>
						<p class="number">${name}</p>
					</div>
				</div>
				<div class="infor-box">
					<div class="icon-download">
						<i class="fas fa-cloud-download-alt"></i>
					</div>
					<div class="infor-user">
						<h4>Lượt Tải Xuống</h4>
						<p class="number">${orderhistoryname}</p>
					</div>
				</div>
				<div class="infor-box">
					<div class="icon-source">
						<i class="fas fa-laptop-code" aria-hidden="true"></i>
					</div>
					<div class="infor-user">
						<h4>Source Codes</h4>
						<p class="number">${sourcename}</p>
					</div>
				</div>
				<div class="infor-box">
					<div class="icon-message">
						<i class="fas fa-sms"></i>
					</div>
					<div class="infor-message">
						<h4>Lượng tin nhắn</h4>
						<p class="number">${messagename}</p>
					</div>
				</div>	
			</div>
			<div class="box box-user" id="container1">
			    		<div class="user-header dropdown" id="heading">
				      		<div class="tieu-de">
				      			<h2>
					        	Thành Viên Củ
				     			</h2>
				     		</div>
				     		<button class="nut nut1" id="nut1" style="display: block;">
				     			<i class="fas fa-plus" aria-hidden="true" ></i>
				     		</button>
					 
							 <button class="nut nut1"id="nut2" style="display: none;">
				     			<i class="fas fa-minus"></i>				     			
				     		</button>
			    		</div>
			    		
							<div class="xo-xuong" style="display: block;" id="xoxuong">
								<c:forEach var="list" items="${listuser}"> 
			        				<div class="userid user1">
			        						<div class="avatar-user">
			        							<img src="<c:url value = "${list.avatar}"/>" alt="">
			        						</div>
			        						<div class="name-user">
			        							<p class="tu-cach-user">${list.roleaccount_name}</p>
			        							<p class="fullname">${list.username}</p>
			        						</div>
			        				 </div>
			        			</c:forEach>	 
		        			</div>	 	 	
		        		<button class="xem-them"><a href="ListUser.html">Xem Thêm</a></button>	   			
	    	</div>
	    	<div class="box box-report"id="container1">
			    		<div class="user-header dropdown" id="heading">
				      		<div class="tieu-de">
				      			<h2>
					        	Report
				     			</h2>
				     		</div>
				     		<button class="nut nut2" id="nut3" style="display: block;">
				     			<i class="fas fa-plus" aria-hidden="true" ></i>
				     		</button>
					 
							 <button class="nut nut2"id="nut4" style="display: none;">
				     			<i class="fas fa-minus"></i>				     			
				     		</button>
				      		
			    		</div>
						<div class="xo-xuong" style="display: block;" id="xoxuong1">
	        				<button class="xem-them"><a href="ListReport.html">Xem Thêm</a></button>
	     				</div>
	     					
	    	</div>
	    	<div class="box box-chuyen-muc" id="container1">
			    		<div class="user-header dropdown" id="heading">
				      		<div class="tieu-de">
				      			<h2>
					        	Bài Viết
				     			</h2>
				     		</div>
				     		<button class="nut nut1" id="nut5" style="display: block;">
				     			<i class="fas fa-plus" aria-hidden="true" ></i>
				     		</button>
					 
							 <button class="nut nut1"id="nut6" style="display: none;">
				     			<i class="fas fa-minus"></i>				     			
				     		</button>
				      		
			    		</div>
						<div class="xo-xuong" style="display: block;" id="xoxuong2">
	        				<div class="tab-content" id="myTabContent">
							  	<div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">
							  
							  		<table class="table table-striped">
							  			
								          <tbody>
								          <tr>
								            <td class="active tieu-de"><input type="checkbox" id="vehicle1" name="vehicle1" value="Bike"><span>Tiêu Đề</span></td>
								            <td class="tac-gia">Tác Gỉa</td>
								            <td class="ten">Tên</td>
								            <td class="chuyen-muc">Chuyên mục</td>
								            <td class="ngay-dang">Ngày đăng</td>
								            <td class="xu-ly">Xử lý</td>
								            <td class="trang-thai">Trạng Thái</td>
								            
								          </tr>
								          <c:forEach var="list" items="${listproduct}"> 
									          <tr>
									          
									            <td class="active tieu-de"><input type="checkbox" id="vehicle1" name="vehicle1" value="Bike"><span>${list.title}</span></td>
									            <td class="tac-gia">${list.getRoleaccount_name()}</td>
									            <td class="ten">${list.getUsername()}</td>
									            <td class="chuyen-muc">${list.getCtgname()}</td>
									            <td class="ngay-dang">${list.getDatepost()}</td>
									            <td class="xu-ly"><a href="">Xem Chi Tiết</a></td>
									            <td class="duyet">${list.getStatename()}</td>
									            
									          </tr>
									          
								          </c:forEach>
							          <!-- On cells (`td` or `th`) -->
							        </tbody></table>
							        
							    </div>							  
							</div>
							<button class="xem-them"><a href="<c:url value="/admin/quanlybaiviet/list/" />">Xem Thêm</a></button>
	     				</div>
	    	</div>
	    	<div class="box box-chuyen-muc"id="container1">
			    		<div class="user-header dropdown" id="heading">
				      		<div class="tieu-de">
				      			<h2>
					        	Chuyên Mục
				     			</h2>
				     		</div>
				     		<button class="nut nut2" id="nut3" style="display: block;">
				     			<i class="fas fa-plus" aria-hidden="true" ></i>
				     		</button>
					 
							 <button class="nut nut2"id="nut4" style="display: none;">
				     			<i class="fas fa-minus"></i>				     			
				     		</button>
				      		
			    		</div>
						<div class="xo-xuong" style="display: block;" id="xoxuong1">
	        				<button class="xem-them"><a href="ListReport.html">Xem Thêm</a></button>
	     				</div>
	     					
	    	</div>
		</section>
	</div>
	<script>
	var s = $('.duyet').text();
	var a = document.querySelectorAll(".duyet");
	var w = a[1].textContent;
	for(var i = 0 ; i < a.length ; ++i){
		if(a[i].textContent === "Đã Duyệt"){
			a[i].style.color = "green";
		}else{
			a[i].style.color = "red";
		}
	}
	</script>