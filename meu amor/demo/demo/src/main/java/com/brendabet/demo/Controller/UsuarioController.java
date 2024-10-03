package com.brendabet.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brendabet.demo.model.UsuarioModel;


@RestController
@RequestMapping("habibs")
public class UsuarioController {
@Autowired
UsuarioRepository repository;
	
	@PostMapping("/cadastrar")
public ResponseEntity<?> salvarUsuario(@RequestBody UsuarioDTO user){
	UsuarioModel usuario = new UsuarioModel(user);
	repository.save(usuario);
		return ResponseEntity.ok("Usuario cadastrado");
}
}
