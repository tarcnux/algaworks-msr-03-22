package br.com.tarcnux.algalog.api.exceptionhandler;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Problema {
	
	private Integer status;
	private LocalDateTime dataHora;
	private String titulo;
	private List<Campo> campos;
	
	/**
	 * @return the campos
	 */
	public List<Campo> getCampos() {
		return campos;
	}
	/**
	 * @param campos the campos to set
	 */
	public void setCampos(List<Campo> campos) {
		this.campos = campos;
	}
		
	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * @return the dataHora
	 */
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	/**
	 * @param dataHora the dataHora to set
	 */
	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public static class Campo {
		private String nome;
		private String mensagem;
		
		public Campo(String nome, String mensagem) {			
			this.nome = nome;
			this.mensagem = mensagem;
		}
		
		/**
		 * @return the nome
		 */
		public String getNome() {
			return nome;
		}
		/**
		 * @return the mensagem
		 */
		public String getMensagem() {
			return mensagem;
		}
		
	}

}
