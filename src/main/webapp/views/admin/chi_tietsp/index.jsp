<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>

<html>
<head>
    <title>Chi tiết sản phẩm</title>
    <link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
    <script src="/bootstrap/js/bootstrap.min.js"></script>
</head>

<body>
<div class="col-8 offset-2 mt-5 table-responsive">
    <div class="row">
        <div class="col-6">
            <a href="/admin/ctsp/create" class="btn btn-success">Thêm mới</a>
        </div>
    </div>
    <c:if test="${ f:length(dsctsp) == 0 }">
        <h3>Không có dữ liệu</h3>
    </c:if>
    <c:if test="${ f:length(dsctsp) != 0 }">
        <table class="table table-striped mt-3">
            <thead class="table-primary">
            <tr>
                <th>Sản phẩm</th>
                <th>NSX</th>
                <th>Màu sắc</th>
                <th>Dòng sản phẩm</th>
                <th>Năm bảo hành</th>
                <th>Mô tả</th>
                <th>Số lượng tồn</th>
                <th>Giá nhập</th>
                <th>Giá bán</th>
                <th colspan="2">Thao tác</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${ dsctsp }" var="ctsp">
                <tr>
                    <td>${ ctsp.sp.ten }</td>
                    <td>${ ctsp.nsx.ten }</td>
                    <td>${ ctsp.ms.ten }</td>
                    <td>${ctsp.dongSP.ten }</td>
                    <td>${ ctsp.namBH }</td>
                    <td>${ ctsp.moTa}</td>
                    <td>${ ctsp.slt }</td>
                    <td>${ ctsp.gianhap }</td>
                    <td>${ ctsp.giaban }</td>
                    <td>
                        <a href="/admin/ctsp/edit/${ctsp.id}" class="btn btn-primary">Cập nhật</a>
                    </td>
                    <td>
                        <a href="/admin/ctsp/delete/${ctsp.id}" class="btn btn-danger">Xóa</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </c:if>
</div>


</body>
</html>