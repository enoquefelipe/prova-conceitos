package com.conceito.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-02-17T11:42:39.222-0200")
@StaticMetamodel(Carro.class)
public class Carro_ {
	public static volatile SingularAttribute<Carro, Integer> id;
	public static volatile SingularAttribute<Carro, String> modelo;
	public static volatile SingularAttribute<Carro, String> anoDeFabricacao;
	public static volatile SingularAttribute<Carro, String> anoDeModelo;
	public static volatile SingularAttribute<Carro, TipoCarro> tipo;
}
