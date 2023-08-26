<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>

<html>
<head>
    <title>CuaHang</title>
</head>
<body>


    <table class="table">
        <thead>
        <tr>
           <th>ma</th>
           <th>ten</th>
           <th>diachi</th>
           <th>thanhpho</th>
           <th>quocgia</th>
            <th colspan="2">Thao tac</th>

        </tr>
        </thead>
        <tbody>
        <c:forEach items="${ ds }" var="ch">
            <tr>
                <td>${ch.ma}</td>
                <td>${ch.ten}</td>
                <td>${ch.diaChi}</td>
                <td>${ch.thanhPho}</td>
                <td>${ch.quocGia}</td>
                <td>
                    <a href="#" class="btn btn-primary">Cap nhat</a>
                </td>
                <td>
                    <a href="/delete/${ ch.ma }" class="btn btn-danger">Xoa</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>


</body>


</html>