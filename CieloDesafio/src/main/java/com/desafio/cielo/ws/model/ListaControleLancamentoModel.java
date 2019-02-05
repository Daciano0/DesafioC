package com.desafio.cielo.ws.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListaControleLancamentoModel {

	@JsonProperty("lancamentoContaCorrenteCliente")
	private LancamentoContaCorrenteClienteModel clienteModel = new LancamentoContaCorrenteClienteModel();
	@JsonProperty("dataEfetivaLancamento")
	private String DataEfetivaLancamento;
	@JsonProperty("dataLancamentoContaCorrenteCliente")
	private String DataLancamentoContaCorrenteCliente;
	@JsonProperty("numeroEvento")
	private String NumeroEvento;
	@JsonProperty("descricaoGrupoPagamento")
	private String DescricaoGrupoPagamento;
	
	@JsonProperty("codigoIdentificadorUnico")
	private int CodigoIdentificadorUnico;
	
	@JsonProperty("nomeBanco")
	private String NomeBanco;
	@JsonProperty("quantidadeLancamentoRemessa")
	private int QuantidadeLancamentoRemessa;
	@JsonProperty("numeroRaizCNPJ")
	private String NumeroRaizCNPJ;
	@JsonProperty("numeroSufixoCNPJ")
	private String NumeroSufixoCNPJ;
	@JsonProperty("valorLancamentoRemessa")
	private double ValorLancamentoRemessa;
	@JsonProperty("dateLancamentoContaCorrenteCliente")
	private String DateLancamentoContaCorrenteCliente;
	@JsonProperty("dateEfetivaLancamento")
	private String DateEfetivaLancamento;
	
	public LancamentoContaCorrenteClienteModel getClienteModel() {
		return clienteModel;
	}
	public void setClienteModel(LancamentoContaCorrenteClienteModel clienteModel) {
		this.clienteModel = clienteModel;
	}
	public String getDataEfetivaLancamento() {
		return DataEfetivaLancamento;
	}
	public void setDataEfetivaLancamento(String dataEfetivaLancamento) {
		DataEfetivaLancamento = dataEfetivaLancamento;
	}
	public String getDataLancamentoContaCorrenteCliente() {
		return DataLancamentoContaCorrenteCliente;
	}
	public void setDataLancamentoContaCorrenteCliente(String dataLancamentoContaCorrenteCliente) {
		DataLancamentoContaCorrenteCliente = dataLancamentoContaCorrenteCliente;
	}
	public String getNumeroEvento() {
		return NumeroEvento;
	}
	public void setNumeroEvento(String numeroEvento) {
		NumeroEvento = numeroEvento;
	}
	public String getDescricaoGrupoPagamento() {
		return DescricaoGrupoPagamento;
	}
	public void setDescricaoGrupoPagamento(String descricaoGrupoPagamento) {
		DescricaoGrupoPagamento = descricaoGrupoPagamento;
	}
	public int getCodigoIdentificadorUnico() {
		return CodigoIdentificadorUnico;
	}
	public void setCodigoIdentificadorUnico(int codigoIdentificadorUnico) {
		CodigoIdentificadorUnico = codigoIdentificadorUnico;
	}
	public String getNomeBanco() {
		return NomeBanco;
	}
	public void setNomeBanco(String nomeBanco) {
		NomeBanco = nomeBanco;
	}
	public int getQuantidadeLancamentoRemessa() {
		return QuantidadeLancamentoRemessa;
	}
	public void setQuantidadeLancamentoRemessa(int quantidadeLancamentoRemessa) {
		QuantidadeLancamentoRemessa = quantidadeLancamentoRemessa;
	}
	public String getNumeroRaizCNPJ() {
		return NumeroRaizCNPJ;
	}
	public void setNumeroRaizCNPJ(String numeroRaizCNPJ) {
		NumeroRaizCNPJ = numeroRaizCNPJ;
	}
	public String getNumeroSufixoCNPJ() {
		return NumeroSufixoCNPJ;
	}
	public void setNumeroSufixoCNPJ(String numeroSufixoCNPJ) {
		NumeroSufixoCNPJ = numeroSufixoCNPJ;
	}
	public double getValorLancamentoRemessa() {
		return ValorLancamentoRemessa;
	}
	public void setValorLancamentoRemessa(double valorLancamentoRemessa) {
		ValorLancamentoRemessa = valorLancamentoRemessa;
	}
	public String getDateLancamentoContaCorrenteCliente() {
		return DateLancamentoContaCorrenteCliente;
	}
	public void setDateLancamentoContaCorrenteCliente(String dateLancamentoContaCorrenteCliente) {
		DateLancamentoContaCorrenteCliente = dateLancamentoContaCorrenteCliente;
	}
	public String getDateEfetivaLancamento() {
		return DateEfetivaLancamento;
	}
	public void setDateEfetivaLancamento(String dateEfetivaLancamento) {
		DateEfetivaLancamento = dateEfetivaLancamento;
	}
	
	
	
}
