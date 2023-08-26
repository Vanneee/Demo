package com.example.demo.view_model;
import com.example.demo.controllers.entities.ChucVu;
import com.example.demo.controllers.entities.DongSP;
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
public class QLDongSP {
    @NotBlank(message = "Không được để trống")
    private String ma;
    @NotBlank(message = "Không được để trống")
    private String ten;

    public void loadFormEntyti(DongSP dsp) {
        this.setMa(dsp.getMa());
        this.setTen(dsp.getTen());
    }
}