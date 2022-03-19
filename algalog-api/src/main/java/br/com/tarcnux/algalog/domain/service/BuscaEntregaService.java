package br.com.tarcnux.algalog.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tarcnux.algalog.domain.exception.EntidadeNaoEncontradaException;
import br.com.tarcnux.algalog.domain.exception.NegocioException;
import br.com.tarcnux.algalog.domain.model.Entrega;
import br.com.tarcnux.algalog.domain.repository.EntregaRepository;

@Service
public class BuscaEntregaService {
	
	@Autowired
	private EntregaRepository entregaRepository;

	public Entrega buscar(Long entregaId) {
		return entregaRepository.findById(entregaId)
				.orElseThrow(() -> new EntidadeNaoEncontradaException("Entrega não encontrada"));
	}
}
