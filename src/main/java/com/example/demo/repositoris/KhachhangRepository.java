package com.example.demo.repositoris;

import com.example.demo.controllers.entities.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface KhachhangRepository extends JpaRepository<KhachHang, UUID> {
}
