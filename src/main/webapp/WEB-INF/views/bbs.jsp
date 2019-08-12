<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<h2>this is bbs page.</h2>

<table>
	<c:forEach var="bbsList" items="${bbsList}" varStatus="status">
		<tr>
			<td><c:out value="${bbsList.emp_id}" /></td>
			<td><c:out value="${bbsList.dept}" /></td>
			<td><c:out value="${bbsList.emp_name}" /></td>
			<td><c:out value="${bbsList.emp_no}" /></td>
			<td><c:out value="${bbsList.country}" /></td>
		</tr>
	</c:forEach>
	

</table>

<form id="bbsWriteFrm" method="post" action="testingInsert.do">
	<table>
		<tr>
			<td><input type="text" placeholder="ID" name="emp_id"/></td>
		</tr>
		<tr>
			<td><input type="text" placeholder="ID No" name="emp_no"/></td>
		</tr>
		<tr>
			<td><input type="text" placeholder="Name" name="emp_name"/></td>
		</tr>
		<tr>
			<td>
				<select name="country">
					<option value="Germany">독일</option>
					<option value="Canada">캐나다</option>
					<option value="United Kingdom">영국</option>
					<option value="France">프랑스</option>
					<option value="India">인도</option>
					<option value="United States">미국</option>
				</select>
			</td>
		</tr>
		<tr>
			<td><input type="text" placeholder="Department" name="dept"/></td>
		</tr>
	</table>
	<input type="submit" value="SAVE">
</form>
