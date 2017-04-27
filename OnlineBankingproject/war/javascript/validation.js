
var nameVar=/^[A-Za-z]+$/;
var emailVar= /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i;
var CityVar= /^[A-Za-z]+$/;
var AccountNumberVar=/^([0-9]{4}[\s-]?){3}([0-9]{4})$;
function registration() 
{
	alert("hai vijju");
	var checkName = form.name.value;
	var checkEmail = form.email.value;
	var checkCity=form.City.value;
	var checkAccountNumber=form.AccountNumber.value;
	
	if (!nameVar.test(checkName)) 
	{
		document.getElementById('une').innerHTML = "enter your name";
		form.name.focus();
		return (false);
	}
	
	if (!emailVar.test(checkEmail)) 
	{
		document.getElementById('une').innerHTML = "enter valid email ";
		form.email.focus();
		return (false);
	}
	
	if (!CityVar.test(checkCity)) {
		document.getElementById('une').innerHTML = "enter your city name";
		form.City.focus();
		return (false);
	}
	if (!AccountNumberVar.test(checkAccountNumber)) {
		document.getElementById('une').innerHTML = "enter your AccountNumber properly";
		form.AccountNumber.focus();
		return (false);
	}
	
}