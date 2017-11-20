package com.conceito.bean;

import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

import com.conceito.model.Carro;
import com.conceito.model.TipoCarro;

@ManagedBean
@SessionScoped
public class XLSBean implements Serializable {

	private static final long serialVersionUID = -2981993349882902178L;

	private StreamedContent file;
	private List<Carro> cars;
	
	@PostConstruct
	public void init(){

		putData();
		
	}

	private void putData() {
		cars = new ArrayList<>();
		
		Carro carroNovo = new Carro(1, "Novo", "2015", "2015", TipoCarro.HATCHE );

		carroNovo.getCarros().add(new Carro(2, "Vectra", "2010", "2010", TipoCarro.HATCHE));
		carroNovo.getCarros().add(new Carro(3, "Punto", "2013", "2013", TipoCarro.HATCHE));
		carroNovo.getCarros().add(new Carro(4, "Golf", "2015", "2015", TipoCarro.HATCHE));
		carroNovo.getCarros().add(new Carro(5, "Fox", "2014", "2014", TipoCarro.HATCHE));
		
		cars.add(carroNovo);
		
		Carro carroVelho = new Carro(6, "Velho", "2015", "2015", TipoCarro.HATCHE);
		
		carroVelho.getCarros().add(new Carro(7, "Fusca", "1970", "1970", TipoCarro.HATCHE));
		carroVelho.getCarros().add(new Carro(8, "Corsa", "1995", "1996", TipoCarro.HATCHE));
		carroVelho.getCarros().add(new Carro(9, "Palio", "2000", "2000", TipoCarro.HATCHE));
		carroVelho.getCarros().add(new Carro(10, "Celta", "2012", "2012", TipoCarro.HATCHE));
		
		cars.add(carroVelho);
		
	}

	public void imprimir() {
		System.out.println("Imprimiu...");
	}

	public StreamedContent getFile() {
		InputStream stream = FacesContext.getCurrentInstance().getExternalContext().getResourceAsStream("/resources/img/enoque.jpg");
		file = new DefaultStreamedContent(stream, "image/jpg", "downloaded_optimus.jpg");
		return file;
	}

	public List<Carro> getCars() {
		return cars;
	}

	public void setCars(List<Carro> cars) {
		this.cars = cars;
	}

}
