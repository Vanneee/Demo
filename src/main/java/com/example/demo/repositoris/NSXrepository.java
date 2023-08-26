package com.example.demo.repositoris;

import com.example.demo.controllers.entities.NSX;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface NSXrepository extends JpaRepository<NSX, UUID> {
}
