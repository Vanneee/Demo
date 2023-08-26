package com.example.demo.repositoris;

import com.example.demo.controllers.entities.DongSP;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DongSPrepository extends JpaRepository<DongSP, UUID> {
}
