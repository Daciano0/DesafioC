package com.desafio.cielo.ws.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class TotalControleLancamentoModel {

	@JsonProperty("quantidadeLancamentos")
	private int QuantidadeLancamentos;
	@JsonProperty("quantidadeRemessas")
	private int QuantidadeRemessas;
	@JsonProperty("valorLancamentos")
	private double ValorLancamentos;
	
	public int getQuantidadeLancamentos() {
		return QuantidadeLancamentos;
	}
	public void setQuantidadeLancamentos(int quantidadeLancamentos) {
		QuantidadeLancamentos = quantidadeLancamentos;
	}
	public int getQuantidadeRemessas() {
		return QuantidadeRemessas;
	}
	public void setQuantidadeRemessas(int quantidadeRemessas) {
		QuantidadeRemessas = quantidadeRemessas;
	}
	public double getValorLancamentos() {
		return ValorLancamentos;
	}
	public void setValorLancamentos(double valorLancamentos) {
		ValorLancamentos = valorLancamentos;
	}
	
	
	
}
