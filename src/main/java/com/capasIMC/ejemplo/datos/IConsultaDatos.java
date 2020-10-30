package com.capasIMC.ejemplo.datos;

import java.io.IOException;

import com.capasIMC.ejemplo.persona.dto.Persona;

public interface IConsultaDatos {

	Persona consultaPersona(String nombre) throws IOException;

}