<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Nhanvien</title>
    <%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
</head>
<body>

<sf:form method="post" action="/admin/nhan-vien/store" modelAttribute="nv">
    <DIV>
        <label>Mã</label>
        <sf:input path="ma"/>
    </DIV>
    <DIV>
        <label>Họ</label>
        <sf:input path="ho"/>
    </DIV>
    <DIV>
        <label>Tên Đệm</label>
        <sf:input path="tenDem"/>
    </DIV>
    <DIV>
        <label>Tên</label>
        <sf:input path="ten"/>
    </DIV>


    <DIV>
        <label>Giới tính</label>
        <sf:input path="gioiTinh"/>

    </DIV>
    <DIV>
        <label>Ngày Sinh</label>
        <sf:input path="ngaySinh"/>

    </DIV>
    <DIV>
        <label>sdt</label>
        <sf:input path="sdt"/>

    </DIV>

    <DIV>
        <label>Địa Chỉ</label>
        <sf:input path="diaChi"/>

    </DIV>
    <DIV>
        <label>Cửa hàng</label>
        <sf:input path="cuaHang"/>

    </DIV>
    <DIV>
        <label>Chức vụ</label>
        <sf:input path="chucVu"/>

    </DIV>


    <DIV>
        <label>Trạng thái</label>
        <sf:input path="trangThai"/>

    </DIV>
    <DIV>
        <label>Mật khẩu</label>
        <sf:input path="matkhau"/>

    </DIV>
    <button>Sửa</button>
</sf:form>

</body>


</html>