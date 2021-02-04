package com.mapstructexample.demo.model;

public class Nome {
	  private String nome;
	  private String sobreNome;
	public Nome() {
		
	}
	public Nome(String nome, String sobreNome) {
		
		this.nome = nome;
		this.sobreNome = sobreNome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	  
}
