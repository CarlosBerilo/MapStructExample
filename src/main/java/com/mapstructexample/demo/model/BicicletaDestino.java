package com.mapstructexample.demo.model;

public class BicicletaDestino {
	private String marca;
	private String cor;
	private Integer aro;

	public BicicletaDestino() {
		super();
	}

	public BicicletaDestino(String marca, String cor, Integer aro) {
		super();
		this.marca = marca;
		this.cor = cor;
		this.aro = aro;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getAro() {
		return aro;
	}

	public void setAro(Integer aro) {
		this.aro = aro;
	}

}
