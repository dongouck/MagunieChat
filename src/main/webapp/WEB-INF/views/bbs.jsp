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