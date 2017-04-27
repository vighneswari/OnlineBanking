<%@ page import="com.customers.Customer" %>
<%@ page import="com.google.appengine.api.datastore.KeyFactory" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Update Customer</h1>
	
	<%
		Customer customer = new Customer();
	
		if(request.getAttribute("customer")!=null){
		
			customer = (Customer)request.getAttribute("customer");
			
		}
		
	%>
	
	<form method="post" action="../update" >
		<input type="hidden" name="key" id="key" 
			value="<%=KeyFactory.keyToString(customer.getKey()) %>" /> 
		
		<table>
			<tr>
				<td>
					UserName :
				</td>
				<td>
					<input type="text" style="width: 185px;" 
                                             maxlength="30" name="name" id="name" 
						value="<%=customer.getName() %>" />
				</td>
			</tr>
			<tr>
				<td>
					Email :
				</td>
				<td>
					<input type="text" style="width: 185px;" 
                                             maxlength="30" name="email" id="email" 
						value="<%=customer.getEmail() %>" />
				</td>
			</tr>
			<tr>
				<td>
					Address :
				</td>
				<td>
					<input type="text" style="width: 185px;" 
                                             maxlength="30" name="Address" id="Address" 
						value="<%=customer.getAddress() %>" />
				</td>
			</tr>
		</table>
		<input type="submit" class="update" title="Update" value="Update" />
	</form>
</body>
</html>