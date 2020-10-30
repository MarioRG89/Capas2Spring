package com.capasIMC.ejemplo.datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.capasIMC.ejemplo.persona.dto.Persona;
@Component
public class AccesoDatos implements IConsultaDatos {

	@Override
	public Persona consultaPersona(String nombre) throws IOException {
		
		File file = new File("C:\\Users\\201912\\Desktop\\ejercicioCapas2.txt");
		BufferedReader lector = new BufferedReader(new FileReader(file));
		String lineas;
		while((lineas = lector.readLine()) != null) {
			if(lineas.contains(nombre)) {
				return anadePersona(lineas);
			}
		}
		lector.close();
		return null;
		
		
	}

	/**
	 * @param lineas
	 * @return
	 */
	private Persona anadePersona(String lineas) {
		String []arrayPersona= lineas.split("-");
		Persona p = new Persona(arrayPersona[0], Integer.parseInt(arrayPersona[1]), Integer.parseInt(arrayPersona[2]));
		return p;
	}

	
}
