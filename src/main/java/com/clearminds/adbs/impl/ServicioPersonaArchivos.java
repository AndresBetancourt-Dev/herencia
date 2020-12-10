package com.clearminds.adbs.impl;

import com.clearminds.adbs.interfaces.ServicioPersona;
import com.clearminds.adbs.model.Persona;

public class ServicioPersonaArchivos implements ServicioPersona{


	public boolean insertar(Persona persona) {
		System.out.println("Insertando persona en un archivo.");
		System.out.println(persona.toString());
		return true;
	}

	public boolean actualizar(Persona persona) {
		System.out.println("Actualizando persona en un archivo.");
		System.out.println(persona.toString());
		return true;
	}

	public boolean eliminar(Persona persona) {
		System.out.println("Eliminando persona en un archivo.");
		System.out.println(persona.toString());
		return true;
	}


}
