package com.example.demo.repositoris;

import com.example.demo.controllers.entities.ChucVu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ChucVurepository extends JpaRepository<ChucVu, UUID> {
}
