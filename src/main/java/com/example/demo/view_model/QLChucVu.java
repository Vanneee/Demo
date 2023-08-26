package com.example.demo.view_model;

import com.example.demo.controllers.entities.ChucVu;
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
public class QLChucVu {
@NotBlank(message = "Không được để trống")
    private String  ma;
@NotBlank(message = "Không được để trống")
    private String ten;

public void loadFormEntyti(ChucVu cv){
    this.setMa(cv.getMa());
    this.setTen(cv.getTen());
}
}
