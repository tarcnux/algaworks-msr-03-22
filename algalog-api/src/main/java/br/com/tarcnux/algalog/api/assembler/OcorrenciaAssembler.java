package br.com.tarcnux.algalog.api.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.tarcnux.algalog.api.model.OcorrenciaModel;
import br.com.tarcnux.algalog.domain.model.Ocorrencia;

@Component
public class OcorrenciaAssembler {
	
	@Autowired
	private ModelMapper modelMapper;
	
	public OcorrenciaModel toModel(Ocorrencia ococrrencia) {
		return modelMapper.map(ococrrencia, OcorrenciaModel.class);
	}
	
	public List<OcorrenciaModel> toCollectionModel(List<Ocorrencia> ocorrencias) {
		return ocorrencias.stream()
				.map(this::toModel)
				.collect(Collectors.toList());
	}

}
