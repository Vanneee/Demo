package com.example.demo.controllers.entities;

import com.example.demo.view_model.QLChitietsp;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name="ChiTietSP")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChiTietSP {
    @Id
    @Column(name="Id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID Id;

    @ManyToOne
    @JoinColumn(name="IdSP")
    private SanPham sp;

    @ManyToOne
    @JoinColumn(name="IdNsx")
    private NSX nsx;

    @ManyToOne
    @JoinColumn(name="IdMausac")
    private MauSac ms;

    @ManyToOne
    @JoinColumn(name="IdDongSP")
    private DongSP dongSP;

    @Column(name="NamBH")
    private String namBH;

    @Column(name="MoTa")
    private String moTa;

    @Column(name="SoLuongTon")
    private String slt;

    @Column(name="GiaNhap")
    private String gianhap;

    @Column(name="GiaBan")
    private String giaban;

    public void loadFormVM(QLChitietsp vm){
        this.setNamBH(vm.getNamBH());
        this.setSlt(vm.getSlt());
        this.setMoTa(vm.getMota());
        this.setGiaban(vm.getGiaban());
        this.setGianhap(vm.getGianhap());
    }

}
