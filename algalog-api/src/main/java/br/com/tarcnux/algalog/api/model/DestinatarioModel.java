package br.com.tarcnux.algalog.api.model;

import br.com.tarcnux.algalog.domain.model.Destinatario;

public class DestinatarioModel {
	private String nome;
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	
	
	public DestinatarioModel() {}

	public DestinatarioModel(Destinatario destinatario) {		
		this.nome = destinatario.getNome();
		this.logradouro = destinatario.getLogradouro();
		this.numero = destinatario.getNumero();
		this.complemento = destinatario.getComplemento();
		this.bairro = destinatario.getBairro();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
}
