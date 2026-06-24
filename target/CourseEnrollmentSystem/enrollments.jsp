<%@ page import="java.util.List" %>
<%@ page import="com.enrollment.entity.Enrollment" %>

<html>

<head>
    <title>Enrollment History</title>
</head>

<body>

<h2>Enrollment History</h2>

<%
List<Enrollment> enrollments =
(List<Enrollment>) request.getAttribute("enrollments");
%>

<table border="1">

<tr>
    <th>Student</th>
    <th>Email</th>
    <th>Course</th>
</tr>

<%
for(Enrollment e : enrollments){
%>

<tr>
    <td><%= e.getStudentName() %></td>
    <td><%= e.getEmail() %></td>
    <td><%= e.getCourseName() %></td>
</tr>

<%
}
%>

</table>

<br>

<a href="courses">
    Enroll Another Student
</a>

</body>

</html>