<%@ page import="java.util.*,com.niit.editdelete.model.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="carousel.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<style>
.carousel-inner>.item>img, .carousel-inner>.item>a>img {
	width: 70%;
	margin: auto;
}
</style>
<title>home</title>
</head>
<body>
<center><h2 style="color:green">PRODUCT DETAILS</h2></center>
<%! static boolean flag = false; 

%>
<%
			
			ServletContext ctx = getServletContext();
			List<product> obj;
			if(!flag)
			{
			productDB objdb = new productDB();
			obj = objdb.getall();
			
			ctx.setAttribute("obj", obj);
			flag=true;
			}
			else
			{
			
			obj = (List<product>)ctx.getAttribute("obj");
			}
		%>
		
		<table class="table">
			<thead class="thead-default">
				<tr>
					<th>Product id</th>
					<th>Product name</th>
					<th>Category id</th>
					<th>Category Name</th>
					<th>Description</th>
					<th>Brand</th>
					<th>Price</th>
					<th>Options</th>
				</tr>
			</thead>
			<tbody>
				<%
					for (int i = 0; i < obj.size(); i++) {
				%>
				<tr>
					<td><%=obj.get(i).getProduct_id()%></td>
					<td><%=obj.get(i).getProduct_name()%></td>
					<td><%=obj.get(i).getCategory_id()%></td>
					<td><%=obj.get(i).getProduct_category()%></td>
					<td><%=obj.get(i).getProduct_discription()%></td>
					<td><%=obj.get(i).getProduct_brand()%></td>
					<td><%=obj.get(i).getPrice() %></td>
					<td><a href="edit.jsp?prodid=<%=obj.get(i).getProduct_id()%>" class="btn btn-primary" role="button"  >EDIT</a>
					<a href="delete.jsp?prodid=<%=obj.get(i).getProduct_id()%>" class="btn btn-danger" role="button"  >DELETE</a>
						</td>

				</tr>

				<%
					}
				%>
			
		</table>
		<center><a href="addprod.jsp" class="btn btn-danger" role="button" class="btn btn-info">ADD PRODUCT</a></center>
	
</body>
</html>


