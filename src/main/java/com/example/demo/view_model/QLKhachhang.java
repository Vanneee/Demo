package com.example.demo.view_model;

import com.example.demo.controllers.entities.KhachHang;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.UUID;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class QLKhachhang {

    @NotBlank(message = "Không được để trống")
    private String ma;
    @NotBlank(message = "Không được để trống")
    private String ho;
    @NotBlank(message = "Không được để trống")
    private String tenDem;
    @NotBlank(message = "Không được để trống")
    private String ten;
    @NotBlank(message = "Không được để trống")
    private String ngaySinh;
    @NotBlank(message = "Không được để trống")
    private String sdt;
    @NotBlank(message = "Không được để trống")
    private String diaChi;
    @NotBlank(message = "Không được để trống")
    private String matKhau;
    @NotBlank(message = "Không được để trống")
    private String quocGia;
    @NotBlank(message = "Không được để trống")
    private String thanhPho;

    public void loadFormEntyti(KhachHang kh){
        this.setMa(kh.getMa());
        this.setHo(kh.getHo());
        this.setTenDem(kh.getTenDem());
        this.setTen(kh.getTen());
        this.setDiaChi(kh.getDiaChi());
        this.setNgaySinh(kh.getNgaySinh());
        this.setSdt(kh.getSdt());
        this.setThanhPho(kh.getThanhPho());
        this.setQuocGia(kh.getQuocGia());
        this.setMatKhau(kh.getMatKhau());


    }
}
