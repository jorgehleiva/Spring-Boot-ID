package com.Aida.Sprinboot.di.app.models.service;

import org.springframework.stereotype.Component;

@Component("miServicioSimple")
public class Servicio implements IServicio{
	public String operaciones(){
		return "algun proceso importante......";
	}
}
