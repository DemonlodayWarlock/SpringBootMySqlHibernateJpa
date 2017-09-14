<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="/js/index.js"></script>
</head>
<body>

	<table>
		<tr>
   			<th>ID</th>
   			<th>Name</th>
   			<th>Delete</th>
		</tr>
		
		<%-- <c:forEach var="circle" items="${circles}">
			<tr>
   				<td><c:out value="${circle.id}"/></td>
   				<td><c:out value="${circle.name}"/></td>
   				<td><a href="/view/${circle.id}">Delete</a></td>
			</tr>
		</c:forEach> --%>
		
		<c:if test="${circles.size()>0}">
			<br/>
			<br/>	
			<br/>	
			<br/>		
	    </c:if>
	    
	    <c:choose>
	    	<c:when test="${circles.size()>0}">
	    		<c:forEach var="circle" items="${circles}">
					<tr>
   						<td><c:out value="${circle.id}"/></td>
   						<td><c:out value="${circle.name}"/></td>
   						<td><a href="/view/${circle.id}" onclick="return confirmDelete()">Delete</a></td>
					</tr>
				</c:forEach>
	    	</c:when>
	    	<%-- <c:otherwise>
	    		<tr>
   					<td><c:out value="N/A"/></td>
   					<td><c:out value="N/A"/></td>
   					<td><c:out value="N/A"/></td>
				</tr>
	    	</c:otherwise> --%>
	    </c:choose>
		
	</table>
	
	<br/>
	<br/>
	<br/>
	<a href="/view/index"> Go back to index page...</a>

</body>
</html>