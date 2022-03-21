package br.com.tarcnux.algalog.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tarcnux.algalog.domain.model.Entrega;
import br.com.tarcnux.algalog.domain.model.StatusEntrega;
import br.com.tarcnux.algalog.domain.repository.EntregaRepository;

@Service
public class FinalizacaoEntregaService {
	
	@Autowired
	private EntregaRepository entregaRepository;
	
	@Autowired
	private BuscaEntregaService buscaEntregaService;
	
	public void finalizar(Long entregaId) {
		Entrega entrega = buscaEntregaService.buscar(entregaId);
		
		
		entrega.finalizar();
		
		entregaRepository.save(entrega);
	}

}
