package com.example.demo.controllers.entities;


import com.example.demo.view_model.QLNSX;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name="NSX")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NSX {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID Id;

    @Column(name = "Ma")
    private String Ma;

    @Column(name = "Ten")
    private String Ten;

    public void loadFromVM(QLNSX vm) {
        this.setMa(vm.getMa());
        this.setTen(vm.getTen());
    }
}
