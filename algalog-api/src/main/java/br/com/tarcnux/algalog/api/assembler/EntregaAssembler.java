package br.com.tarcnux.algalog.api.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.tarcnux.algalog.api.model.EntregaModel;
import br.com.tarcnux.algalog.api.model.input.EntregaInput;
import br.com.tarcnux.algalog.domain.model.Entrega;

/**
 * Responsável por fazer o mapeamento entre entidades
 * @author tarcnux
 *
 */

@Component
public class EntregaAssembler {
	
	// http://modelmapper.org/downloads/
	@Autowired
	private ModelMapper modelMapper;
	
	public EntregaModel toModel(Entrega entrega) {
		return modelMapper.map(entrega, EntregaModel.class);
	}
	
	public List<EntregaModel> toCollectionModel(List<Entrega> entregas) {
		return entregas.stream()
				.map(this::toModel)
				.collect(Collectors.toList());
	}
	
	public Entrega toEntity(EntregaInput entregaInput) {
		return modelMapper.map(entregaInput, Entrega.class);
	}
	
}
