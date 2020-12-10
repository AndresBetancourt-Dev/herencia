package com.clearminds.adbs.impl;

import com.clearminds.adbs.interfaces.ServicioPersona;
import com.clearminds.adbs.model.Persona;

public class ServicioPersonaBDD implements ServicioPersona{

	public boolean insertar(Persona persona) {
		System.out.println("Insertando persona en la Base de Datos.");
		System.out.println(persona.toString());
		return true;
	}

	public boolean actualizar(Persona persona) {
		System.out.println("Actualizando persona en la Base de Datos.");
		System.out.println(persona.toString());
		return true;
	}

	public boolean eliminar(Persona persona) {
		System.out.println("Eliminando persona en la Base de Datos.");
		System.out.println(persona.toString());
		return true;
	}

}
