<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>

<script>
	function submitWriteFn() {

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
	function submitSearchFn(){
		 
		var inputType=document.getElementById("SearchOption");
		var param;
		if(inputType=="writer"){
			param="writer";
			if(inputType=="content"){
				param="content";
				if(input=="reply"){
					param="reply";
				}
			}
		}
		$.ajax({
			typ		:	"post",
			url		:	"bbsSearch",
			data	:	JSON.stringify(form),
			contentType:"application/json",
			success	:	function(data){
				
				alert("sucees!");
			}
		})
	}
	

	$(function() {
		$("#submitWriteBtn").click(function() {
			submitWriteFn();

		})
		
		$("#submitSearchBtn").click(function(){
			submitSearchFn();
		})
		
	})
</script>

<h2>this is bbs page.</h2>
<div class="service-box m30">
	<div>
		<div class="service-box m30">
			<form id="homeBbs" method="post" action="homeWriteAction">
				<select name="category">
					<option value="1">잡담</option>
					<option value="2">정보</option>
					<option value="3">유머</option>
					<option value="4">뉴스</option>
				</select> 
				<input type="text" id="homeBbsTextBox" name="content"
					placeholder="오늘은 무슨 이야기를 하고 싶으세요?" style="width: 600px;" /> 
				<input type="button" id="submitWriteBtn" class="btn btn-primary" />
			</form>
		</div>
	</div>
</div>
<section class="section lb nopadtop noover">
	<div class="container">
		<div class="row">
			<c:forEach items="${bbsList}" var="bbsList">
				<div class="col-lg-4 col-md-12">
					<div class="service-box m30">
						<!-- <i class="flaticon-monitor"></i> -->
						<h3>
							<c:out value="${bbsList.content}" />
						</h3>
						<p>
							<c:out value="${bbsList.writer}" />
						</p>
						<p>
							<c:out value="${bbsList.bbsDate}" />
						</p>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
</section>

<form id="bbsSearchFrm" method="post" action="bbsSearch">
	<select id="SearchOption" name="SearchOption">
		<option value="writer">게시자</option>
		<option value="content">내용</option>
		<option value="reply">댓글</option>
	</select>
	<input type="text" name="searchKeyword">
	<input type="submit" id="submitSearchBtn" value="검색">
</form>
<div class="container">

</div>
