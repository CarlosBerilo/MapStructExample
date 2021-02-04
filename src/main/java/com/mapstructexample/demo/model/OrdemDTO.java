package com.mapstructexample.demo.model;

import java.util.List;

public class OrdemDTO {
	  private String clienteNome;
	  private String clienteSobreNome;
	  private String enderecoRua;
	  private String enderecoCidade;
	  private BicicletaDestino bicicletaDestino;
	  private List<Item> itens;
	  
	public OrdemDTO() {
		super();
	}
	
	public OrdemDTO(String clienteNome, String clienteSobreNome, String enderecoRua, String enderecoCidade, BicicletaDestino bicicletaDestino, List<Item> itens) {
				super();
		this.clienteNome = clienteNome;
		this.clienteSobreNome = clienteSobreNome;
		this.enderecoRua = enderecoRua;
		this.enderecoCidade = enderecoCidade;
		this.bicicletaDestino = bicicletaDestino;
		this.itens = itens;
	}

	public String getClienteNome() {
		return clienteNome;
	}
	public void setClienteNome(String clienteNome) {
		this.clienteNome = clienteNome;
	}
	public String getClienteSobreNome() {
		return clienteSobreNome;
	}
	public void setClienteSobreNome(String clienteSobreNome) {
		this.clienteSobreNome = clienteSobreNome;
	}
	public String getEnderecoRua() {
		return enderecoRua;
	}
	public void setEnderecoRua(String enderecoRua) {
		this.enderecoRua = enderecoRua;
	}
	public String getEnderecoCidade() {
		return enderecoCidade;
	}
	public void setEnderecoCidade(String enderecoCidade) {
		this.enderecoCidade = enderecoCidade;
	}

	public BicicletaDestino getBicicletaDestino() {
		return bicicletaDestino;
	}

	public void setBicicletaDestino(BicicletaDestino bicicletaDestino) {
		this.bicicletaDestino = bicicletaDestino;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}
	  
}
