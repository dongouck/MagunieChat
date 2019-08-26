<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="jumbotron" style="padding-top: 20px;">
	<h2>회원가입</h2>
	<form  method="post" action="joinAction.do">

		<div>
			<div class="form-group">
				<input type="text" class="form-control" name="userId" placeholder="아이디">
			</div>
			<div class="form-group">
				<input type="password" class="form-control" name="userPassword"
					placeholder="비밀번호">
			</div>
			<div class="form-group">
				<input type="text" class="form-control" name="userName" placeholder="이름">
			</div>
			<div class="form-group">
				<input type="email" class="form-control" name="userEmail"
					placeholder="이메일"></
			</div>
			<div class="form-group">
				<input type="submit" class="btn btn-primary form-control" value="완료">
			</div>
		</div>
	</form>
</div>
