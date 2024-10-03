package com.brendabet.demo.model;

import java.util.UUID;

import com.brendabet.demo.Controller.UsuarioDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;


@Entity
@Table (name = "tb_usuario")
public class UsuarioModel {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	private String cpf,senha,aniver,email;
	
	public UsuarioModel(@Valid UsuarioDTO user) {
		this.cpf = user.cpf();
		this.senha = user.senha();
		this.aniver = user.aniver();
		this.email = user.email();
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getAniver() {
		return aniver;
	}

	public void setAniver(String aniver) {
		this.aniver = aniver;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
