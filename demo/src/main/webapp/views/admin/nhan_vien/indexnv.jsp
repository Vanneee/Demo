<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>

<html>
<head>
    <title>Nhanvien</title>
</head>
<body>
<sf:form method="post" action="/admin/nhan-vien/store" modelAttribute="nv">


<table class="table">
    <thead>
    <tr>
        <th>Mã</th>
        <th>Họ</th>
        <th>Đệm</th>
        <th>Tên</th>
        <th>Giới Tính</th>
        <th>SDT</th>
        <th>Ngày Sinh</th>
        <th>Địa chỉ</th>
        <th>Cửa hàng</th>
        <th>Chức vụ</th>
        <th>Mật khẩu</th>
        <%--                <th>Email</th>--%>
        <th>Trạng Thái</th>


        <th colspan="2">Thao tác</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${ ds }" var="nv">
        <tr>
            <td>${ nv.ma }</td>
            <td>${ nv.ho }</td>
            <td>${ nv.tenDem }</td>
            <td>${ nv.ten }</td>
            <td>${nv.gioiTinh == "1" ? "Nam" : "Nữ" }</td>
            <td>${ nv.sdt }</td>
            <td>${ nv.ngaySinh}</td>
            <td>${ nv.diaChi }</td>
            <td>${ nv.cuaHang}</td>
            <td>${ nv.chucVu }</td>
            <td>${ nv.matkhau }</td>

            <td>${ nv.trangThai == "1" ? "Đang làm" : "Nghỉ" }</td>
            <td>
                <a href="#" class="btn btn-primary">Cap nhat</a>
            </td>
            <td>
                <a href="/admin/nhan-vien/delete/${nv.ma }" class="btn btn-danger">Xoa</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</sf:form>

</body>


</html>