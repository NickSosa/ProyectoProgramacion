package com.cooweb.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cooweb.model.Usuario;
import com.cooweb.dao.UsuarioDao;

@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioDao usuarioDao;
	
	@RequestMapping(value="HolaMundo")
	public String mensaje() {
		return "Hola Mundo";
	}
	
	@RequestMapping(value="personas")
	public List<String> listaPersonas() {
		return List.of("Nico", "Maria", "Hector");
	}
	
	@RequestMapping(value="usuarios")
	public Usuario listarUsuarios() {
		Usuario user = new Usuario();
		user.setNombre("Nicolás");
		user.setApellido("Sosa");
		user.setEmail("ejemplo@yopmail.com");
		user.setTelefono("+54 2637485910");
		user.setPassword("ContraseñaSegura");
		return user;
	}
	
	@RequestMapping(value="usuarios/{id}")
	public Usuario getUsuario(@PathVariable Long id) {
		Usuario user = new Usuario();
		user.setId(id);
		user.setNombre("Nicolás");
		user.setApellido("Sosa");
		user.setEmail("ejemplo@yopmail.com");
		user.setTelefono("+54 2637485910");
		user.setPassword("ContraseñaSegura");
		return user;
	}
	
	@RequestMapping(value="listar/usuarios")
	public List<Usuario> listarVariosUsuarios() {
		List<Usuario> user = new ArrayList<>();
		
		Usuario user1 = new Usuario();
		user1.setId(0L);
		user1.setNombre("Nicolás");
		user1.setApellido("Sosa");
		user1.setEmail("ejemplo@yopmail.com");
		user1.setTelefono("+54 2612057866");
		user1.setPassword("ContraseñaSegura");
		
		Usuario user2 = new Usuario();
		user2.setId(1L);
		user2.setNombre("María Amelia");
		user2.setApellido("Correa");
		user2.setEmail("ejemplo2@hotmail.com");
		user2.setTelefono("+54 2653780954");
		user2.setPassword("ContraseñaLarga");
		
		Usuario user3 = new Usuario();
		user3.setId(2L);
		user3.setNombre("Héctor");
		user3.setApellido("Sosa");
		user3.setEmail("ejemplo3@yahoo.com");
		user3.setTelefono("+54 236579864");
		user3.setPassword("ContraseñaDeAcceso");
		
		user.add(user1);
		user.add(user2);
		user.add(user3);
		
		return user;
	}
	
	@RequestMapping(value="api/usuarios")
	public List<Usuario> getUsuario() {
		List<Usuario> user = usuarioDao.obtenerUsuarios();
		return user;
	}
}
