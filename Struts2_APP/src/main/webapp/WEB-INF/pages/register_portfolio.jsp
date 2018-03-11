<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Portfolio Registration</title>
</head>
<body>
<h3>Upload document to complete registration.</h3>
<s:form action="portfolio-handler.do" method ="POST" enctype="multipart/form-data">
<s:token/>
<table align="left" border="0.5" cellpadding="2" cellspacing="2">
<tr>
	<td rowspan="2" valign="top" align="center"><label for="protfolio">Portfolio</label></td>
	<td rowspan="2" valign="top" align="center"><s:file name="portfolio_doc"></s:file></td>
</tr>
<tr><td rowspan="1" valign="middle"><s:submit align="right" /></td></tr>
</table>
</s:form>
</body>
</html>