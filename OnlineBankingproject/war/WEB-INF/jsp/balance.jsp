
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">



<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
.event {
	background-color: white;
}ß
deposit
full
</style>
</head>
<body background="http://i.huffpost.com/gen/1760949/images/o-BALANCE-SCALE-facebook.jpg";>

<form action="/login/deposit" method="post">

<p>withdraw page</p><center><form name=F1 onSubmit="return dil(this)" action="withdraw.jsp">
<table cellspacing="5" cellpadding="3">
<tr><td class="event">ACCOUNT NO:</td>
<td><input type="text" name="accountno" /></td>
</tr>	<tr><td class="event">USER NAME:</td><td><input type="text" name="username" /></td></tr>
<tr><td class="event">PASSWORD:</td><td><input type="password" name="password" /></td></tr>
<tr><td class="event">BAlANCE AMOUNT:</td><td><input type="text" name="amount" /></td></tr>

	<!-- Gender:<br/><br/>

Male<input type="radio" name="gender" value="male"> Female<input type="radio" name="gender" value="female"/><br/><br/> -->

<tr><td></td><td><input type="submit" value="Submit" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

				<INPUT TYPE=RESET VALUE="CLEAR"></td>
					</tr>

				</table>
				</form>

		</center>


	</form>



</body>



</html>