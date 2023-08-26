package com.example.demo.controllers.entities;


import com.example.demo.view_model.QLChucVu;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "ChucVu")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChucVu {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy =GenerationType.UUID)
   private UUID id;

    @Column(name = "Ma")
   private String ma;

    @Column(name = "Ten")
    private String ten;

public void loadFromVM(QLChucVu vm){
    this.setMa(vm.getMa());
    this.setTen(vm.getTen());
}
}
