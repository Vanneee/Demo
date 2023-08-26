<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>
<html>
<head>
<title>KhachHang</title>
</head>
<body>

<table class="table">
    <thead>
    <tr>
        <th>Mã</th>
        <th>Họ</th>
        <th>Đệm</th>
        <th>Tên</th>
        <th>Ngày sinh</th>
        <th>SDT</th>
        <th>Địa chỉ</th>
        <th>Thành phố</th>
        <th>Quốc gia</th>
        <th>Mật Khẩu</th>

        <th colspan="2">Thao tác</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${ ds }" var="kh">
        <tr>
            <td>${ kh.ma }</td>
            <td>${ kh.ho }</td>
            <td>${ kh.tenDem }</td>
            <td>${ kh.ten }</td>
            <td>${kh.ngaySinh}</td>
            <td>${ kh.sdt }</td>
            <td>${ kh.diaChi }</td>
            <td>${ kh.matKhau }</td>
            <td>${ kh.thanhPho }</td>
            <td>${ kh.quocGia }</td>


            <td>
                <a href="/admin/khach-hang/edit/${kh.ma}" class="btn btn-primary">Cap nhat</a>
            </td>
            <td>
                <a href="/admin/khach-hang/delete/${kh.ma}" class="btn btn-danger">Xoa</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>