package com.example.demo.banco.repository.modelo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton") //pongo el ambito en el que quiero que trabaje, singleton por defecto desde el 2022
public class Presidente {

	private String nombre;
	private String apellido;
	private String cedula;
	
	@Override
	public String toString() {
		return "Presidente [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + "]";
	}

	// getters y setters
	public String getNombre() {
		return nombre;

	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

}
