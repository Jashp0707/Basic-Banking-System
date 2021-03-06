<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
	crossorigin="anonymous"></script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x"
	crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark" >
	<div class="container-fluid">
		<a class="navbar-brand" href="#">Banking System</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav me-auto mb-2 mb-lg-0">
				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="index.jsp">Home</a></li>
				<li class="nav-item"><a class="nav-link" href="customer.jsp">Customer</a></li>
				<li class="nav-item"><a class="nav-link" href="transfer.jsp">Transfer Money</a></li>
				
			</ul>
			
		</div>
	</div>
	</nav>
	
	
	<div class="container">
	<h1 class="text-center">Customer Details</h1>
	<table border="1" class="container-sm constainer-md   text-center table table-dark table-striped" >
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Email-id</th>
			<th>Age</th>
			<th>Balance</th>
			
			
		</tr>
		<%
		Class.forName("com.mysql.jdbc.Driver");

		java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking", "root", "root");
		Statement st= con.createStatement();
		
		String sql="select * from banking.customer ";
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()){
			%>
	<tr>
		<td>
			<%
				out.println(rs.getString("ID"));
			%>
		</td>
		<td>
			<%
				out.println(rs.getString("Name"));
			%>
		</td>
		<td>
			<%
				out.println(rs.getString("email_id"));
			%>
		</td>
		<td>
			<%
				out.println(rs.getString("age"));
			%>
		</td>
		<td>
			<%
				out.println(rs.getString("balance"));
			%>
		</td>
		
		
	</tr>
	


		<%} %>
		</table>
		</div>
		<footer class="footer mt-auto py-3 bg-light">
	<div class="container text-center">
		<span class="text-muted text-center">This is made by Jash Patel</span>
	</div>
	</footer>
</body>
</html>