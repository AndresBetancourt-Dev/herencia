package com.clearminds.adbs.tests;

import com.clearminds.adbs.impl.PersonaManager;
import com.clearminds.adbs.interfaces.ServicioPersona;
import com.clearminds.adbs.model.Persona;

public class TestManager {
		public static void main(String[] args) {
			PersonaManager personaManager = new PersonaManager();
			personaManager.insertarPersona(new Persona("Andrés","Betancourt",20));
		}
}
