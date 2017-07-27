package com.conceito.util;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class MainUtilsTest extends TestCase {

	public List<String> agencias;
	
	@Before
	public void criadorDeAgencias(){
		this.agencias = new ArrayList<String>(); 
		this.agencias.add("10");
		this.agencias.add("11260");
		this.agencias.add("170");
	}
	
	@Test 
	public void testeDeRemocaoDeZeroADireita(){
		String valor = "11260";
		assertEquals("1126", MainUtils.removeUltimoZero(valor));
	}

	@Test
	public void testGeradorDeCombinacoes() {
	}

}
