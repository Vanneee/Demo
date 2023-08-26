package com.example.demo.repositoris;

import com.example.demo.controllers.entities.CuaHang;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CuaHangrepository extends JpaRepository<CuaHang, UUID> {
}
