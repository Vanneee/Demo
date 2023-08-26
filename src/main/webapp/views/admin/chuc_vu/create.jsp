<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>ChucVu</title>
    <%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
</head>
<body>
<sf:form method="post" action="${action}" modelAttribute="cv">
    <div>
        <label>Mã</label>
        <sf:input path="ma" />
        <div>
            <small><sf:errors path="ma" /></small>
        </div>
    </div>
    <div>
        <label>Tên</label>
        <sf:input path="ten" />
        <sf:errors path="ten" />
    </div>

    <div>
        <button>Thêm mới</button>
    </div>

</sf:form>

</body>
</html>