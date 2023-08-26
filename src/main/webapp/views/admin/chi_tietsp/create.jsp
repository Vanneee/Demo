<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Chi Tiết Sản Phẩm</title>
    <%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
<sf:form method="post" action="${action}" modelAttribute="ctsp">
    <div>
        <label>Sản Phẩm</label>
        <sf:select path="SanPham">
            <c:forEach items="${ dssp }" var="sp">
                <sf:option value="${sp.id}">${sp.ten}</sf:option>
            </c:forEach>
        </sf:select>
        <sf:errors path="SanPham"/>
    </div>
    <div>
        <label>NSX</label>
        <sf:select path="NSX">
            <c:forEach items="${ dsnsx }" var="nsx">
                <sf:option value="${nsx.id}">${nsx.ten}</sf:option>
            </c:forEach>
        </sf:select>
        <sf:errors path="NSX"/>
    </div>
    <div>
        <label>Màu Sắc</label>
        <sf:select path="MS">
            <c:forEach items="${ dsms }" var="ms">
                <sf:option value="${ms.id}">${ms.ten}</sf:option>
            </c:forEach>
        </sf:select>
        <sf:errors path="MS"/>
    </div>
    <div>
        <label>Dòng SP</label>
        <sf:select path="DongSP">
            <c:forEach items="${ dsdsp }" var="dsp">
                <sf:option value="${dsp.id}">${dsp.ten}</sf:option>
            </c:forEach>
        </sf:select>
        <sf:errors path="DongSP"/>
    </div>

    <div>
        <label>Năm BH</label>
        <sf:input path="namBH"/>
        <sf:errors path="namBH"/>
    </div><div>
        <label>Số Lượng Tồn</label>
        <sf:input path="slt"/>
        <sf:errors path="slt"/>
    </div><div>
        <label>Mô tả</label>
        <sf:input path="mota"/>
        <sf:errors path="mota"/>
    </div><div>
        <label>Giá Nhập</label>
        <sf:input path="gianhap"/>
        <sf:errors path="gianhap"/>
    </div><div>
        <label>Giá bán</label>
        <sf:input path="giaban"/>
        <sf:errors path="giaban"/>
    </div>

    <div>
        <button>Thêm mới</button>
    </div>

</sf:form>

</body>
</html>