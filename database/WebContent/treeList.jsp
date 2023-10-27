<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>All Tree list</title>
</head>
<body>
   <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of Trees</h2></caption>
            <tr>
				<th>Image 1</th>
                <th>Image 2</th>
                <th>Image 3</th>
                <th>Address</th>
                <th>Distance</th>
               	<th>Width</th>
               	<th>Height</th>
               	<th>Tree ID</th>
               	<th>Request ID</th>
            </tr>
            <c:forEach var="trees" items="${listTree}">
                <tr style="text-align:center">
                    <td><c:out value="${trees.image1}" /></td>
                    <td><c:out value="${trees.image2}" /></td>
                    <td><c:out value="${trees.image3}" /></td>
                    <td><c:out value="${trees.address}" /></td>
                   	<td><c:out value="${trees.distance}" /></td>
                    <td><c:out value="${trees.width}" /></td>
                    <td><c:out value="${trees.height}" /></td>
                    <td><c:out value="${trees.treeID}" /></td>
                    <td><c:out value="${trees.requestID}" /></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>