package com.example.demo.repositoris;

import com.example.demo.controllers.entities.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SanPhamrepository extends JpaRepository<SanPham, UUID> {
}
