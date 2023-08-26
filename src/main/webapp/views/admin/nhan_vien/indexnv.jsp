<%--
  Created by IntelliJ IDEA.
  User: 84987
  Date: 3/14/2023
  Time: 10:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
    <script src="/bootstrap/js/bootstrap.min.js"></script>

</head>
<body>
<div class="col-8 offset-2 mt-5 table-responsive">
    <div class="row">
        <div class="col-6">
            <a href="/admin/nhan-vien/create" class="btn btn-success">Thêm mới</a>
        </div>
    </div>
    <c:if test="${ f:length(ds) == 0 }">
        <h3>Không có dữ liệu</h3>
    </c:if>
    <c:if test="${ f:length(ds) != 0 }">
        <table class="table table-striped mt-3">
            <thead class="table-primary">
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
                    <td>${nv.gioiTinh}</td>
                    <td>${ nv.sdt }</td>
                    <td>${ nv.ngaySinh}</td>
                    <td>${ nv.diaChi }</td>
                    <td>${ nv.cuaHang.ten }</td>
                    <td>${ nv.chucVu.ten }</td>
                    <td>${ nv.matkhau }</td>
                    <td>
                        <a href="/admin/nhan-vien/edit/${nv.id}" class="btn btn-primary">Cập nhật</a>
                    </td>
                    <td>
                        <a href="/admin/nhan-vien/delete/${nv.id}" class="btn btn-danger">Xóa</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </c:if>
</div>
<script src="/SP23B2_JAVA4_war/js/bootstrap.min.js"></script>

</body>
</html>
