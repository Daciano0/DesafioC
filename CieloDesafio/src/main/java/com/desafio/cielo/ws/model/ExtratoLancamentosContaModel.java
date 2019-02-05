package com.desafio.cielo.ws.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExtratoLancamentosContaModel {
	
	public ExtratoLancamentosContaModel() {
		// TODO Auto-generated constructor stub
	}
	
	public ExtratoLancamentosContaModel(String show) {
		this.show = show;
		
	}
	
	@JsonProperty("totalControleLancamento")
	private TotalControleLancamentoModel totalControleLancamento = new TotalControleLancamentoModel();
	@JsonProperty("listaControleLancamento")
	private ArrayList<ListaControleLancamentoModel> listaControleLancamento = new ArrayList<>();
	@JsonProperty("indice")
	private int Indice;
	@JsonProperty("tamanhoPagina")
	private int TamanhoPagina;
	@JsonProperty("totalElements")
	private int totalElements;
	
	public String show;
	
	
	
	public TotalControleLancamentoModel getTotalControleLancamento() {
		return totalControleLancamento;
	}
	public void setTotalControleLancamento(TotalControleLancamentoModel totalControleLancamento) {
		this.totalControleLancamento = totalControleLancamento;
	}
	public ArrayList<ListaControleLancamentoModel> getListaControleLancamento() {
		return listaControleLancamento;
	}
	public void setListaControleLancamento(ArrayList<ListaControleLancamentoModel> listaControleLancamento) {
		this.listaControleLancamento = listaControleLancamento;
	}
	public int getIndice() {
		return Indice;
	}
	public void setIndice(int indice) {
		Indice = indice;
	}
	public int getTamanhoPagina() {
		return TamanhoPagina;
	}
	public void setTamanhoPagina(int tamanhoPagina) {
		TamanhoPagina = tamanhoPagina;
	}
	public int getTotalElements() {
		return totalElements;
	}
	public void setTotalElements(int totalElements) {
		this.totalElements = totalElements;
	}
	
	
	@Override
	public String toString() {
	
		return ""+getListaControleLancamento().get(0).getDataLancamentoContaCorrenteCliente()+" | "
				+getListaControleLancamento().get(0).getClienteModel().getNomeTipoOperacao()+" | "
				+getListaControleLancamento().get(0).getNumeroEvento()+" | "
				+getListaControleLancamento().get(0).getClienteModel().getNomeSituacaoRemessa()+" | "
				+getListaControleLancamento().get(0).getDataEfetivaLancamento()+" | "
				+getListaControleLancamento().get(0).getNomeBanco()+" Ag "+getListaControleLancamento().get(0).getClienteModel().getDadosDomicilioBancario().getNumeroAgencia()+" CC "
				+getListaControleLancamento().get(0).getClienteModel().getDadosDomicilioBancario().getNumeroContaCorrente()+" | "
				+" R$ "+getListaControleLancamento().get(0).getValorLancamentoRemessa();
				
	}

	
	
	
	
	
}
	