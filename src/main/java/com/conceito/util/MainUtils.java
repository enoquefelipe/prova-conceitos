package com.conceito.util;

import java.util.ArrayList;
import java.util.List;

public class MainUtils {

	public static List<String> agencias = new ArrayList<String>();

	public static void main(String[] args) {

		for (String agencia : geradorDeCombinacoes()) {
			System.out.println(removeUltimoZero(agencia));
		}

	}

	public static void agencias() {

	}

	public static List<String> prenchedorDeAgencias() {
		agencias.add("10");
		agencias.add("11260");
		agencias.add("170");
		return agencias;
	}

	public static String removeUltimoZero(String valor) {
		if (null != valor && valor.length() > 0) {
			return valor.substring(0, valor.length() - 1);
		}
		return valor;
	}

	public static List<String> geradorDeCombinacoes() {

		int idCombinacaoLotofacil = 0;

		for (int p1 = 1; p1 <= 11; p1++) {
			for (int p2 = p1 + 1; p2 <= 12; p2++) {
				for (int p3 = p2 + 1; p3 <= 13; p3++) {
					for (int p4 = p3 + 1; p4 <= 14; p4++) {
						idCombinacaoLotofacil++;
						System.out.println(idCombinacaoLotofacil + "0");
						agencias.add(idCombinacaoLotofacil + "0");
					}
				}
			}
		}
		return agencias;
	}

}
