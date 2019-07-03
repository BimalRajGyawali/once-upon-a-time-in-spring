<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!-- for using spring tags -->
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>





<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Employee Form</h1>

	<hr>

	<spring:form action="employee" method="post" modelAttribute="emodel">

		<table>
			<tr>
				<td>FirstName</td>
				<td><spring:input path="fname" /></td>
			</tr>

			<tr>
				<td>LastName</td>
				<td><spring:input path="lname" /></td>
			</tr>

			<tr>
				<td>Gender
				<spring:radiobutton path="gender" value="male" />Male
			   	<spring:radiobutton path="gender" value="female" />Female	
				</td>
				
			</tr>

			<tr>
				<td>Company</td>
				<td><spring:input path="company" /></td>
			</tr>

			<tr>
				<td>Post</td>
				<td><spring:input path="post" /></td>
			</tr>

			<tr>
				<td>DateOfBirth</td>
				<td><spring:input path="dob" type="date"/></td>
			</tr>

			<tr>
				<td>JoiningDate</td>
				<td><spring:input path="joiningDate" type="date" /></td>
			</tr>

			<tr>
				<td>Salary</td>
				<td><spring:input path="salary" /></td>
			</tr>

			

			<tr>
				<td>Email</td>
				<td><spring:input path="email" /></td>
			</tr>


			<tr>
				<td>Country</td>
				<td><spring:input path="address.country" /></td>
			</tr>

			<tr>
				<td>City</td>
				<td><spring:input path="address.city" /></td>
			</tr>

			<tr>
				<td>State</td>
				<td><spring:select path="address.state">

						<spring:option value="">---select---</spring:option>
						<spring:option value="1">state-1</spring:option>
						<spring:option value="2">state-2</spring:option>
						<spring:option value="3">state-3</spring:option>
						<spring:option value="4">state-4</spring:option>
						<spring:option value="5">state-5</spring:option>
						<spring:option value="6">state-6</spring:option>
						<spring:option value="7">state-7</spring:option>




					</spring:select></td>
			</tr>

			<tr>
				<td><input type="submit" value="Save"></td>

			</tr>

		</table>


	</spring:form>


</body>
</html>