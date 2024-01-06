<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login Page</title>
    <h1>Login</h1>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>userName</th>
        <th>Password</th>
    </tr>
    </thead>
    <tbody>
    <form action="/login" method="get">
        <tr>
            <td><label>
                <input type="Text" name="UserName" placeholder="Enter your UserName">
            </label></td>
            <td><label>
                <input type="Text" name="UserPassword" placeholder="Enter your UserPassword">
            </label></td>
            <td><input type="submit"  value="Login" ></td>
        </tr>
    </form>
    </tbody>
</table>
</body>
</html>
