package br.com.tarcnux.algalog.api.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import br.com.tarcnux.algalog.domain.model.Entrega;
import br.com.tarcnux.algalog.domain.model.StatusEntrega;

public class EntregaModel {
	
	private Long id;
	private String nomeCliente;
	private DestinatarioModel destinatario;
	private BigDecimal frete;
	private StatusEntrega status;
	private OffsetDateTime dataPedido;
	private OffsetDateTime dataFinalizacao;
	
	
	public EntregaModel() {}
	
	public EntregaModel(Entrega entrega) {		
		this.id = entrega.getId();
		this.nomeCliente = entrega.getCliente().getNome();
		this.destinatario = new DestinatarioModel(entrega.getDestinatario());	
		this.frete = entrega.getTaxa();
		this.status = entrega.getStatus();
		this.dataPedido = entrega.getDataPedido();
		this.dataFinalizacao = entrega.getDataFinalizacao();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public DestinatarioModel getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(DestinatarioModel destinatario) {
		this.destinatario = destinatario;
	}
	public BigDecimal getFrete() {
		return frete;
	}
	public void setFrete(BigDecimal taxa) {
		this.frete = taxa;
	}
	public StatusEntrega getStatus() {
		return status;
	}
	public void setStatus(StatusEntrega status) {
		this.status = status;
	}
	public OffsetDateTime getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(OffsetDateTime dataPedido) {
		this.dataPedido = dataPedido;
	}
	public OffsetDateTime getDataFinalizacao() {
		return dataFinalizacao;
	}
	public void setDataFinalizacao(OffsetDateTime dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}
	
}
