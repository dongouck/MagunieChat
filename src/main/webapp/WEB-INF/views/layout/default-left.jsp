<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<script>

	function loginAction() {
		var $loginFrm = $("#loginFrm");

		if ($loginFrm.find("input").eq(0).val() == "") {
			alert("아이디를 입력하세요.");

			if ($loginFrm.find("input").eq(1).val() == "") {
				alert("비밀번호를 입력하세요.");

			}
		} else {

			$loginFrm.submit();
		}
	}

	$(function() {

		$(".child-menu").click(function() {
			console.log("aa");
		})

	});
</script>


<div class="menu-wrapper">

	<header class="vertical-header">
		<div class="vertical-header-wrapper">
			<nav class="nav-menu">
				<ul class="nav navbar-nav navbar-right">
					<%
						if (session.getAttribute("userId") != null) {
					%>
					<li id="loginStatus">ID: <%=session.getAttribute("userId")%></li>
					<li><a href="logout.do">Log Out</a></li>
					<%
						}
					%>
				</ul>
				<div class="logo">
					<a href="main.do"><img src="img/logo.png" alt=""></a>
				</div>
				<!-- end logo -->
				<div class="margin-block"></div>
				<div class="menu-search">
					<h4>
						<c:if test="${userId ne null}">
						"${userId}"
						</c:if>
					</h4>
					<%
						if (session.getAttribute("userId") == null) {
					%>

					<form id="loginFrm" action="loginAction.do" method="POST">
						<div class="">
							<input type="text" name="userId" class="form-control"	placeholder="ID">
							<input type="password" name="userPassword" class="form-control" placeholder="PASSWORD">
							<input type="button" onclick="loginAction()" value="log in" />
						</div>
					</form>

					<%
						}
					%>
					<button action="" value="회원가입" ></button>
				</div>
				<!-- end menu-search -->

				<!-- <div class="margin-block"></div> -->
				<ul class="primary-menu">
					<li id="main" class="child-menu"><a href="main">Main <i
							class="fa fa-angle-right"></i></a></li>
					<li id="sharedLink" class="child-menu"><a href="linkshare">Shared
							Links <i class="fa fa-angle-right"></i>
					</a></li>
					<li id="bbs" class="child-menu"><a href="bbs">BBS<i
							class="fa fa-angle-right"></i></a></li>
					<!-- <li id="blackHistory" class="child-menu"><a href="#">Black
							History <i class="fa fa-angle-right"></i>
					</a> 
						<div class="sub-menu-wrapper">
							<ul class="sub-menu center-content">
								<li><a href="#">Menu Example 01 <i
										class="fa fa-angle-right"></i></a>
									<div class="subsub-menu-wrapper">
										<ul class="subsub-menu center-content">
											<li><a href="#">Menu Example 01</a></li>
											<li><a href="#">Menu Example 02</a></li>
											<li><a href="#">Menu Example 03</a></li>
											<li><a href="#">Menu Example 04</a></li>
										</ul>
									</div></li>
								<li><a href="#">Menu Example 02 <i
										class="fa fa-angle-right"></i></a>
									<div class="subsub-menu-wrapper">
										<ul class="subsub-menu center-content">
											<li><a href="#">Menu Example 01</a></li>
											<li><a href="#">Menu Example 02</a></li>
											<li><a href="#">Menu Example 03</a></li>
											<li><a href="#">Menu Example 04</a></li>
											<li><a href="#">Menu Example 05</a></li>
											<li><a href="#">Menu Example 06</a></li>
										</ul>
									</div></li>
								<li><a href="#">Menu Example 03 <i
										class="fa fa-angle-right"></i></a>
									<div class="subsub-menu-wrapper">
										<ul class="subsub-menu center-content">
											<li><a href="#">Menu Example 01</a></li>
											<li><a href="#">Menu Example 02</a></li>
											<li><a href="#">Menu Example 03</a></li>
											<li><a href="#">Menu Example 04</a></li>
											<li><a href="#">Menu Example 05</a></li>
											<li><a href="#">Menu Example 06</a></li>
										</ul>
									</div></li>
								<li><a href="#">Menu Example 04 <i
										class="fa fa-angle-right"></i></a>
									<div class="subsub-menu-wrapper">
										<ul class="subsub-menu center-content">
											<li><a href="#">Menu Example 01</a></li>
											<li><a href="#">Menu Example 02</a></li>
											<li><a href="#">Menu Example 03</a></li>
										</ul>
									</div></li>
							</ul>
						</div></li>
						-->
					<li class="child-menu">
						<a href="#">
							Contact <i class="fa fa-angle-right"></i>
						</a>
					</li>
				</ul>

				<div class="margin-block"></div>


				<div class="margin-block"></div>

				<div class="menu-social">
					<ul class="list-inline text-center">
						<li><a href="#"><i class="fa fa-facebook"></i></a></li>
						<li><a href="#"><i class="fa fa-linkedin"></i></a></li>
						<li><a href="#"><i class="fa fa-twitter"></i></a></li>
						<li><a href="#"><i class="fa fa-instagram"></i></a></li>
					</ul>
				</div>
				<!-- end menu -->
			</nav>
			<!-- end nav-menu -->
		</div>
		<!-- end vertical-header-wrapper -->
	</header>
	<!-- end header -->
</div>
<!-- end menu-wrapper -->