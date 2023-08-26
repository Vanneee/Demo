    <%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Nhanvien</title>
    <%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>

<sf:form method="post" action="${action}" modelAttribute="nv">
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
        <label>Giới tính</label>
        <sf:input path="gioiTinh"/>
        <sf:errors path="gioiTinh"/>
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
        <label>Cửa hàng</label>

        <sf:select path="cuaHangVM">
            <c:forEach items="${ dsch }" var="ch">
                <sf:option value="${ch.id}">${ch.ten}</sf:option>
            </c:forEach>
        </sf:select>
        <sf:errors path="cuaHangVM"/>

    </DIV>
    <DIV>
        <label>Chức vụ</label>
        <sf:select path="chucVu">
         <c:forEach items="${dscv}" var="cv">
            <sf:option value="${cv.id}">${cv.ten}</sf:option>
              </c:forEach>
        </sf:select>
        <sf:errors path="chucVu"/>
    </DIV>


    <DIV>
        <label>Trạng thái</label>
        <sf:input path="trangThai"/>
        <sf:errors path="trangThai"/>
    </DIV>
    <DIV>
        <label>Mật khẩu</label>
        <sf:input path="matkhau"/>
        <sf:errors path="matkhau"/>
    </DIV>
    <button>Thêm mới</button>
</sf:form>

</body>


</html>