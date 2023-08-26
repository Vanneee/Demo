package com.example.demo.repositoris;

import com.example.demo.controllers.entities.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface NhanVienrepository extends JpaRepository<NhanVien, UUID>{
}
