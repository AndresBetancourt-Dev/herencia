package com.clearminds.adbs.impl;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import com.clearminds.adbs.exceptions.InstanceException;
import com.clearminds.adbs.interfaces.ServicioPersona;
import com.clearminds.adbs.model.Persona;

public class PersonaManager {
	ServicioPersona serv;

	public PersonaManager(String property) throws InstanceException{
		super();
		File file = new File("config.properties");
		Properties properties = new Properties();
		try {
			properties.load(new FileReader(file));
			Class<?> clase = Class.forName("com.clearminds.adbs.impl."+((properties.getProperty(property) != null)? properties.getProperty(property) :"ServicioPersonaBDD"));
			serv = (ServicioPersona)clase.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			throw new InstanceException("Error al Obtener una instancia de Servicio Persona");
		}
		
	}
	
	public PersonaManager() throws InstanceException{
		super();
		File file = new File("config.properties");
		Properties properties = new Properties();
		try {
			properties.load(new FileReader(file));
			Class<?> clase = Class.forName("com.clearminds.adbs.impl."+((properties.getProperty("clase") != null)? properties.getProperty("clase") :"ServicioPersonaBDD"));
			serv = (ServicioPersona)clase.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			throw new InstanceException("Error al Obtener una instancia de Servicio Persona");
		}
		
	}
	
	public void insertarPersona(Persona persona){
		serv.insertar(persona);
	}
	
}
