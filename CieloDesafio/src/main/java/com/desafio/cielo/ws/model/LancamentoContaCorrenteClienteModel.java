package com.desafio.cielo.ws.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LancamentoContaCorrenteClienteModel {

	@JsonProperty("numeroRemessaBanco")
	private String NumeroRemessaBanco;
	@JsonProperty("dadosAnaliticoLancamentoFinanceiroCliente")
	private String[] dadosAnaliticoLancamentoFinanceiroCliente = new String[1];
	@JsonProperty("nomeSituacaoRemessa")
	private String NomeSituacaoRemessa;
	@JsonProperty("dadosDomicilioBancario")
	private DadosDomicilioBancarioModel DadosDomicilioBancario = new DadosDomicilioBancarioModel();
	
	@JsonProperty("nomeTipoOperacao")
	private String NomeTipoOperacao;
	
	
	public String getNumeroRemessaBanco() {
		return NumeroRemessaBanco;
	}
	public void setNumeroRemessaBanco(String numeroRemessaBanco) {
		NumeroRemessaBanco = numeroRemessaBanco;
	}
	public String[] getDadosAnaliticoLancamentoFinanceiroCliente() {
		return dadosAnaliticoLancamentoFinanceiroCliente;
	}
	public void setDadosAnaliticoLancamentoFinanceiroCliente(String[] dadosAnaliticoLancamentoFinanceiroCliente) {
		this.dadosAnaliticoLancamentoFinanceiroCliente = dadosAnaliticoLancamentoFinanceiroCliente;
	}
	public String getNomeSituacaoRemessa() {
		return NomeSituacaoRemessa;
	}
	public void setNomeSituacaoRemessa(String nomeSituacaoRemessa) {
		NomeSituacaoRemessa = nomeSituacaoRemessa;
	}
	public DadosDomicilioBancarioModel getDadosDomicilioBancario() {
		return DadosDomicilioBancario;
	}
	public void setDadosDomicilioBancario(DadosDomicilioBancarioModel dadosDomicilioBancario) {
		DadosDomicilioBancario = dadosDomicilioBancario;
	}
	public String getNomeTipoOperacao() {
		return NomeTipoOperacao;
	}
	public void setNomeTipoOperacao(String nomeTipoOperacao) {
		NomeTipoOperacao = nomeTipoOperacao;
	}
	
	
	
}
