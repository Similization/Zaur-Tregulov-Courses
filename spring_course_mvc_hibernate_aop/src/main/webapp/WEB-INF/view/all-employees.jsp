<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<h2>All Employees</h2>
<br>
<table>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>email</th>
        <th>password</th>
        <th>operations</th>
    </tr>
    <c:forEach var="employee" items="${allEmployees}">
        <c:url var="updateButton" value="/updateEmployeeInfo">
            <c:param name="employeeId" value="${employee.id}"/>
        </c:url>
        <c:url var="deleteButton" value="/deleteEmployee">
            <c:param name="employeeId" value="${employee.id}"/>
        </c:url>
        <tr>
            <td>${employee.id}</td>
            <td>${employee.name}</td>
            <td>${employee.email}</td>
            <td>${employee.password}</td>
            <td>
                <input type="button" value="update" onclick="window.location.href = '${updateButton}'">
                <input type="button" value="delete" onclick="window.location.href = '${deleteButton}'">
            </td>
        </tr>
    </c:forEach>
</table>
<br>
<input type="button" value="add" onclick="window.location.href = 'addNewEmployee'">
</body>
</html>
