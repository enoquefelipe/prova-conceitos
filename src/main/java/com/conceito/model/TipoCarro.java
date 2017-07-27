package com.conceito.model;

/**
 * 
 * @author enoque.felipe.d.leal
 *
 */
public enum TipoCarro {

	SUBCOMPACTO (0, "Subcompacto"),
	HATCHE 		(1, "Hatche"),
	SEDA		(2, "Sedã"),
	PICAPE		(3, "Picape"),
	ESPORTIVO	(4, "Esportivo"),
	CONVERSIVEL	(5, "Conversível"),
	SUV			(6, "SUV");

	private int id;
	private String descricao;


	private TipoCarro(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

}
