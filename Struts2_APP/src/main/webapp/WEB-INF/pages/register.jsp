<%@ page language="java" contentType="text/html; charset=ISO-8859-2"
    pageEncoding="ISO-8859-2"%>
     <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.02 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-2">
<title>Regsitration Form</title>
</head>
<body>
<h2>Please register with your details</h2>
<s:form action="registration.do" method="POST" namespace="/" autocomplete="off">
<s:token/>
<table align="left" border="0.5" cellpadding="2" cellspacing="2">
<tr>
	<td rowspan="2" valign="top" align="center"><label for="username">Username</label></td>
	<td rowspan="2"valign="top" align="center"><s:textfield name="userName"/></td>
</tr>
<tr>
	<td rowspan="2" valign="top" align="center"><label for="password">Password</label></td>
	<td rowspan="2" valign="top" align="center"><s:password name="password"/></td>
</tr>
<tr>
	<td rowspan="2" valign="top" align="center"><label for="gender">Gender</label></td>
	<td rowspan="2" valign="top" align="center"><s:textfield name="gender"/></td>
</tr>
<tr>
	<td rowspan="2" valign="top" align="center"><label for="occupation">Occupation</label></td>
	<td rowspan="2" valign="top" align="center"><s:textfield name="occupation"></s:textfield></td>
</tr>
<tr>
	<td rowspan="2" valign="top" align="center"><label for="age">Age</label></td>
	<td rowspan="2" valign="top" align="center"><s:textfield name="age"></s:textfield></td>
</tr>
<tr><td rowspan="1" valign="middle"><s:submit align="right" /></td></tr>
</table>

</s:form>
</body>
</html>