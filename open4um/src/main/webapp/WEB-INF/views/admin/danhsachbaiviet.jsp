<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<!DOCTYPE html>
<html>
<head>
	<title>Web management page | Dashboard</title>
	<meta name="author" content="Nguyen to the toan">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
 
	
  <link href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700;1,900&display=swap" rel="stylesheet">

   <script src="https://cdn.ckeditor.com/4.14.1/standard/ckeditor.js"></script>
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
							        	<i class="fas fa-address-card"></i>QUẢN LÝ THÀNH VIÊN
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
						          <i class="far fa-clone"></i>QUẢN LÝ BÀI VIẾT
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
						         <i class="fas fa-file-word"></i>QUẢN LÝ CHUYÊN MỤC
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
						         <i class="fas fa-tag"></i>QUẢN LÝ THẺ
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
						         <i class="far fa-angry"></i>REPORT
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
			<div class="infor-bai-viet">
				<div class="content-wrapper" style="min-height: 774px;">
    				<!-- Content Header (Page header) -->
	  				<div>
	  					<div>
	  						<h3>Posts</h3>
	  					</div>
	  				</div>
  					<div role="tabpanel">
					  	<div class="nav nav-tabs" id="nav-tab" role="tablist">					  	
						    	<a class="nav-item nav-link active" id="nav-home-tab" data-toggle="tab" href="#nav-home" role="tab" aria-controls="nav-home" aria-selected="true">Tất Cả<span>(2)</span></a>
						    	<a class="nav-item nav-link" id="nav-profile-tab" data-toggle="tab" href="#nav-profile" role="tab" aria-controls="nav-profile" aria-selected="false">Đã duyệt<span>(2)</span></a>						  	
						    	<a class="nav-item nav-link" id="nav-contact-tab" data-toggle="tab" href="#nav-contact" role="tab" aria-controls="nav-contact" aria-selected="false">Chưa Duyệt<span>(2)</span></a>						  	
						</div>
						<div class="tab-content" id="myTabContent">
				  			<div class="tab-pane fade show active" id="nav-home" role="tabpanel" aria-labelledby="nav-home-tab">
						  				<div class="tablenav top">	
						        			<div class="alignleft actions bulkactions">
						          				<label for="bulk-action-selector-top" class="screen-reader-text">Lựa Chọn Tác Vụ</label>
						          				<select name="action" id="bulk-action-selector-top">
								            		<option value="-1">Tác Vụ</option>
								            		<option value="edit" class="hide-if-no-js">Sửa</option>
								            		<option value="trash">Xóa</option>
								          		</select>
						          				<input type="submit" name="doaction" id="doaction" class="button action" value="Apply">
						       				</div>
						        			<div class="alignleft actions">
						          				<label for="filter-by-date" class="screen-reader-text">Bộ Lộc Ngày</label>
						          				<select name="m" id="filter-by-date">
								            		<option selected="selected" value="0">Tất cả Ngày</option>
								            		<option value="202008">09/2020</option>
								          		</select>
							            		<label class="screen-reader-text" for="cat">Bộ Lộc Chuyên Đề</label>
									            <select name="cat" id="cat" class="postform">
								                 	<option value="0" selected="selected">Tất Cả Chuyên Đề</option>
								            		<option class="level-0" value="1">Chuyên đề 1</option>
								          		</select>
						          				<input type="submit" name="filter_action" id="post-query-submit" class="button" value="Filter">   
						        			</div>
								        	<div class="tablenav-pages one-page">
								        		<span class="displaying-num">2 items</span>
								        	</div>
			        						<br class="clear">
			      						</div>
	      								<table class="table table-striped" id="our-table"">
	      										<thead>
											          <tr>
											            <th class="active tieu-de"><input type="checkbox" id="checkAll" name="vehicle1" value="Bike"><span>Tiêu Đề</span></th>
											            <th class="tac-gia">Tác Gỉa</th>
											            <th class="ten">Tên</th>
											            <th class="chuyen-muc">Chuyên mục</th>
											            <th class="ngay-dang">Ngày đăng</th>
											            <th class="xu-ly">Xử lý</th>
											            <th class="trang-thai">Trạng Thái</th>									            
											          </tr>
										         </thead> 
									          	<c:forEach var="list" items="${listproduct}"> 
										          <tbody>
											          <tr>         
											            <td class="active tieu-de"><input type="checkbox"  class="cb-element" id="vehicle1" name="vehicle1" value="Bike"><span>${list.title}</span></td>
											            <td class="tac-gia">${list.getRoleaccount_name()}</td>
											            <td class="ten">${list.getUsername()}</td>
											            <td class="chuyen-muc">${list.getCtgname()}</td>
											            <td class="ngay-dang">${list.getDatepost()}</td>
											            <td class="xu-ly"><a href="xemChiTietBaiViet.html">Xem Chi Tiết</a></td>
											            <td class="duyet" id="state">${list.getStatename()}</td>										            
											          </tr>
										          </tbody>
								          		</c:forEach>
									          
						          <!-- On cells (`td` or `th`) -->
						        		</table>
						        		<div class="container">
								        	<div class="navigation" id="pagination-wrapper">
												<nav aria-label="Page navigation example">
												  	<ul class="pagination">
													    <li class="page-item"><a class="page-link" href="#">Previous</a></li>
													    <li class="page-item"><a class="page-link" href="#">1</a></li>
													    <li class="page-item"><a class="page-link" href="#">2</a></li>
													    <li class="page-item"><a class="page-link" href="#">3</a></li>
													    <li class="page-item"><a class="page-link" href="#">Next</a></li>
												  	</ul>
												</nav>
											</div>
										</div>	
	    					</div>
			  				<div class="tab-pane fade" id="nav-profile" role="tabpanel" aria-labelledby="nav-profile-tab">
			  					<div class="tablenav top">	
						        			<div class="alignleft actions bulkactions">
						          				<label for="bulk-action-selector-top" class="screen-reader-text">Lựa Chọn Tác Vụ</label>
						          				<select name="action" id="bulk-action-selector-top">
								            		<option value="-1">Tác Vụ</option>
								            		<option value="edit" class="hide-if-no-js">Sửa</option>
								            		<option value="trash">Xóa</option>
								          		</select>
						          				<input type="submit" name="doaction" id="doaction" class="button action" value="Apply">
						       				</div>
						        			<div class="alignleft actions">
						          				<label for="filter-by-date" class="screen-reader-text">Bộ Lộc Ngày</label>
						          				<select name="m" id="filter-by-date">
								            		<option selected="selected" value="0">Tất cả Ngày</option>
								            		<option value="202008">09/2020</option>
								          		</select>
							            		<label class="screen-reader-text" for="cat">Bộ Lộc Chuyên Đề</label>
									            <select name="cat" id="cat" class="postform">
								                 	<option value="0" selected="selected">Tất Cả Chuyên Đề</option>
								            		<option class="level-0" value="1">Chuyên đề 1</option>
								          		</select>
						          				<input type="submit" name="filter_action" id="post-query-submit" class="button" value="Filter">   
						        			</div>
								        	<div class="tablenav-pages one-page">
								        		<span class="displaying-num">2 items</span>
								        	</div>
			        						<br class="clear">
			      						</div>
	      								<table class="table table-striped" id="our-table"">
	      										<thead>
											          <tr>
											            <th class="active tieu-de"><input type="checkbox" id="checkAll" name="vehicle1" value="Bike"><span>Tiêu Đề</span></th>
											            <th class="tac-gia">Tác Gỉa</th>
											            <th class="ten">Tên</th>
											            <th class="chuyen-muc">Chuyên mục</th>
											            <th class="ngay-dang">Ngày đăng</th>
											            <th class="xu-ly">Xử lý</th>
											            <th class="trang-thai">Trạng Thái</th>									            
											          </tr>
										         </thead> 
									          	<c:forEach var="list" items="${listproduct}"> 
										          <tbody>
											          <tr>         
											            <td class="active tieu-de"><input type="checkbox" id="vehicle1" name="vehicle1" value="Bike"><span>${list.title}</span></td>
											            <td class="tac-gia">${list.getRoleaccount_name()}</td>
											            <td class="ten">${list.getUsername()}</td>
											            <td class="chuyen-muc">${list.getCtgname()}</td>
											            <td class="ngay-dang">${list.getDatepost()}</td>
											            <td class="xu-ly"><a href="xemChiTietBaiViet.html">Xem Chi Tiết</a></td>
											            <td class="duyet" id="state">${list.getStatename()}</td>										            
											          </tr>
										          </tbody>
								          		</c:forEach>
									          
						          <!-- On cells (`td` or `th`) -->
						        		</table>
						        		<div class="container">
								        	<div class="navigation" id="pagination-wrapper">
												<nav aria-label="Page navigation example">
												  	<ul class="pagination">
													    <li class="page-item"><a class="page-link" href="#">Previous</a></li>
													    <li class="page-item"><a class="page-link" href="#">1</a></li>
													    <li class="page-item"><a class="page-link" href="#">2</a></li>
													    <li class="page-item"><a class="page-link" href="#">3</a></li>
													    <li class="page-item"><a class="page-link" href="#">Next</a></li>
												  	</ul>
												</nav>
											</div>
										</div>	
	    					</div>				  		    			
			  				<div class="tab-pane fade" id="nav-contact" role="tabpanel" aria-labelledby="nav-contact-tab">
			  					<div class="tablenav top">	
						        			<div class="alignleft actions bulkactions">
						          				<label for="bulk-action-selector-top" class="screen-reader-text">Lựa Chọn Tác Vụ</label>
						          				<select name="action" id="bulk-action-selector-top">
								            		<option value="-1">Tác Vụ</option>
								            		<option value="edit" class="hide-if-no-js">Sửa</option>
								            		<option value="trash">Xóa</option>
								          		</select>
						          				<input type="submit" name="doaction" id="doaction" class="button action" value="Apply">
						       				</div>
						        			<div class="alignleft actions">
						          				<label for="filter-by-date" class="screen-reader-text">Bộ Lộc Ngày</label>
						          				<select name="m" id="filter-by-date">
								            		<option selected="selected" value="0">Tất cả Ngày</option>
								            		<option value="202008">09/2020</option>
								          		</select>
							            		<label class="screen-reader-text" for="cat">Bộ Lộc Chuyên Đề</label>
									            <select name="cat" id="cat" class="postform">
								                 	<option value="0" selected="selected">Tất Cả Chuyên Đề</option>
								            		<option class="level-0" value="1">Chuyên đề 1</option>
								          		</select>
						          				<input type="submit" name="filter_action" id="post-query-submit" class="button" value="Filter">   
						        			</div>
								        	<div class="tablenav-pages one-page">
								        		<span class="displaying-num">2 items</span>
								        	</div>
			        						<br class="clear">
			      						</div>
	      								<table class="table table-striped" id="our-table"">
	      										<thead>
											          <tr>
											            <th class="active tieu-de"><input type="checkbox" id="vehicle1" name="vehicle1" value="Bike"><span>Tiêu Đề</span></th>
											            <th class="tac-gia">Tác Gỉa</th>
											            <th class="ten">Tên</th>
											            <th class="chuyen-muc">Chuyên mục</th>
											            <th class="ngay-dang">Ngày đăng</th>
											            <th class="xu-ly">Xử lý</th>
											            <th class="trang-thai">Trạng Thái</th>									            
											          </tr>
										         </thead> 
									          	<c:forEach var="list" items="${listproduct}"> 
										          <tbody>
											          <tr>         
											            <td class="active tieu-de"><input type="checkbox" id="vehicle1" name="vehicle1" value="Bike"><span>${list.title}</span></td>
											            <td class="tac-gia">${list.getRoleaccount_name()}</td>
											            <td class="ten">${list.getUsername()}</td>
											            <td class="chuyen-muc">${list.getCtgname()}</td>
											            <td class="ngay-dang">${list.getDatepost()}</td>
											            <td class="xu-ly"><a href="xemChiTietBaiViet.html">Xem Chi Tiết</a></td>
											            <td class="duyet" id="state">${list.getStatename()}</td>										            
											          </tr>
										          </tbody>
								          		</c:forEach>
									          
						          <!-- On cells (`td` or `th`) -->
						        		</table>
						        		<div class="container">
								        	<div class="navigation" id="pagination-wrapper">
												<nav aria-label="Page navigation example">
												  	<ul class="pagination">
													    <li class="page-item"><a class="page-link" href="#">Previous</a></li>
													    <li class="page-item"><a class="page-link" href="#">1</a></li>
													    <li class="page-item"><a class="page-link" href="#">2</a></li>
													    <li class="page-item"><a class="page-link" href="#">3</a></li>
													    <li class="page-item"><a class="page-link" href="#">Next</a></li>
												  	</ul>
												</nav>
											</div>
										</div>	
	    					</div>		  	  
					</div>
  				</div>
  <!-- /.content-wrapper -->
			</div>
		</section>
	</div>
	
</body>
</html>