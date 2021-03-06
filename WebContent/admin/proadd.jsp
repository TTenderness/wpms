<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	request.setCharacterEncoding("utf-8");
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<head>
<script>
	function setImgPreview() {
		var docObj = document.getElementById("doc");
		var imgObj = document.getElementById("preview");
		if (docObj.files && docObj.files[0]) {
			imgObj.style.display = 'block';
			imgObj.style.width = '100px';
			imgObj.style.height = '100px'
			imgObj.src = window.URL.createObjectURL(docObj.files[0]);
		}
	}
</script>
<!-- Meta, title, CSS, favicons, etc. -->
<meta charset="utf-8">
<title>ICART外设商城后台</title>
<base href="<%=basePath%> ">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Font CSS (Via CDN) -->
<link rel='stylesheet' type='text/css'
	href='assets\fonts\font\Open.font'>
<link rel="stylesheet" type="text/css"
	href="assets\fonts\font\Roboto.font">
<!-- Theme CSS -->
<link rel="stylesheet" type="text/css"
	href="assets/skin/default_skin/css/theme.css">
<!-- Admin Panels CSS -->
<link rel="stylesheet" type="text/css"
	href="assets/admin-tools/admin-plugins/admin-panels/adminpanels.css">
<!-- Admin Forms CSS -->
<link rel="stylesheet" type="text/css"
	href="assets/admin-tools/admin-forms/css/admin-forms.css">
<link rel="stylesheet" type="text/css" href="css.css" />
<style type="text/css">
a:link {
	text-decoration: none;
}
</style>
</head>

