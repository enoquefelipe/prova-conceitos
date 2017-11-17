package com.conceito.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	
}
