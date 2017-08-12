<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fitness</title>
<style>
  body {
    background-color: #E6E6FA 
}
</style>
</head>
<body>
<center>
<h1>Fitness</h1>

<from action="#">
<table cellspacing="30">
<tr>
<td>User Id			:</td>	<td><input id = "userId" type = "text" placeholder = "User Id"></td>
</tr>
<tr>
<td>User Name		:</td>	<td><input id = "userName" type = "text" placeholder = "User Name"></td><td><p style="color:red;" id = "userNameh"></p></td>
</tr>
<tr>
<td>Running miles	:</td>	<td><input id = "running" type = "text" placeholder = "Running miles in Meters"></td><td><p style="color:red;" id="runningh"></p></td>
</tr>
<tr>
<td>Pushups			:</td>	<td><input id = "pushups" type = "text" placeholder = "Pushups"></td><td><p style="color:red;" id = "pushupsh"></p></td>
</tr><tr>
<td>Skippings		:</td>	<td><input id = "skippings" type = "text" placeholder = "skippings"></td><td><p style="color:red;" id = "skippingh"></p></td>
</tr><tr><td></td><td>
<input type = "submit" value="SUBMIT" onclick = "myFunction()"></td></tr>
</table>
</from>
</center>
<script>
function myFunction(){
	
	var runninginput,runningerror,pushupsinput,pushupserror,skippingsinput,skippingserror,userNameinput, userNameerror;
	runninginput = document.getElementById("running").value;
	pushupsinput = document.getElementById("pushups").value;
	skippingsinput = document.getElementById("skippings").value;
	userNameinput = document.getElementById("userName").value;
	
	if(! isNaN(userNameinput)){
		userNameerror = "Name is not valid, Alphabets only";
		document.getElementById("userNameh").innerHTML = userNameerror;
	} else {
		userNameerror = "";
		document.getElementById("userNameh").innerHTML = userNameerror;
	}
	if( isNaN(runninginput) ){
		runningerror = "Not a valid input";
		document.getElementById("runningh").innerHTML = runningerror;
	} else {
		runningerror = "";
		document.getElementById("runningh").innerHTML = runningerror;
	}
	
	if( isNaN(pushupsinput) ){
		pushupserror = "Not a valid input";
		document.getElementById("pushupsh").innerHTML = pushupserror;
	} else {
		pushupserror = "";
		document.getElementById("pushupsh").innerHTML = pushupserror;
	}
	
	if(isNaN(skippingsinput)){
		skippingserror = "Not a valid input";
		document.getElementById("skippingh").innerHTML = skippingserror;
	} else {
		skippingserror = "";
		document.getElementById("skippingh").innerHTML = skippingserror;
	}
}
</script>

</body>
</html>