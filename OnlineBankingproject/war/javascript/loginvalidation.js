

var Name= /^[A-Za-z0-9_]{1,8}$/;
var Mobile= /^[A-Za-z0-9!@#$%^&*()_]{6,10}$/;

function login() {

	var checkName = form.name.value;
	var checkMobile = form.Mobile.value;
	
 if(!Name.test(checkName))  
 {   document.getElementById('login').innerHTML = "enter your username";  
 form.name.focus();   return(false);  }
 
 if(!Mobile.test(checkMobile))   
 {   document.getElementById('login').innerHTML = "enter your Mobile Number"; 
 form.Mobile.focus();   return(false);    } 
  
 
}