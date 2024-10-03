package com.brendabet.demo.Controller;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brendabet.demo.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, UUID> {
 
}
