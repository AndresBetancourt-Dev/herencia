package com.clearminds.adbs.interfaces;

import com.clearminds.adbs.model.Persona;

public interface ServicioPersona {
		
       public boolean insertar(Persona persona);
       public boolean actualizar(Persona persona);
       public boolean eliminar(Persona persona);
}
