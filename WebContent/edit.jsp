<%@ page import="java.util.*,com.niit.editdelete.model.*,com.niit.editdelete.dao.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
   
<%
	String prodid = request.getParameter("prodid");
	out.println(prodid);
	productDB objdb = new productDB();

	List<product> obj = objdb.getall();
	for (int i = 0; i < obj.size(); i++)
	{
		if (obj.get(i).getProduct_id().equals(prodid)) {
			
%>

<form class="form-horizontal" action="editcontroller" method="post">
<fieldset>

<!-- Form Name -->
<legend>Form Name</legend>

<!-- Text input-->

<div class="form-group">
  <label class="col-md-4 control-label" for="textinput"></label>  
  <div class="col-md-4">
  <input id="productid" name="productid" type="text"  class="form-control input-md" value=<%=prodid %>>PRODUCT ID<br />
  <input id="prodname" name="prodname" type="text"  class="form-control input-md" value=<%=obj.get(i).getProduct_name() %>>PRODUCT NAME<br />
  <input id="catid" name="catid" type="text"  class="form-control input-md" value=<%=obj.get(i).getCategory_id() %>>CATEGORY ID<br />
  <input id="catname" name="catname" type="text"  class="form-control input-md" value=<%=obj.get(i).getProduct_category()%>>CATEGORY NAME<br />
  <input id="desc" name="desc" type="text"  class="form-control input-md" value=<%=obj.get(i).getProduct_discription()%>>PRODUCT DESCRIPTION<br />
  <input id="brand" name="brand" type="text"  class="form-control input-md" value=<%=obj.get(i).getProduct_brand()%>>PRODUCT BRAND<br />
  <input id="price" name="price" type="text"  class="form-control input-md" value=<%=obj.get(i).getPrice()%>>PRICE<br />
  <button name="act" value="update" type="submit" class="btn btn-success" >UPDATE</button>
  <button name="act" value="cancel" type="submit" class="btn btn-danger">CANCEL</button>
  
  </div>
  </div>





</fieldset>
</form>
<%			
		}

	}
%>

   
   
</body>
</html>