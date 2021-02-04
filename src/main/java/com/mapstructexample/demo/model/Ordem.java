package com.mapstructexample.demo.model;

import java.util.List;

public class Ordem {
	private Cliente cliente;
	private Endereco enderecoFinanceiro;
	private BicicletaOrigem bicicletaOrigem;
	private List<Item> itens;

	public Ordem() {
		super();
	}

	public Ordem(Cliente cliente, Endereco enderecoFinanceiro, BicicletaOrigem bicicletaOrigem, List<Item> itens) {
		super();
		this.cliente = cliente;
		this.enderecoFinanceiro = enderecoFinanceiro;
		this.bicicletaOrigem = bicicletaOrigem;
		this.itens =itens;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Endereco getEnderecoFinanceiro() {
		return enderecoFinanceiro;
	}

	public void setEnderecoFinanceiro(Endereco enderecoFinanceiro) {
		this.enderecoFinanceiro = enderecoFinanceiro;
	}

	public BicicletaOrigem getBicicletaOrigem() {
		return bicicletaOrigem;
	}

	public void setBicicletaOrigem(BicicletaOrigem bicicletaOrigem) {
		this.bicicletaOrigem = bicicletaOrigem;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

}
