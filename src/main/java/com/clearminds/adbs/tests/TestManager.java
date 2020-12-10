package com.clearminds.adbs.tests;

import com.clearminds.adbs.exceptions.InstanceException;
import com.clearminds.adbs.impl.PersonaManager;
import com.clearminds.adbs.interfaces.ServicioPersona;
import com.clearminds.adbs.model.Persona;

public class TestManager {
		public static void main(String[] args) {
			PersonaManager personaManager = null;
			PersonaManager archivos = null;
			PersonaManager bdd = null;
			try {
				personaManager = new PersonaManager();
				System.out.println(personaManager);
				bdd = new PersonaManager("bdd");
				System.out.println(bdd);
				archivos = new PersonaManager("archivos");
				System.out.println();
			} catch (InstanceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			personaManager.insertarPersona(new Persona("Andrés","Betancourt",20));
			bdd.insertarPersona(new Persona("Andrés","Betancourt",20));
			archivos.insertarPersona(new Persona("Andrés","Betancourt",20));
		}
}
