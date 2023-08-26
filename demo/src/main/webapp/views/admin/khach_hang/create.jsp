<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Khách hàng</title>
    <%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
</head>
<body>

<sf:form method="post" action="/admin/khach-hang/store" modelAttribute="kh">
    <DIV>
        <label>Mã</label>
        <sf:input path="ma"/>
        <div>
            <small>
                <sf:errors path="ma"/>
            </small>
        </div>
    </DIV>
    <DIV>
        <label>Họ</label>
        <sf:input path="ho"/>
        <sf:errors path="ho"/>
    </DIV>
    <DIV>
        <label>Tên Đệm</label>
        <sf:input path="tenDem"/>
        <sf:errors path="tenDem"/>
    </DIV>
    <DIV>
        <label>Tên</label>
        <sf:input path="ten"/>
        <sf:errors path="ten"/>
    </DIV>

    <DIV>
        <label>Ngày Sinh</label>
        <sf:input path="ngaySinh"/>
        <sf:errors path="ngaySinh"/>
    </DIV>
    <DIV>
        <label>sdt</label>
        <sf:input path="sdt"/>
        <sf:errors path="sdt"/>
    </DIV>

    <DIV>
        <label>Địa Chỉ</label>
        <sf:input path="diaChi"/>
        <sf:errors path="diaChi"/>
    </DIV>
    <DIV>
        <label>Quốc Gia</label>
        <sf:input path="quocGia"/>
        <sf:errors path="quocGia"/>
    </DIV>
    <DIV>
        <label>Thành phố</label>
        <sf:input path="thanhPho"/>
        <sf:errors path="thanhPho"/>
    </DIV>

    <DIV>
        <label>Mật khẩu</label>
        <sf:input path="matKhau"/>
        <sf:errors path="matKhau"/>
    </DIV>
    <button>Thêm</button>
</sf:form>

</body>


</html>