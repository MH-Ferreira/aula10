package com.brendabet.demo.Controller;
import java.util.UUID;

public record UsuarioDTO 
(UUID id, String cpf, String aniver, String email,String senha) {
}
