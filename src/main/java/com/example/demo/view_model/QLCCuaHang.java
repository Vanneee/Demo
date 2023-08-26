package com.example.demo.view_model;

import com.example.demo.controllers.entities.CuaHang;
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
public class QLCCuaHang {

    @NotBlank(message = "Không được để trống")
    private String ma;

    @NotBlank(message = "Không được để trống")
    private String ten;

    @NotBlank
    private String diaChi;

    @NotBlank
    private String thanhPho;

    @NotBlank
    private String quocGia;

    public void loadFromEntity(CuaHang ch)
    {
        this.setMa( ch.getMa() );
        this.setTen( ch.getTen() );
        this.setThanhPho( ch.getThanhPho() );
        this.setQuocGia( ch.getQuocGia() );
        this.setDiaChi( ch.getDiaChi() );
    }
}
