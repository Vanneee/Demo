package com.example.demo.view_model;

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

    private UUID id;
    @NotBlank(message = "Không được để trống")
    private String ma,ten,diaChi,thanhPho,quocGia;


}
