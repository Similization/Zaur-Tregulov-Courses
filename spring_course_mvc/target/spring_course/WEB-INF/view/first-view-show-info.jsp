<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>Welcome!</h2>

Dear ${employee.name} ${employee.surname}, we are glad that you became a part of our community.
<br>
Your current statistic is:
<br>
Age: ${employee.age}
<br>
Department: ${employee.department}
<br>
Car: ${employee.car}
<br>
Language(s):
<ul>
    <c:forEach var="language" items="${employee.languages}">
        <li>
            ${language}
        </li>
    </c:forEach>
</ul>
<br>
Phone number: ${employee.phoneNumber}
<br>
Email: ${employee.email}
<br>
<a href="http://localhost:8080/spring_course_war_exploded/">back</a>

</body>
</html>
