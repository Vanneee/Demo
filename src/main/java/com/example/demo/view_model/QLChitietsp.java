package com.example.demo.view_model;

import com.example.demo.controllers.entities.ChiTietSP;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class QLChitietsp {
    @NotNull(message = "Không được để trống")
    private UUID SanPham;

    @NotNull(message = "Không được để trống")
    private UUID NSX;

    @NotNull(message = "Không được để trống")
    private UUID MS;

    @NotNull(message = "Không được để trống")
    private UUID DongSP;

    @NotBlank(message = "Không được để trống")
    private String namBH;

    @NotBlank(message = "Không được để trống")
    private String mota;

    @NotBlank(message = "Không được để trống")
    private String slt;

    @NotBlank(message = "Không được để trống")
    private String gianhap;

    @NotBlank(message = "Không được để trống")
    private String giaban;

    public void loadEntity(ChiTietSP ctsp){
        this.setSanPham(ctsp.getSp().getId());
        this.setNSX(ctsp.getNsx().getId());
        this.setDongSP(ctsp.getDongSP().getId());
        this.setMS(ctsp.getMs().getId());
        this.setGianhap(ctsp.getGianhap());
        this.setGiaban(ctsp.getGiaban());
        this.setNamBH(ctsp.getNamBH());
        this.setSlt(ctsp.getSlt());
        this.setMota(ctsp.getMoTa());

    }

}
