package com.desafio.cielo.ws.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.cielo.ws.model.ExtratoLancamentosContaModel;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/Cielo")
public class ExtratoLancamentosConta {
	
	
	ExtratoLancamentosContaModel contaModel = new ExtratoLancamentosContaModel();
	
	
	@GetMapping("teste/{id}")
	public ExtratoLancamentosContaModel cielo(@PathVariable int id) {
		
		
		ObjectMapper objectMapper = new ObjectMapper();	
		
		try {
			contaModel = objectMapper.readValue(new InputStreamReader(getClass().getResourceAsStream("lancamento-conta-legado.json") ),ExtratoLancamentosContaModel.class);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		contaModel.setId(id);
		
		
		return new ExtratoLancamentosContaModel(contaModel.toString());
	}
	

}
