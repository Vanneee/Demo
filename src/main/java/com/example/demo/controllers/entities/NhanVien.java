package com.example.demo.controllers.entities;

import com.example.demo.view_model.QLNhanvien;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Entity(name = "NhanVien")
@Table(name = "NhanVien")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NhanVien {

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

    @Column(name="GioiTinh")
    private String gioiTinh;

    @Column(name="DiaChi")
    private String diaChi;

    @Column(name="Sdt")
    private String sdt;

    @Column(name="MatKhau")
    private String matkhau;

    @ManyToOne()
    @JoinColumn(name="IdCH")
    private CuaHang cuaHang;

    @ManyToOne()
    @JoinColumn(name="IdCV")
    private ChucVu chucVu;

    @Column(name="TrangThai")
    private String trangThai;

    public void loadFromVM(QLNhanvien vm){
        this.setMa(vm.getMa());
        this.setHo(vm.getHo());
        this.setTenDem(vm.getTenDem());
        this.setTen(vm.getTen());
        this.setGioiTinh(vm.getGioiTinh());
        this.setNgaySinh(vm.getNgaySinh());
        this.setDiaChi(vm.getDiaChi());
        this.setSdt(vm.getSdt());
       this.setMatkhau(vm.getMatkhau());

//        this.setCuaHang(vm.getCuaHang());
        this.setTrangThai(vm.getTrangThai());


    }
}
