
<%@ page import="java.util.List" %>
<%@ page import="com.vighneswari.CustomerBal" %>
<%@ page import="com.google.appengine.api.datastore.KeyFactory" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<form action="/list" method="get" onsubmit="validatform();">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ADMIN VIEW</title>
</head>
<body>
<h1>hai this online banking example list page</h1>

	Function : <a href="/add">Add Customer</a>
	<hr />

	<h2>All Account Holder Details</h2>
	<table border="1">
		<thead>
			<tr>
				<td>name</td>
				
				<td>mobile</td>
				
				<td>Balance</td>
				
				<td>AccountNumber</td>
				<td>Accounttype</td>
			</tr>
		</thead>
		
		<%
			
		
				
			List<CustomerBal> bank = 
                           (List<CustomerBal>)request.getAttribute("bankList");
				
			
				 for(CustomerBal c : bank)
				 {
						 
		%>
				<tr>
				  <td><%=c.getname() %></td>
				 <td><%=c.getBalance() %></td>
				   
				    <td><%=c.getMobile() %></td>
				     
				       
				            <td><%=c.getAccountType() %></td>
				           <td><%=c.getAccountNumber() %></td>
				          
				 
				  <%-- <td><a href="update/<%=c.getname()%>">Update</a> | 
                                      <a href="delete/<%=KeyFactory.keyToString(c.getKey()) %>">
                                       Delete</a>
                                  </td> --%>
				</tr>
		<%	
			
				}
		    
			
		   
		%>
         
        </tr>
     
	</table>
</body>
</html>