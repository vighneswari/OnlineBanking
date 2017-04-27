<!DOCTYPE html>
<html>
<head>
<script  language="JavaScript"type='text/javascript'>

function foo() {


var user_choice = window.confirm('Would you like to continue?');


if(user_choice==true) 
{


window.location='your url';  // you can also use element.submit() if your input type='submit' 


} else {


return false;


}
}

</script>
<style>
/*
	Theme Name: CSS3 Contact Form
	Date: April 2013
	Description: Basic HTML5/CSS3 contact form
	Version: 1.0
	Author: Christian Vasile
	Author URL: http://christianvasile.com
*/

/* ===========================
   ======= Body style ======== 
   =========================== */

body {
	padding: 50px 100px;
	font-size: 13px;
	font-style: Verdana, Tahoma, sans-serif;
}

h2 {
	margin-bottom: 20px;
	color: #474E69;
}

/* ===========================
   ====== Contact Form ======= 
   =========================== */

input, textarea {
	padding: 10px;
	border: 1px solid #E5E5E5;
	width: 200px;
	color: #999999;
	box-shadow: rgba(0, 0, 0, 0.1) 0px 0px 8px;
	-moz-box-shadow: rgba(0, 0, 0, 0.1) 0px 0px 8px;
	-webkit-box-shadow: rgba(0, 0, 0, 0.1) 0px 0px 8px;		
}

textarea {
	width: 400px;
	height: 150px;
	max-width: 400px;
	line-height: 18px;
}

input:hover, textarea:hover,
input:focus, textarea:focus {
	border-color: 1px solid #C9C9C9;
	box-shadow: rgba(0, 0, 0, 0.2) 0px 0px 8px;
	-moz-box-shadow: rgba(0, 0, 0, 0.2) 0px 0px 8px;
	-webkit-box-shadow: rgba(0, 0, 0, 0.2) 0px 0px 8px;	
}

.form label {
	margin-left: 10px;
	color: #999999;
}

/* ===========================
   ====== Submit Button ====== 
   =========================== */

.submit input {
	width: 100px; 
	height: 40px;
	background-color: #474E69; 
	color: #FFF;
	border-radius: 3px;
	-moz-border-radius: 3px;
	-webkit-border-radius: 3px;		
}
</style>
<body background="http://static1.squarespace.com/static/5216a5a3e4b03ea294407d0d/t/5219376ee4b00b7f8bace9e4/1377384304013/contact.jpg?format=1500w">

	<h2>Contact Form</h2>
	
	<form class="form" method="Get" action="/contactusok">
		
		<p class="name">
			<input type="text" name="name" id="name" placeholder="John Doe" />
			<label for="name">Name</label>
		</p>
		
		<p class="email">
			<input type="text" name="email" id="email" placeholder="mail@example.com"/>
			<label for="email">Email</label>
		</p>
		
		<p class="web">
			<input type="text" name="web" id="web" placeholder=" Enter Mobile Number"/>
			<label for="web">Contact Number</label>
		</p>		
	
		<p class="text">
			<textarea name="text" placeholder="Write something to us" /></textarea>
		</p>
		
		<p class="submit">
			<input type="submit" value="submit" onClick="foo()"/>
		</p>
	</form>
<script type="text/javascript">(function() {var stag = document.createElement('script'); stag.type = "text/javascript"; stag.async = true; stag.src=('https:' == document.location.protocol ?"https://webchat.voicecurve.com":"http://webchat.a-cti.com")+"/livechat/script/1930007714"; var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(stag,s);})();</script>

</body>

</html>
