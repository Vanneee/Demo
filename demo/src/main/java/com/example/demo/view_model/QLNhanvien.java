package com.example.demo.view_model;

import jakarta.validation.constraints.NotBlank;

import java.util.UUID;

public class QLNhanvien {
    private UUID id;
    @NotBlank(message = "Không được để trống")
    private String ma;
    @NotBlank(message = "Không được để trống")

    private String ho;
    @NotBlank(message = "Không được để trống")

    private String tenDem;
    @NotBlank(message = "Không được để trống")

    private String ten;
    @NotBlank(message = "Không được để trống")

    private String gioiTinh;
    @NotBlank(message = "Không được để trống")

    private String ngaySinh;
    @NotBlank(message = "Không được để trống")

    private String sdt;
    @NotBlank(message = "Không được để trống")

    private String diaChi;
    @NotBlank(message = "Không được để trống")

    private String cuaHang;
    @NotBlank(message = "Không được để trống")

    private String chucVu;
    @NotBlank(message = "Không được để trống")

    private String trangThai;
    @NotBlank(message = "Không được để trống")

    private String matkhau;

    public QLNhanvien() {
    }

    public QLNhanvien(UUID id, @NotBlank(message = "Không được để trống") String ma, @NotBlank(message = "Không được để trống") String ho, @NotBlank(message = "Không được để trống") String tenDem, @NotBlank(message = "Không được để trống") String ten, @NotBlank(message = "Không được để trống") String gioiTinh, @NotBlank(message = "Không được để trống") String ngaySinh, @NotBlank(message = "Không được để trống") String sdt, @NotBlank(message = "Không được để trống") String diaChi, @NotBlank(message = "Không được để trống") String cuaHang, @NotBlank(message = "Không được để trống") String chucVu, @NotBlank(message = "Không được để trống") String trangThai, @NotBlank(message = "Không được để trống") String matkhau) {
        this.id = id;
        this.ma = ma;
        this.ho = ho;
        this.tenDem = tenDem;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.cuaHang = cuaHang;
        this.chucVu = chucVu;
        this.trangThai = trangThai;
        this.matkhau = matkhau;
    }

    public String getTenDem() {
        return tenDem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getCuaHang() {
        return cuaHang;
    }

    public void setCuaHang(String cuaHang) {
        this.cuaHang = cuaHang;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public void setTenDem(String tenDem) {
        this.tenDem = tenDem;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }



    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }
}
