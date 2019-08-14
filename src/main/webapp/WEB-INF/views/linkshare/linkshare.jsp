<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div>
	<div>
		<h2>Linkshare</h2>
	</div>
	<div id="weeklyLinks">
		<table>
		</table>
	</div>
	<div id="latestLinks">
		<c:forEach items="${latestLinks}" var="latestLinks" varStatus="status">
			<div class="service-box m30">
				<table>
					<tr>
						<td><c:out value="${latestLinks.status.index}" /></td>
					</tr>
					<tr>
						<td><c:out value="${latestLinks.category}" /></td>
					</tr>
					<tr>
						<td><c:out value="${latestLinks.url}" /></td>
					</tr>
					<tr>
						<td><c:out value="${latestLinks.writer}" /></td>
					</tr>
				</table>
			</div>
			<div> </div>
		</c:forEach>
	</div>
</div>



<form name="form1" method="post" enctype="multipart/form-data" action="">

	이름: <input type="text" name="name"><br> 제목: <input
		type="text" name="subject"><br> 파일1: <input type="file"
		name="file1"><br> 파일2: <input type="file" name="file2"><br>
	<input type="submit" value="업로드">

</form>