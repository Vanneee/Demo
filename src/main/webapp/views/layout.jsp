
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
    <script src="/bootstrap/js/bootstrap.min.js"></script>

</head>
<body>
<nav class="navbar navbar-expand-lg bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">IT17321</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#">Trang chủ</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Khách hàng</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Sản phẩm</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<div class="row mt-2" style="min-height: 500px;">
    <div class="col-2 ">
        <ul class="list-group">
            <li class="list-group-item">
                <a href="/admin/khach-hang/index">Khách hàng</a>
            </li>
            <li class="list-group-item">
                <a href="/admin/nhan-vien/index">Nhân viên</a>
            </li>
            <li class="list-group-item">
                <a href="/admin/san-pham/index">Sản phẩm</a>
            </li>
            <li class="list-group-item">
                <a href="/admin/dongsp/index">Dòng Sản phẩm</a>
            </li>
            <li class="list-group-item">
                <a href="/admin/cua-hang/index">Của hàng</a>
            </li>
            <li class="list-group-item">
                <a href="/admin/chuc-vu/index">Chức vụ</a>
            </li>
            <li class="list-group-item">
                <a href="/admin/mau-sac/index">Màu sắc</a>
            </li>
            <li class="list-group-item">
                <a href="/admin/nsx/index">NSX</a>
            </li>
            <li class="list-group-item">
                <a href="/admin/ctsp/index">Chi tiết sản phẩm</a>
            </li>

        </ul>
    </div>
    <div class="col-10">
        <jsp:include page="${ view }" />
    </div>
</div>

<div class="row bg-info text-white" style="min-height: 200px;margin: auto; padding-top: 30px; padding-left: 45%" >TANPDPH27822@FPT.EDU.VN</div>


</body>
</html>
