<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2>Employee info</h2>
<br>
<form:form action="saveEmployee" modelAttribute="employee">
  <form:hidden path="id"/>
  Name <form:input path="name"/>
  <br>
  Email <form:input path="email"/>
  <br>
  Password <form:input path="password"/>
  <input type="submit" value="save">
</form:form>
</body>
</html>
