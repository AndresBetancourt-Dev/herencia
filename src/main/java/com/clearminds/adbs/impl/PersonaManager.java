package com.clearminds.adbs.impl;

import com.clearminds.adbs.interfaces.ServicioPersona;
import com.clearminds.adbs.model.Persona;

public class PersonaManager {
	ServicioPersona serv;

	public PersonaManager() {
		super();
		serv = new ServicioPersonaBDD();
	}
	
	public void insertarPersona(Persona persona){
		serv.insertar(persona);
	}
	
}
