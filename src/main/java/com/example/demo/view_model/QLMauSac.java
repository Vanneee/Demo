package com.example.demo.view_model;

import com.example.demo.controllers.entities.ChucVu;
import com.example.demo.controllers.entities.MauSac;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class QLMauSac {
    @NotBlank(message = "Không được để trống")
    private String ma;
    @NotBlank(message = "Không được để trống")
    private String ten;

    public void loadFormEntyti(MauSac ms) {
        this.setMa(ms.getMa());
        this.setTen(ms.getTen());
    }
}
