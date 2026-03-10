package com.aluracursos.forohub.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AutenticacionServices implements UserDetailsService {

    @Autowired
    private UsuarioRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println(">>> [DEBUG] Intentando buscar al usuario: " + username);

        var usuario = repository.findByLogin(username);

        if (usuario == null) {
            System.out.println(">>> [ALERTA] El usuario '" + username + "' NO fue encontrado en la base de datos.");
        } else {
            System.out.println(">>> [OK] Usuario encontrado: " + usuario.getUsername());
            System.out.println(">>> [HASH EN DB] " + usuario.getPassword());
        }

        return usuario;
    }
}