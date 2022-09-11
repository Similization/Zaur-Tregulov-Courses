<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3>Please enter information about yourself</h3>

<form:form action="showInfo" modelAttribute="employee">
    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br><br>
    Age <form:input path="age"/>
    <form:errors path="age"/>
    <br><br>
<%--    Salary <form:select path="salary">--%>
<%--        <form:option value="500" label="junior"/>--%>
<%--        <form:option value="1000" label="middle"/>--%>
<%--        <form:option value="1500" label="senior"/>--%>
<%--        <form:option value="2500" label="master"/>--%>
<%--    </form:select>--%>
<%--    <br><br>--%>
    Department <form:select path="department">
        <form:options items="${employee.departments}"/>
    </form:select>

    <br><br>
    Which car would you like to have?
<%--    <br><br>--%>
<%--    BMV <form:radiobutton path="carName" value="BMV"/>--%>
<%--    <br><br>--%>
<%--    Mercedes <form:radiobutton path="carName" value="Mercedes"/>--%>
<%--    <br><br>--%>
<%--    Ferrari <form:radiobutton path="carName" value="Ferrari"/>--%>

    <br><br>
    <form:radiobuttons items="${employee.cars}" path="car"/>

    <br><br>
    Foreign language(s):
<%--    EN <form:checkbox path="languages" value="English"/>--%>
<%--    FR <form:checkbox path="languages" value="French"/>--%>
<%--    RU <form:checkbox path="languages" value="Russian"/>--%>
    <form:checkboxes path="languages" items="${employee.allLanguages}"/>

    <br><br>
    Phone number <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>

    <br><br>
    Email <form:input path="email"/>
    <form:errors path="email"/>

    <br><br>
    <input type="submit" value="OK">
</form:form>

</body>
</html>
