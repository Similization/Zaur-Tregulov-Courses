<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<body>
<h2>Employee Info</h2>
<security:authorize access="hasRole('HR')">
    <input type="button" value="get salary" onclick="window.location.href = 'hr_info'">
    only for hr staff
</security:authorize>
<br><br>
<security:authorize access="hasRole('MANAGER')">
    <input type="button" value="performance" onclick="window.location.href = 'manager_info'">
    only for managers
</security:authorize>
</body>
</html>
