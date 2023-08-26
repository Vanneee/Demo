
<%@ page language="java" pageEncoding="UTF-8" %>

<html>
<head>
    <title>SD17321</title>
</head>
<body>
<form action="/login" method="POST">
    <div>
        <label>Email</label>
        <input type="email" name="email">
    </div>
    <div>
        <label>password</label>
        <input type="password" name="password">
    </div>
    <div>
        <input type="checkbox" name="remember">
        <lable>Ghi nhớ đăng nhập</lable>
    </div>
    <div>
        <button>Login</button>
    </div>
</form>
</body>
</html>