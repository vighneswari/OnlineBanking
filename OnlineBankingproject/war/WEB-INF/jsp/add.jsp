
<html>
<head>
<script type="text/javascript" src="../javascript/validation.js">

</script>

<title>User Registration Form</title>
<style type="text/css">
/*dark background to support form theme*/
body{
  background:url(http://www.psdgraphics.com/file/fresh-green-background.jpg);
}

/*sass variables used*/
$full:100%;
$auto:0 auto;
$align:center;

@mixin disable{
  outline:none;
  border:none;
}

@mixin easeme{
  -webkit-transition:1s ease;
  -moz-transition:1s ease;
  -o-transition:1s ease;
  -ms-transition:1s ease;
  transition:1s ease;
}

/*site container*/
.wrapper{
  width:420px;
  margin:$auto;
}

h1{
  text-align:$align;
  padding:30px 0px 0px 0px;
  font:25px Oswald;
  color:#FFF;
  text-transform:uppercase;
  text-shadow:#000 0px 1px 5px;
  margin:0px;
}

p{
  font:13px Open Sans;
  color:#6E6E6E;
  text-shadow:#000 0px 1px 5px;
  margin-bottom:30px;
}

.form{
  width:$full;
}

input[type="text"],input[type="email"]{
  width:98%;
  padding:15px 0px 15px 8px;
  border-radius:5px;
  box-shadow:inset 4px 6px 10px -4px rgba(0,0,0,0.3), 0 1px 1px -1px rgba(255,255,255,0.3);
	background:rgba(0,0,0,0.2);
  @include disable;
  border:1px solid rgba(0,0,0,1);
  margin-bottom:10px;
  color:#6E6E6E;
  text-shadow:#000 0px 1px 5px;
}

input[type="submit"]{
  width:100%;
  padding:15px;
  border-radius:5px;
  @include disable;
  background-image: -webkit-gradient(linear, 0 0, 0 100%, from(#28D2DE), to(#1A878F));
  background-image: -webkit-linear-gradient(#28D2DE 0%, #1A878F 100%);
  background-image: -moz-linear-gradient(#28D2DE 0%, #1A878F 100%);
  background-image: -o-linear-gradient(#28D2DE 0%, #1A878F 100%);
  background-image: linear-gradient(#28D2DE 0%, #1A878F 100%);
  font:14px Oswald;
  color:#FFF;
  text-transform:uppercase;
  text-shadow:#000 0px 1px 5px;
  border:1px solid #000;
  opacity:0.7;
	-webkit-box-shadow: 0 8px 6px -6px rgba(0,0,0,0.7);
  -moz-box-shadow: 0 8px 6px -6px rgba(0,0,0,0.7);
	box-shadow: 0 8px 6px -6px rgba(0,0,0,0.7);
  border-top:1px solid rgba(255,255,255,0.8)!important;
  -webkit-box-reflect: below 0px -webkit-gradient(linear, left top, left bottom, from(transparent), color-stop(50%, transparent), to(rgba(255,255,255,0.2)));
}

input:focus{
  box-shadow:inset 4px 6px 10px -4px rgba(0,0,0,0.7), 0 1px 1px -1px rgba(255,255,255,0.3);
  background:rgba(0,0,0,0.3);
  @include easeme;
}

input[type="submit"]:hover{
  opacity:1;
  cursor:pointer;
}

.name-help,.email-help{
  display:none;
  padding:0px;
  margin:0px 0px 15px 0px;
}

.optimize{
  position:fixed;
  right:3%;
  top:0px;
}

</style>

</head>
<body>

<center><h3>USER REGISTRATION FORM</h3><center>
<body background="http://www.thestatebankgroup.com/sites/default/files/mobile-bkgr.jpg";>


<form action="/add" method="get" class="form" name="form" onsubmit="return registration()">


<table align="center" cellpadding = "10">

<tr> <div id="une"></div><p></p></tr>

<tr>

<td>UserName</td>

<td><p class="name">
<input type="text" name="name" id="name" placeholder"enter user name"maxlength="30"/>

(max 30 characters a-z and A-Z)

</td>
</p>
</tr>
</div>
<!----- Email Id ---------------------------------------------------------->

<tr>

<td>Email</td>

<td><p class="email"><input type="text" name="email" id="email"maxlength="100" /></td></p>

</tr>

 

<!----- Mobile Number ---------------------------------------------------------->

<tr>

<td>Mobile</td>

<td>
<p class="Mobile">
<input type="text" name="Mobile" maxlength="10" id="Mobile"/>

(10 digit number)

</td>
</p>
</tr>

 

<!----- Gender ----------------------------------------------------------->

<tr>

<td>Gender</td>

<td>

Male <input type="radio" name="Gender" value="Male" />

Female <input type="radio" name="Gender" value="Female" />

</td>

</tr>

 

<!----- Address ---------------------------------------------------------->

<tr>

<td>Address <br /><br /><br /></td>

<td><textarea name="Address" id="Address"rows="4" cols="30"></textarea></td>

</tr>

 

<!----- City ---------------------------------------------------------->


<td>City</td>

<td><p class="City"><input type="text" name="City" id="City"maxlength="30" />

(max 30 characters a-z and A-Z)

</td>
</p>
</tr>

<tr>

<td>Occupation</td>

<td>

Student

<input type="radio" name="Occupation" value="Student">

Employee

<input type="radio" name="Occupation" value="Employee">



</td>

</tr>
<tr> 
<td> AccountType</td>
<td><input type="text" name="AccountType" maxlength="30" />

(max 30 characters a-z and A-Z)
</td></tr>
 <tr>


<tr> 
<td> AccountNumber</td>
<td><p class="AccountNumber"><input type="text" name="AccountNumber" id="AccountNumber"maxlength="30" />

(max 16 Numbers only)
</td></p></tr>
 <tr>
 
 
 
<td>AadharNumber</td>

<td><p class="AadharNumber"><input type="text" name="AadharNumber" id="AadharNumber"maxlength="30" />

(max 15 numbers)

</td>

</tr>





<tr>

<td colspan="2" align="center">
<input class="submit" type="submit" value="submit"> 

<input type="reset" value="Reset">

</td>

</tr>

</table>

 

</form>

 

</body>

</html>