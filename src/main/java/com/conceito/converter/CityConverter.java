package com.conceito.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.conceito.model.City;

//
@FacesConverter("cityConverter")
// @FacesConverter(forClass = City.class)
public class CityConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {
		if (value != null && !value.isEmpty()) {
			return uiComponent.getAttributes().get(value);
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object value) {
		if (value instanceof City) {
			City city = (City) value;
			if (city != null && city instanceof City && city.getNome() != null) {
				uiComponent.getAttributes().put(city.getNome().toString(), city);
				return city.getNome().toString();
			}
		}
		return "";
	}

}
