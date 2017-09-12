<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table width="100%" border="1" align="center">
		<tr bgcolor="#949494">
		<th>Header Name</th><th>Header Value(s)</th>
		</tr>
		<%
   		java.util.Enumeration paramNames  = request.getParameterNames();
   		while(paramNames .hasMoreElements()) {
      		String paramName = (String)paramNames .nextElement();
      		out.print("<tr><td>" + paramName + "</td>\n");
      		String paramValue = request.getParameter(paramName);
      		out.println("<td> " + paramValue + "</td></tr>\n");
   		}
		%>
	</table>
</body>
</html>