<body class="Home-page sb-l-o sb-r-c">
	<!-- Start: Main -->
	<div id="main">
		<!-- Start: Header -->
		<header class="navbar navbar-fixed-top bg-dark">
		<div class="menu">
			<jsp:include page="../mhead.jsp" />
		</div>
		</header>
		<!-- End: Header -->
		<!-- Start: Sidebar -->
		<aside id="sidebar_left" class="nano nano-primary">
		<div class="nano-content">
			<!-- End: Sidebar Header -->
			<!-- sidebar menu -->
			<ul class="nav sidebar-menu">
				<li class="sidebar-label pt20">系统页面</li>
				<li><a href="admin/index.jsp"> <span
						class="glyphicons glyphicons-home"></span> <span
						class="sidebar-title">后台首页</span>
				</a></li>
				<li class="sidebar-label pt20">后台管理</li>
				<li><a class="accordion-toggle" href="#"> <span
						class="glyphicons glyphicons-parents"></span> <span
						class="sidebar-title">用户管理</span> <span class="caret"></span>
				</a>
					<ul class="nav sub-nav">
							<li><a href="GetAllUserServlet?urole=admin"> <span
								class="glyphicons glyphicons-old_man"></span>管理员信息管理
						</a></li>	
						<li><a href="GetAllUserServlet?urole=orduser"> <span
								class="glyphicons glyphicons-parents"></span>会员信息管理
						</a></li>
					</ul></li>
				<li><a class="accordion-toggle" href="#"> <span
						class="glyphicons glyphicons-file"></span> <span
						class="sidebar-title">订单管理</span> <span class="caret"></span>
				</a>
					<ul class="nav sub-nav">
						<li><a href="GetAllOrdServlet"> <span
								class="glyphicons glyphicons-upload"></span>订单信息管理
						</a></li>
					</ul></li>

				<li class="active"><a class="accordion-toggle menu-open"
					href="#"> <span class="glyphicons glyphicons-iphone"></span> <span
						class="sidebar-title">商品管理</span> <span class="caret"></span>
				</a>
					<ul class="nav sub-nav">
						<li class="active"><a href="admin/proadd.jsp"> <span
								class="glyphicons glyphicons-more"></span>商品信息录入
						</a></li>
						<li><a href="MainServlet"> <span
								class="glyphicons glyphicons-hand_up"></span>商品信息管理
						</a></li>
					</ul></li>

				<li><a class="accordion-toggle" href=""> <span
						class="glyphicons glyphicons-star"></span> <span
						class="sidebar-title">评论管理</span> <span class="caret"></span>
				</a>
					<ul class="nav sub-nav">
						<li><a href="GetAllComServlet"> <span
								class="glyphicons glyphicons-eye_open"></span>评论管理
						</a></li>
					</ul></li>
				<li><a class="accordion-toggle" href=""> <span
						class="glyphicons glyphicons-picture"></span> <span
						class="sidebar-title">轮播管理</span> <span class="caret"></span>
				</a>
					<ul class="nav sub-nav">
						<li><a href="admin/albumlist.jsp"> <span
								class="glyphicons glyphicons-picture"></span>轮播管理
						</a></li>
					</ul></li>
			</ul>
			<div class="sidebar-toggle-mini">
				<a href="#"> <span class="fa fa-sign-out"></span>
				</a>
			</div>
		</div>
		</aside>
		<!-- Start: Content -->
		<section id="content_wrapper"> <!-- Start: Topbar-Dropdown -->

		<!-- End: Topbar-Dropdown --> <!-- Start: Topbar --> <header
			id="topbar">
		<div class="topbar-left">
			<ol class="breadcrumb">
				<li class="crumb-active"><a href="#"
					style="text-decoration: none; font-family: 幼圆; font-size: 15px;">商品信息录入</a>
				</li>
				<li class="crumb-icon"><span class="glyphicon glyphicon-home"></span>
			</ol>
		</div>
		</header> <!-- End: Topbar --> <!-- Begin: Content  This place write function()-->
		<div id="content">
			<div class="row">
				<div style="width: 70%">
					<div class="panel" style="margin-left: 50%;">
						<div class="panel-heading">
							<span class="panel-title">添加商品</span>
						</div>
						<div class="panel-body">
							<form class="form-horizontal" role="form" action="ProAddServlet"
								method="post" enctype="multipart/form-data">


								<div class="form-group">
									<label for="inputStandard" class="col-lg-3 control-label">商品图片</label>
									<div class="col-lg-8">
										<input type="file" class="form-control" id="doc"
											name="propic" onchange="setImgPreview()">
										<p>
										<div id="LocalImg">
											<img id="preview" witth=-1 height=-1 style="display: none;">
										</div>
										</p>
									</div>
								</div>
								<div class="form-group">
									<label for="proname" class="col-lg-3 control-label">商品名称</label>
									<div class="col-lg-8">
										<input type="text" class="form-control" id="proname"
											 name="proname">
									</div>
								</div>
								<div class="form-group">
									<label for="inputPassword" class="col-lg-3 control-label">商品价格</label>
									<div class="col-lg-8">
										<input type="text" class="form-control" id="proprice"
											placeholder="" name="proprice">
									</div>
								</div>

								<div class="form-group">
									<label for="inputPassword" class="col-lg-3 control-label">商品种类</label>
									<div class="col-lg-8">
										<input type="text" class="form-control" id="proclass"
											placeholder="" name="proclass">
									</div>
								</div>

								<div class="form-group">
									<label for="inputPassword" class="col-lg-3 control-label">商品品牌</label>
									<div class="col-lg-8">
										<input type="text" class="form-control" id="profirm"
											placeholder="" name="profirm">
									</div>
								</div>

								<div class="form-group">
									<label for="inputPassword" class="col-lg-3 control-label">商品数量</label>
									<div class="col-lg-8">
										<input type="text" class="form-control" id="procount"
											placeholder="" name="procount">
									</div>
								</div>
						</div>
						<div class="col-xs-4"
							style="display: inline-block; position: relative; margin-left: 120px;">
							<input type="submit"
								class="btn btn-rounded btn-primary btn-block" value="提交"></input>
						</div>
						</form>
					</div>
				</div>

			</div>
		</div>

		<!-- End: Content  This place write function()--> </section>
		<!-- End: Content-Wrapper -->
	</div>
	<!-- End: Main -->
	<!-- BEGIN: PAGE SCRIPTS -->
	<!-- jQuery -->
	<script type="text/javascript" src="vendor/jquery/jquery-1.11.1.min.js"></script>
	<script type="text/javascript"
		src="vendor/jquery/jquery_ui/jquery-ui.min.js"></script>
	<!-- Bootstrap -->
	<script type="text/javascript"
		src="assets/js/bootstrap/bootstrap.min.js"></script>
	<!-- Sparklines CDN -->
	<script type="text/javascript" src="assets/js/jquery.sparkline.min.js"></script>
	<!-- Chart Plugins -->
	<script type="text/javascript"
		src="vendor/plugins/highcharts/highcharts.js"></script>
	<script type="text/javascript" src="vendor/plugins/circles/circles.js"></script>
	<script type="text/javascript" src="vendor/plugins/raphael/raphael.js"></script>
	<!-- Holder js  -->
	<script type="text/javascript" src="assets/js/bootstrap/holder.min.js"></script>
	<!-- Theme Javascript -->
	<script type="text/javascript" src="assets/js/utility/utility.js"></script>
	<script type="text/javascript" src="assets/js/main.js"></script>
	<script type="text/javascript" src="assets/js/demo.js"></script>
	<!-- Admin Panels  -->
	<script type="text/javascript"
		src="assets/admin-tools/admin-plugins/admin-panels/json2.js"></script>
	<script type="text/javascript"
		src="assets/admin-tools/admin-plugins/admin-panels/jquery.ui.touch-punch.min.js"></script>
	<script type="text/javascript"
		src="assets/admin-tools/admin-plugins/admin-panels/adminpanels.js"></script>
	<!-- Dropzone JS -->
	<script type="text/javascript"
		src="vendor/plugins/dropzone/dropzone.min.js"></script>
	<!-- Datatables -->
	<script type="text/javascript"
		src="vendor/plugins/datatables/media/js/jquery.dataTables.min.js"></script>
	<script type="text/javascript"
		src="vendor/plugins/datatables/media/js/dataTables.bootstrap.js"></script>
	<script type="text/javascript"
		src="vendor/plugins/datatables/extensions/TableTools/js/dataTables.tableTools.min.js"></script>
	<!-- Page Javascript -->
	<script type="text/javascript" src="assets/js/pages/widgets.js"></script>
	<!-- Import  Main Javascript -->
	<script type="text/javascript" src="assets/js/pages/main.js"></script>
	<script type="text/javascript">
		jQuery(document)
				.ready(
						function() {
							Dropzone.options.dropZone = {
								paramName : "file", // The name that will be used to transfer the file
								maxFilesize : 0, // MB
								addRemoveLinks : true,
								dictDefaultMessage : '<i class="fa fa-cloud-upload"></i> \
                <span class="main-text"><b>Drop Files</b> to upload</span> <br /> \
                <span class="sub-text">(or click)</span> \
                ',
								dictResponseError : 'Server not Configured'
							};

							Dropzone.options.dropZone2 = {
								paramName : "file", // The name that will be used to transfer the file
								maxFilesize : 0, // MB

								addRemoveLinks : true,
								dictDefaultMessage : '<i class="fa fa-cloud-upload"></i> \
                <span class="main-text"><b>Drop Files</b> to upload</span> <br /> \
                <span class="sub-text">(or click)</span> \
                ',
								dictResponseError : 'Server not Configured'
							};

							// demo code
							setTimeout(
									function() {
										var Drop = $('#dropZone2');
										Drop.addClass('dz-started dz-demo');

										setTimeout(
												function() {
													$('.example-preview')
															.each(
																	function(i,
																			e) {
																		var This = $(e);

																		var thumbOut = setTimeout(
																				function() {
																					Drop
																							.append(This);
																					This
																							.addClass(
																									'animated fadeInRight')
																							.removeClass(
																									'hidden');
																				},
																				i * 135);

																	});
												}, 750);

									}, 800);

							// Demo code 
							$('.example-preview').on(
									'click',
									'a.dz-remove',
									function() {
										$(this).parent('.example-preview')
												.remove();
									});

						});
	</script>
</body>

</html>
