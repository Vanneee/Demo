package com.example.demo.repositoris;

import com.example.demo.controllers.entities.ChiTietSP;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ChiTietSPrepository extends JpaRepository<ChiTietSP, UUID> {
}
