<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Khách hàng</title>
    <%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
</head>
<body>

<sf:form method="post" action="/admin/khach-hang/${kh.ma}" modelAttribute="kh">
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
        <label>Quốc Gia</label>
        <sf:input path="quocGia"/>

    </DIV>
    <DIV>
        <label>Thành phố</label>
        <sf:input path="thanhPho"/>

    </DIV>

    <DIV>
        <label>Mật khẩu</label>
        <sf:input path="matKhau"/>

    </DIV>
    <button>Sửa</button>
</sf:form>

</body>


</html>