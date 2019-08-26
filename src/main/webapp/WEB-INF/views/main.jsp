<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script>

function pressEnterKey(){
     if(event.keyCode == 13) {
    	 submitFn();
     }
}
	
	function submitFn() {

		$loginStatus = $("#loginStatus");
		if ($loginStatus.val() != null) {
			if ($("#homeBbsTextBox").val() == "") {
				alert("뭐라도 좀 쓰십쇼!");
			} else {
				$("#homeBbs").submit();
			}
		} else {
			alert("로그인하세요!");

		}
	}

	$(function() {
		$("#submitBtn").click(function() {
			submitFn();

		})
	})
	
</script>

<div class="section bgcolor noover">
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<div class="tagline-message">
					<h3>
						<mark class="rotate">특별한, 앙마스, 마구니</mark>
						웹커뮤니티에 온걸 환영합니다 !
					</h3>
					<h3 class="subsub-menu center-content">
						<c:out value="${sessionScope.NAME}" />
					</h3>
				</div>
			</div>
		</div>
	</div>
</div>

<div class="service-box m30">
	<div>
		<div class="service-box m30">
			<form id="homeBbs" method="post"  action="homeWriteAction">
				<select name="category">
					<option value="1">잡담</option>
					<option value="2">정보</option>
					<option value="3">유머</option>
					<option value="4">뉴스</option>
				</select>
				<input hidden="hidden">
				<input type="text" id="homeBbsTextBox" name="content" onkeyup="pressEnterKey();"
					placeholder="오늘은 무슨 이야기를 하고 싶으세요?" style="width: 350px;" /> 
			</form>
			<button id="submitBtn" class="btn btn-primary" ></button>
		</div>
	</div>
</div>

<section class="section lb nopadtop noover">
	<div class="container">
		<div class="row">
			<c:forEach items="${homeBbsList}" var="homeBbbsList">
				<div class="col-lg-4 col-md-12">
					<div class="service-box m30">
						<!-- <i class="flaticon-monitor"></i> -->
						<h3>
							<c:out value="${homeBbbsList.content}" />
						</h3>
						<p>
							<c:out value="${homeBbbsList.writer}" />
						</p>
						<p>
							<c:out value="${homeBbbsList.bbsDate}" />
						</p>
					</div>
				</div>
			</c:forEach>
			<div class="col-lg-4 col-md-12">
				<div class="service-box m30">
					<h3>
						<a href="bbs">+</a>
					</h3>
				</div>
			</div>
			<!-- end col -->
		</div>
		<!-- end row -->
	</div>
	<!-- end container -->
</section>
<!-- end section -->

<section class="section">
	<div class="container">
		<div class="row">
			<div class="col-lg-7 col-md-12">
				<div class="text-widget">
					<h3>위클리 흑역사</h3>

					<p>
						Class aptent taciti sociosqu ad litora torquent per conubia
						nostra, per inceptos himenaeos. Nulla nunc dui, tristique in <a
							href="#">semper vel</a>, congue sed ligula. Nam dolor ligula,
						faucibus id sodales in, auctor fringill torquent per conubia
						nostra.
					</p>

					<div class="clearfix"></div>

					<div class="row">
						<div class="col-lg-4 col-md-4 col-sm-4 col-xs-12 first">
							<ul class="check">
								<li>Custom Shortcodes</li>
								<li>Visual Page Builder</li>
								<li>Unlimited Shortcodes</li>
								<li>Responsive Theme</li>
								<li>Tons of Layouts</li>
							</ul>
							<!-- end check -->
						</div>
						<!-- end col-lg-4 -->
						<div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
							<ul class="check">
								<li>Font Awesome Icons</li>
								<li>Pre-Defined Colors</li>
								<li>AJAX Transitions</li>
								<li>High Quality Support</li>
								<li>Unlimited Options</li>
							</ul>
							<!-- end check -->
						</div>
					</div>
					<!-- end row -->
				</div>
				<!-- end widget -->
			</div>
			<!-- end col-lg-6 -->
		</div>
		<!-- end row -->
	</div>
	<!-- end container -->
	<div class="perspective-image hidden-sm hidden-xs hidden-md">
		<img src="img/upload/p1.jpg" alt="" class="img-responsive">
	</div>
</section>

<section class="section bgcolor">
	<div class="container">
		<div class="row callout">
			<div class="col-md-4 text-center">
				<h3>
					<sup>$</sup>49.99
				</h3>
				<h4>Start your awesome project today!</h4>
			</div>
			<!-- end col -->

			<div class="col-md-8">
				<p class="lead">Limited time offer! Your Agency profile will be
					added to our "Agencies" directory as well.</p>
			</div>
		</div>
		<!-- end row -->
	</div>
	<!-- end container -->
</section>