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
<title>Transaction</title>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
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
				<li class="nav-item"><a class="nav-link" href="transfer.jsp">Transfer
						Money</a></li>

			</ul>

		</div>
	</div>
	</nav>



	<div
		class="container-sm constainer-md position-absolute top-50 start-50 translate-middle text-center">
		<h1 class="text-center">Transfer Money</h1>
		<form action="transfer.jsp">

			<div class="row mb-3 mx-auto w-25">
				<label for="inputEmail3" class="col-sm-2 col-form-label">From</label>
				<select class="form-select" aria-label="Default select example"
					name="from">
					<option selected>From</option>
					<option value="Jash Patel">Jash Patel</option>
					<option value="Aelis Patel">Aelis Patel</option>
					<option value="Neel Patel">Neel Patel</option>
					<option value="Karan Buha">Karan Buha</option>
					<option value="Smit Dungarani">Smit Dungarani</option>
					<option value="Sagar Gajera">Sagar Gajera</option>
					<option value="Dhrumit Patel">Dhrumit Patel</option>
					<option value="Preet Marakana">Preet Marakana</option>
					<option value="Bhavya Soni">Bhavya Soni</option>
					<option value="Jayesh Prajapati">Jayesh Prajapati</option>
				</select>
			</div>
			<div class="row mb-3 mx-auto w-25">
				<label for="inputEmail3" class="col-sm-2 col-form-label">To</label>
				<select class="form-select" aria-label="Default select example"
					name="to">
					<option selected>To</option>
					<option value="Jash Patel">Jash Patel</option>
					<option value="Aelis Patel">Aelis Patel</option>
					<option value="Neel Patel">Neel Patel</option>
					<option value="Karan Buha">Karan Buha</option>
					<option value="Smit Dungarani">Smit Dungarani</option>
					<option value="Sagar Gajera">Sagar Gajera</option>
					<option value="Dhrumit Patel">Dhrumit Patel</option>
					<option value="Preet Marakana">Preet Marakana</option>
					<option value="Bhavya Soni">Bhavya Soni</option>
					<option value="Jayesh Prajapati">Jayesh Prajapati</option>
				</select>
			</div>
			<div class="row mb-3 mx-auto w-25">
				<label for="inputPassword3"
					class="col-sm-2 col-form-label text-center"
					style="margin-right: 10px;">Transfer</label>
				<div class="col-sm-15">
					<input type="text" class="form-control" name="money"
						id="inputPassword3">
				</div>
			</div>


			<div class="container mx-auto w-50 text-center ">

				<button type="submit" class="btn btn-primary">Transfer</button>


			</div>

		</form>
	</div>
	

	<%
		String from = request.getParameter("from");
		String to = request.getParameter("to");
		String amount = request.getParameter("money");
		if (from != null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");

				java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking", "root",
						"root");
				Statement st = con.createStatement();

				String sql = "update banking.customer set balance=balance+" + amount + " where Name='" + to + "' ";
				String sql1 = "update banking.customer set balance=balance-" + amount + " where Name='" + from
						+ "' ";
				int i = st.executeUpdate(sql);
				int j = st.executeUpdate(sql1);
			} catch (Exception e) {
				System.out.print(e);
				e.printStackTrace();
			}
			out.println("<script>alert('Successfully Transaction Completed')</script>");
		}
	%>
	<footer class="footer mt-auto py-3 bg-light">
	<div class="container text-center">
		<span class="text-muted text-center">This is made by Jash Patel</span>
	</div>
	</footer>




</body>
</html>