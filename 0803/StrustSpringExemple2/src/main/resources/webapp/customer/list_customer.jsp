<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Struts + Spring + Hibernate example</h1>

<h2>List All Customers</h2>

<table border="1">
<tr><td>Customer Name</td><td>Address</td></tr>

<logic:iterate id="customer" name="dynaCustomerListForm" property="customerList">
<tr>	
<td><bean:write name="customer" property="name"/></td>
<td><bean:write name="customer" property="address"/></td>
</tr>
</logic:iterate> 

</table>

<br/>
<br/>
<html:link action="/AddCustomerPage.do">Add Customer</html:link>
</body>
</html>