package com.conceito.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * 
 * @author enoque.felipe.d.leal
 *
 */
@ManagedBean(name = "NavigationBean")
@SessionScoped
public class NavigationBean implements Serializable {

	private static final long serialVersionUID = -2981993349882902178L;

	@PostConstruct
	public void init() {

	}

}
