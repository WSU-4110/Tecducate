<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Request List</title>
</head>

 
	<body>
	 <center>
		 <a href="login.jsp"target ="_self" > logout</a><br><br> 
	</center>
		 
    <div align="center">
        <table border="1" cellpadding="6">
            <caption><h2>List of Requests</h2></caption>
            <tr>
                <th>Smith Note</th>
                <th>Client Note</th>
                <th>Tree Count</th>
               	<th>Request ID</th>
               	<th>Trees</th>
            </tr>
            <c:forEach var="requests" items="${listRequest}">
                <tr style="text-align:center">
                    <td><c:out value="${requests.smithNote}" /></td>
                    <td><c:out value="${requests.clientNote}" /></td>
                    <td><c:out value="${requests.treeCount}" /></td>
                    <td><c:out value="${requests.requestID}" /></td>
                    <td>
                    	<a href="treeView?id=<c:out value='${requests.requestID}' />">View Trees</a>
                    </td>
            </c:forEach>
        </table>
	</div>
	</body>
</html>