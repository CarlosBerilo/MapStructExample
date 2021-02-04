package com.mapstructexample.demo.model;

public class Cliente {
	private Nome nome;

	public Cliente() {
		super();
	}

	public Cliente(Nome nome) {
		super();
		this.nome = nome;
	}

	public Nome getNome() {
		return nome;
	}

	public void setNome(Nome nome) {
		this.nome = nome;
	}
	
}
