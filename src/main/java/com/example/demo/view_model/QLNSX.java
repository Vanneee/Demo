package com.example.demo.view_model;

import com.example.demo.controllers.entities.ChucVu;
import com.example.demo.controllers.entities.NSX;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class QLNSX {
    @NotBlank(message = "Không được để trống")
    private String  ma;
    @NotBlank(message = "Không được để trống")
    private String ten;

    public void loadFormEntyti(NSX nsx){
        this.setMa(nsx.getMa());
        this.setTen(nsx.getTen());
    }
}
