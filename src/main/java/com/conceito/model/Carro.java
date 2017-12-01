package com.conceito.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 * 
 * @author enoque.felipe.d.leal
 *
 */
@Entity (name = "cars")
public class Carro implements Serializable {

	private static final long serialVersionUID = -520285060614859291L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "model")
	private String modelo;

	@Column(name = "year_manufacture")
	private String anoDeFabricacao;

	@Column(name = "year_model")
	private String anoDeModelo;

	@Column(name = "type")
	private TipoCarro tipo;
	
	@Transient
	private List<Carro> carros;
	
	public Carro(){
		carros = new ArrayList<>();
	}

	public Carro(int id, String modelo, String anoDeFabricacao, String anoDeModelo, TipoCarro tipo) {
		super();
		carros = new ArrayList<>();
		this.id = id;
		this.modelo = modelo;
		this.anoDeFabricacao = anoDeFabricacao;
		this.anoDeModelo = anoDeModelo;
		this.tipo = tipo;
	}

	// Getters and Setters

	@Override
	public String toString() {
		return modelo;
	}

	public int getId() {
		return id;
	}

	public String getModelo() {
		return modelo;
	}

	public String getAnoDeFabricacao() {
		return anoDeFabricacao;
	}

	public String getAnoDeModelo() {
		return anoDeModelo;
	}

	public TipoCarro getTipo() {
		return tipo;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setAnoDeFabricacao(String anoDeFabricacao) {
		this.anoDeFabricacao = anoDeFabricacao;
	}

	public void setAnoDeModelo(String anoDeModelo) {
		this.anoDeModelo = anoDeModelo;
	}

	public void setTipo(TipoCarro tipo) {
		this.tipo = tipo;
	}

	public List<Carro> getCarros() {
		return carros;
	}

	public void setCarros(List<Carro> carros) {
		this.carros = carros;
	}

}
