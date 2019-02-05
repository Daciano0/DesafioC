package com.desafio.cielo.ws.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DadosDomicilioBancarioModel {

	@JsonProperty("codigoBanco")
	private int CodigoBanco;
	@JsonProperty("numeroAgencia")
	private int NumeroAgencia;
	@JsonProperty("numeroContaCorrente")
	private String NumeroContaCorrente;
	public int getCodigoBanco() {
		return CodigoBanco;
	}
	public void setCodigoBanco(int codigoBanco) {
		CodigoBanco = codigoBanco;
	}
	public int getNumeroAgencia() {
		return NumeroAgencia;
	}
	public void setNumeroAgencia(int numeroAgencia) {
		NumeroAgencia = numeroAgencia;
	}
	public String getNumeroContaCorrente() {
		return NumeroContaCorrente;
	}
	public void setNumeroContaCorrente(String numeroContaCorrente) {
		NumeroContaCorrente = numeroContaCorrente;
	}
	
	
	
}
