package com.example.demo.controllers.entities;

import com.example.demo.view_model.QLKhachhang;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.UUID;
@Entity
@Table(name = "KhachHang")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class KhachHang {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID Id;


    @Column(name="Ma")
    private String ma;

    @Column(name="Ten")
    private String ten;

    @Column(name="TenDem")
    private String tenDem;

    @Column(name="Ho")
    private String ho;

    @Column(name="NgaySinh")
    private String ngaySinh;

    @Column(name="DiaChi")
    private String diaChi;

    @Column(name="Sdt")
    private String sdt;

    @Column(name="ThanhPho")
    private String thanhPho;

    @Column(name="QuocGia")
    private String quocGia;

    @Column(name="MatKhau")
    private String matKhau;

    public void loadFormVM(QLKhachhang vm){
        this.setMa(vm.getMa());
        this.setHo(vm.getHo());
        this.setTenDem(vm.getTenDem());
        this.setTen(vm.getTen());
        this.setDiaChi(vm.getDiaChi());
        this.setNgaySinh(vm.getNgaySinh());
        this.setSdt(vm.getSdt());
        this.setThanhPho(vm.getThanhPho());
        this.setQuocGia(vm.getQuocGia());
        this.setMatKhau(vm.getMatKhau());


    }
}
