<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head><title>Registration</title></head>
<body>
	<div align="center">
		<p> ${errorOne } </p>
		<p> ${errorTwo } </p>
		<form action="treeSubmit" required>
			<h2>Tree 1</h2>
			<table border="1" cellpadding="5">
				<tr>
					<th>Image 1:</th>
					<td align="center" colspan="3">
						<input type="file" name="image1" accept="image/*" required>
					</td>
				</tr>
				<tr>
					<th>Image 2:</th>
					<td align="center" colspan="3">
						<input type="file" name="image1" accept="image/*" required>
					</td>
				</tr>
				<tr>
					<th>Image 3:</th>
					<td align="center" colspan="3">
						<input type="file" name="image1" accept="image/*" required>
					</td>
				</tr>
				<tr>
					<th>Address: </th>
					<td align="center" colspan="3">
						<input type="text" name="address" size="48" value="123 street, city, state" onfocus="this.value=''" required>
					</td>
	
				</tr>
				<tr>
					<th>distance (feet): </th>
					<td align="center" colspan="3">
						<input type="text" name="distance" size="11" value="ex. 12.5" onfocus="this.value=''" required>
					</td>
	
				</tr>
				<tr>
					<th>width (feet): </th>
					<td align="center" colspan="3"> 
						<input type="text" name="width" size="11" value="ex. 12.5" onfocus="this.value=''" required>
					</td>
				</tr>
				<tr>
					<th>height (feet): </th>
					<td align="center" colspan="3">
						<input type="text" name="height" size="11" value="ex. 12.5" onfocus="this.value=''" required>
					</td>
				
				</tr>
				<tr>
				
				</tr>
			</table>
			
			<h2>Tree 2</h2>
			<table border="1" cellpadding="5">
				<tr>
					<th>Image 1:</th>
					<td align="center" colspan="3">
						<input type="file" name="image1" accept="image/*" required>
					</td>
				</tr>
				<tr>
					<th>Image 2:</th>
					<td align="center" colspan="3">
						<input type="file" name="image1" accept="image/*" required>
					</td>
				</tr>
				<tr>
					<th>Image 3:</th>
					<td align="center" colspan="3">
						<input type="file" name="image1" accept="image/*" required>
					</td>
				</tr>
				<tr>
					<th>Address: </th>
					<td align="center" colspan="3">
						<input type="text" name="address" size="48" value="123 street, city, state" onfocus="this.value=''" required>
					</td>
	
				</tr>
				<tr>
					<th>distance (feet): </th>
					<td align="center" colspan="3">
						<input type="text" name="distance" size="11" value="ex. 12.5" onfocus="this.value=''" required>
					</td>
	
				</tr>
				<tr>
					<th>width (feet): </th>
					<td align="center" colspan="3"> 
						<input type="text" name="width" size="11" value="ex. 12.5" onfocus="this.value=''" required>
					</td>
				</tr>
				<tr>
					<th>height (feet): </th>
					<td align="center" colspan="3">
						<input type="text" name="height" size="11" value="ex. 12.5" onfocus="this.value=''" required>
					</td>
				
				</tr>
				<tr>
				
				</tr>
			</table>
			
			<h2>Tree 3</h2>
			<table border="1" cellpadding="5">
				<tr>
					<th>Image 1:</th>
					<td align="center" colspan="3">
						<input type="file" name="image1" accept="image/*" required>
					</td>
				</tr>
				<tr>
					<th>Image 2:</th>
					<td align="center" colspan="3">
						<input type="file" name="image1" accept="image/*" required>
					</td>
				</tr>
				<tr>
					<th>Image 3:</th>
					<td align="center" colspan="3">
						<input type="file" name="image1" accept="image/*" required>
					</td>
				</tr>
				<tr>
					<th>Address: </th>
					<td align="center" colspan="3">
						<input type="text" name="address" size="48" value="123 street, city, state" onfocus="this.value=''" required>
					</td>
	
				</tr>
				<tr>
					<th>distance (feet): </th>
					<td align="center" colspan="3">
						<input type="text" name="distance" size="11" value="ex. 12.5" onfocus="this.value=''" required>
					</td>
	
				</tr>
				<tr>
					<th>width (feet): </th>
					<td align="center" colspan="3"> 
						<input type="text" name="width" size="11" value="ex. 12.5" onfocus="this.value=''" required>
					</td>
				</tr>
				<tr>
					<th>height (feet): </th>
					<td align="center" colspan="3">
						<input type="text" name="height" size="11" value="ex. 12.5" onfocus="this.value=''" required>
					</td>
				
				</tr>
				<tr>
				
				</tr>
			</table>
			
			<td align="center" colspan="5">
					<input type="submit" value="Request"/>
			</td>
		</form>
		
		<a href="userView.jsp" target="_self">Return to Client Page</a>
	</div>
</body>