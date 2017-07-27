package com.conceito.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.conceito.dao.CarroDao;
import com.conceito.model.Carro;
import com.conceito.model.TipoCarro;

/**
 * 
 * @author enoque.felipe.d.leal
 *
 */
@ManagedBean(name = "CarroBean")
@SessionScoped
public class CarroBean implements Serializable {

	private static final long serialVersionUID = 7919775908620107586L;
	private static final String GERENCIADOR_DE_VEICULOS = "index?faces-redirect=true";
	private static final String INDEX = "index?faces-redirect=true";
	private CarroDao dao;
	private Carro carro;
	private List<Carro> listCars;
	private List<Carro> selectedCars;
	private boolean oculta;
	private int somaDosAnos;

	@PostConstruct
	public void init() {
		carro = new Carro();
		carro.setTipo(TipoCarro.HATCHE);
		findAllCarros();
	}

	public String iniciaCadastro() {
		carro = new Carro();
		getListCars();
		return INDEX;
	}

	public String cadastra() {
		try {
			dao = new CarroDao();
			dao.cadastra(carro);
			findAllCarros();
			iniciaCadastro();
			return GERENCIADOR_DE_VEICULOS;
		} catch (Exception e) {
			return GERENCIADOR_DE_VEICULOS;
		}
	}

	public String findAllCarros() {
		dao = new CarroDao();
		listCars = dao.lista();
		return GERENCIADOR_DE_VEICULOS;
	}

	public String remove() {
		dao = new CarroDao();
		dao.removeMultiplos(selectedCars);
		return GERENCIADOR_DE_VEICULOS;
	}

	public void escondeTabela() {
		oculta = true;
	}

	public void mostraTabela() {
		oculta = false;
	}

	public void imprimirCarros() {
		if (selectedCars != null) {
			for (Carro carro : selectedCars) {
				System.out.println(carro.getModelo());
			}
		}
	}

	public void imprimirTipoCarro() {
		System.out.println("\n" + carro.getTipo().getDescricao());
	}

	public void somarVeiculos() {
		somaDosAnos = 0;
		if (selectedCars != null && selectedCars.size() != 0) {
			for (Carro carro : selectedCars)
				somaDosAnos = somaDosAnos + Integer.parseInt(carro.getAnoDeFabricacao());
		}
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public void setSelectedCars(List<Carro> selectedCars) {
		this.selectedCars = selectedCars;
	}

	public boolean isOculta() {
		return oculta;
	}

	public List<Carro> getListCars() {
		return listCars;
	}

	public Carro getCarro() {
		return carro;
	}

	public List<Carro> getSelectedCars() {
		return selectedCars;
	}

	public TipoCarro[] getTipoCarro() {
		return TipoCarro.values();
	}

	public int getSomaDosAnos() {
		return somaDosAnos;
	}

}
