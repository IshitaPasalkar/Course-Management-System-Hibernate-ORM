<%@ page import="java.util.List" %>
<%@ page import="com.enrollment.entity.Course" %>

<html>

<head>
    <title>Enroll Course</title>
</head>

<body>

<h2>Available Courses</h2>

<%
List<Course> courses =
(List<Course>) request.getAttribute("courses");
%>

<table border="1">

<tr>
    <th>Course</th>
    <th>Instructor</th>
    <th>Duration</th>
</tr>

<%
for(Course course : courses){
%>

<tr>
    <td><%= course.getCourseName() %></td>
    <td><%= course.getInstructor() %></td>
    <td><%= course.getDuration() %></td>
</tr>

<%
}
%>

</table>

<br>

<h2>Enroll Student</h2>

<form action="enroll" method="post">

Student Name:

<input type="text"
       name="studentName"
       required>

<br><br>

Email:

<input type="email"
       name="email"
       required>

<br><br>

Course:

<select name="courseName">

<%
for(Course course : courses){
%>

<option value="<%=course.getCourseName()%>">
    <%=course.getCourseName()%>
</option>

<%
}
%>

</select>

<br><br>

<input type="submit"
       value="Enroll">

</form>

</body>

</html>