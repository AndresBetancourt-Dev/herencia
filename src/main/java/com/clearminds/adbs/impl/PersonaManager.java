package com.clearminds.adbs.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.clearminds.adbs.exceptions.InstanceException;
import com.clearminds.adbs.interfaces.ServicioPersona;
import com.clearminds.adbs.model.Persona;

public class PersonaManager {
	ServicioPersona serv;

	public PersonaManager(String property) throws InstanceException{
		super();
		try {
			Class<?> clase = Class.forName("com.clearminds.adbs.impl."+(obtenerPropiedad(property)));
			serv = (ServicioPersona)clase.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			throw new InstanceException("Error al Obtener una instancia de Servicio Persona");
		}
		
	}
	
	public PersonaManager() throws InstanceException{
		super();
		try {
			Class<?> clase = Class.forName("com.clearminds.adbs.impl."+(obtenerPropiedad(null)));
			serv = (ServicioPersona)clase.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			throw new InstanceException("Error al Obtener una instancia de Servicio Persona");
		}
		
	}
	
	public String obtenerPropiedad(String property){
		File file = new File("config.properties");
		Properties properties = new Properties();
		if(property == null){
			property = "clase";
		}
		try {
			properties.load(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return ((properties.getProperty(property) != null)? properties.getProperty(property) : "ServicioPersonaBDD");
	}
	
	

	
	public void insertarPersona(Persona persona){
		serv.insertar(persona);
	}
	
}
