package br.com.tarcnux.algalog.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tarcnux.algalog.domain.model.Cliente;
import br.com.tarcnux.algalog.domain.repository.ClienteRepository;

@RestController
public class ClienteController {	
	
	@Autowired
	private ClienteRepository clienteRepository;
		
	@GetMapping("/clientes")
	public List<Cliente> listar() {	
		return clienteRepository.findAll();
		//return clienteRepository.findByNome("Alice");
		//return clienteRepository.findByNomeContaining("Ali");
	}

}
