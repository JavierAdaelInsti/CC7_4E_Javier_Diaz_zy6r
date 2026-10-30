package com.example.zy6r_4E_Javier_Diaz_CC7.repository;

import com.example.zy6r_4E_Javier_Diaz_CC7.model.Videojuego;
import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PrestamoRepository extends JpaRepository<Videojuego, Long> {
    List<Videojuego> findById(Long id);
}
