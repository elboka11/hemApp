<%@ page contentType="text/html;charset=UTF-8"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Admin InterFace</title>
    <h1>Admin workflow</h1>
</head>
<body>
<td>
    <a href="${pageContext.request.contextPath}/users/create">
        <button type="submit">Create new User</button>
    </a>
</td>
<td>
    <a href="${pageContext.request.contextPath}/users/read">
        <button type="submit">See All Users</button>
    </a>
</td>
<td>
    <a href="${pageContext.request.contextPath}/users/update">
        <button type="submit">Update User</button>
    </a>
</td>
<td>
    <a href="${pageContext.request.contextPath}/users/delete">
        <button type="submit">Delete user</button>
    </a>
</td>
<td>
    <a href="${pageContext.request.contextPath}/patients/create">
        <button type="submit">Create new patient</button>
    </a>
</td>
<td>
    <a href="${pageContext.request.contextPath}/patients/read">
        <button type="submit">See All Patients</button>
    </a>
</td>
<td>
    <a href="${pageContext.request.contextPath}/patients/update">
        <button type="submit">Update patient</button>
    </a>
</td>
<td>
    <a href="${pageContext.request.contextPath}/patients/delete">
        <button type="submit">Delete patient</button>
    </a>
</td>
<td>
    <a href="${pageContext.request.contextPath}/users/delete">
        <button type="submit">Delete</button>
    </a>
</td>
<td>
    <a href="${pageContext.request.contextPath}/logout">
        <button type="submit">Logout</button>
    </a>
</td>
</body>
</html>
