package br.com.tarcnux.algalog.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tarcnux.algalog.domain.model.Cliente;

@RestController
public class ClienteController {	
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		
		var tarcnux = new Cliente();
		tarcnux.setId(1L);
		tarcnux.setNome("Tarcísio Nunes");
		tarcnux.setEmail("tata@tata.com.br");
		tarcnux.setTelefone("(47) 9 9999-8888");
		
		var uri = new Cliente();
		uri.setId(2L);
		uri.setNome("Uriel Nunes");
		uri.setEmail("uri@tata.com.br");
		uri.setTelefone("(47) 9 7777-8888");
		
		return Arrays.asList(tarcnux, uri);
	}

}
