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
	private int id;
	
	
	
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
	
	
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
	
		System.out.println("Id "+id);
		
		return ""+getListaControleLancamento().get(id).getDataLancamentoContaCorrenteCliente()+" | "
				+getListaControleLancamento().get(id).getClienteModel().getNomeTipoOperacao()+" | "
				+getListaControleLancamento().get(id).getNumeroEvento()+" | "
				+getListaControleLancamento().get(id).getClienteModel().getNomeSituacaoRemessa()+" | "
				+getListaControleLancamento().get(id).getDataEfetivaLancamento()+" | "
				+getListaControleLancamento().get(id).getNomeBanco()+" Ag "+getListaControleLancamento().get(0).getClienteModel().getDadosDomicilioBancario().getNumeroAgencia()+" CC "
				+getListaControleLancamento().get(id).getClienteModel().getDadosDomicilioBancario().getNumeroContaCorrente()+" | "
				+" R$ "+getListaControleLancamento().get(id).getValorLancamentoRemessa();
				
	}

	
	
	
	
	
}
	