<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@taglib
uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring Login Form</title>
 <script type="text/javascript">
            function validate()
            {
                var a = document.getElementById("a");
                var b = document.getElementById("b");
             //   var c = document.getElementById("a").value;
               // var d = document.getElementById("b").value;
               
                var valid = true;
                if(a.value.length<=0 || b.value.length<=0)
                    {
                        alert("Don't leave the field empty!");
                        valid = false;
                    }
                    else{
                    	return valid;
                }
                
            };
        </script>
</head>
<body>
<form:form name="login" action="login" method="POST" onsubmit="return validate();">
<div align="center">
<table>
<tr>
<td>User Name</td>
<td><input type="text" name="userName" id="a" /></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="password" id="b" /></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Submit" /></td>
</tr>
</table>
<div style="color: red">${error}</div>

</div>
</form:form>
</body>
</html>