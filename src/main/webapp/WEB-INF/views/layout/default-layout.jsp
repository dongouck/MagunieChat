<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!doctype html>
<html class="no-js">
<head>
	<tiles:insertAttribute name="header" />
</head>
<body class="left-menu">
	<tiles:insertAttribute name="left" />
	<div id="wrapper">
		<tiles:insertAttribute name="content" />
		<tiles:insertAttribute name="footer" />
	</div>

	<!-- jQuery Files -->
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/carousel.js"></script>
	<script src="js/parallax.js"></script>
	<script src="js/rotate.js"></script>
	<script src="js/custom.js"></script>
	<script src="js/masonry.js"></script>
	<script src="js/masonry-4-col.js"></script>

</body>
</html>