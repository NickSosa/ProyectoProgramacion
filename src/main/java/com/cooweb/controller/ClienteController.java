package com.cooweb.controller;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cooweb.model.Cliente;
import com.cooweb.dao.ClienteDao;

@RestController
public class ClienteController {

	@Autowired
	private ClienteDao clienteDao;
	
	@RequestMapping(value="clientes")
	public Cliente listarClientes() {
		Cliente client = new Cliente();
		client.setNombre("Nicolás");
		client.setApellido("Sosa");
		client.setEmail("ejemplo@yopmail.com");
		client.setTelefono("+54 2637485910");
		client.setDireccion("Barrio Los Guindos, C Bermejo 1947, Capilla del Rosario, Guaymallén");
		client.setCumpleaños(LocalDate.of(2002, 03, 11));
		return client;
	}
	
	@RequestMapping(value="clientes/{id}")
	public Cliente getCliente(@PathVariable Long id) {
		Cliente client = new Cliente();
		client.setId(id);
		client.setNombre("Nicolás");
		client.setApellido("Sosa");
		client.setEmail("ejemplo@yopmail.com");
		client.setTelefono("+54 2637485910");
		client.setDireccion("Barrio Los Guindos, C Bermejo 1947, Capilla del Rosario, Guaymallén");
		client.setCumpleaños(LocalDate.of(2002, 03, 11));
		return client;
	}
	
	@RequestMapping(value="listar/clientes")
	public List<Cliente> listarVariosClientes() {
		List<Cliente> client = new ArrayList<>();
		
		Cliente client1 = new Cliente();
		client1.setId(0L);
		client1.setNombre("Nicolás");
		client1.setApellido("Sosa");
		client1.setEmail("ejemplo@yopmail.com");
		client1.setTelefono("+54 2612057866");
		client1.setDireccion("Barrio Los Guindos, C Bermejo 1947, Capilla del Rosario, Guaymallén");
		client1.setCumpleaños(LocalDate.of(2002, 03, 11));
		
		Cliente client2 = new Cliente();
		client2.setId(1L);
		client2.setNombre("María Amelia");
		client2.setApellido("Correa");
		client2.setEmail("ejemplo2@hotmail.com");
		client2.setTelefono("+54 2653780954");
		client2.setDireccion("Barrio A, Calle B 1234, Localidad C, Godoy Cruz");
		client2.setCumpleaños(LocalDate.of(1956, 06, 23));
		
		Cliente client3 = new Cliente();
		client3.setId(2L);
		client3.setNombre("Héctor");
		client3.setApellido("Sosa");
		client3.setEmail("ejemplo3@yahoo.com");
		client3.setTelefono("+54 236579864");
		client3.setDireccion("Barrio 1, Calle 2 6735, Localidad 3, Ciudad");
		client3.setCumpleaños(LocalDate.of(1951, 10, 05));
		
		client.add(client1);
		client.add(client2);
		client.add(client3);
		
		return client;
	}
	
	@RequestMapping(value="api/clientes")
	public List<Cliente> getCliente() {
		List<Cliente> client = clienteDao.obtenerClientes();
		return client;
	}
}
