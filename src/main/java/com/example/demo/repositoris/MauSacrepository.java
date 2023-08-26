package com.example.demo.repositoris;

import com.example.demo.controllers.entities.MauSac;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MauSacrepository extends JpaRepository<MauSac, UUID> {
}
