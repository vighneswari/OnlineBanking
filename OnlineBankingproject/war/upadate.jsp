<%@ page import="com.vighneswari.Register" %>
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
<h1>Update AccountHolder</h1>
	
	<%
		Register register = new Register();
	
		if(request.getAttribute("register")!=null){
		
			register = (Register)request.getAttribute("register");
			
		}
		
	%>
	
	<form method="post" action="../update" >
		<input type="hidden" name="key" id="key" 
			value="<%=KeyFactory.keyToString(register.getKey()) %>" /> 
		
		<table>
			<tr>
				<td>
					UserName :
				</td>
				<td>
					<input type="text" style="width: 185px;" 
                                             maxlength="30" name="name" id="name" 
						value="<%=register.getName() %>" />
				</td>
			</tr>
			<tr>
				<td>
					Email :
				</td>
				<td>
					<input type="text" style="width: 185px;" 
                                             maxlength="30" name="email" id="email" 
						value="<%=register.getEmail() %>" />
				</td>
			</tr>
			<tr>
				<td>
					Address :
				</td>
				<td>
					<input type="text" style="width: 185px;" 
                                             maxlength="30" name="Address" id="Address" 
						value="<%=register.getAddress() %>" />
				</td>
			</tr>
			<tr>
				<td>
					Mobile :
				</td>
				<td>
					<input type="text" style="width: 185px;" 
                                             maxlength="30" name="Mobile" id="Mobile" 
						value="<%=register.getMobile() %>" />
				</td>
			</tr>
			<tr>
				<td>
					Gender :
				</td>
				<td>
					<input type="text" style="width: 185px;" 
                                             maxlength="30" name="Gender" id="Gender" 
						value="<%=register.getGender() %>" />
				</td>
			</tr>
			<tr>
				<td>
					City :
				</td>
				<td>
					<input type="text" style="width: 185px;" 
                                             maxlength="30" name="City" id="City" 
						value="<%=register.getCity() %>" />
				</td>
			</tr>
			<tr>
				<td>
					AccountType :
				</td>
				<td>
					<input type="text" style="width: 185px;" 
                                             maxlength="30" name="AccountType" id="AccountType" 
						value="<%=register.getAccountType() %>" />
				</td>
			</tr>
			<tr>
				<td>
					AadharNumber :
				</td>
				<td>
					<input type="text" style="width: 185px;" 
                                             maxlength="30" name="AadharNumber" id="AadharNumber" 
						value="<%=register.getAadharNumber() %>" />
				</td>
			</tr>
		</table>
		<input type="submit" class="update" title="Update" value="Update" />
	</form>
</body>
</html>