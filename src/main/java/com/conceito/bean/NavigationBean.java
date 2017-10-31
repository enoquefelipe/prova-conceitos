package com.conceito.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.conceito.model.City;

/**
 * 
 * @author enoque.felipe.d.leal
 *
 */
@ManagedBean(name = "NavigationBean")
@SessionScoped
public class NavigationBean implements Serializable {

	private static final long serialVersionUID = -2981993349882902178L;

	private City city;
	private List<City> cities;

	@PostConstruct
	public void init() {
		cities = new ArrayList<>();
		City c1 = new City();
		c1.setId(01L);
		c1.setNome("São Paulo");
		c1.setCigla("SP");

		City c2 = new City();
		c2.setId(02L);
		c2.setNome("Rio de Janeiro");
		c2.setCigla("RJ");
		
		City c3 = new City();
		c3.setId(03L);
		c3.setNome("Pernambuco");
		c3.setCigla("PE");

		cities.add(c1);
		cities.add(c2);
		cities.add(c3);
	}

	public void pegaDados() {
		System.out.println("Cidade: " + city);
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

}
