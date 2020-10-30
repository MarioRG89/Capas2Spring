package com.capasIMC.ejemplo.negocio;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capasIMC.ejemplo.datos.IConsultaDatos;


@Component
public class LogicaNegocio implements ICalcularIMC {
	@Autowired
	IConsultaDatos consultaDatos;
	@Override
	
	public double calcularImc(String nombre) throws IOException {
		double imc;
		double peso=(consultaDatos.consultaPersona(nombre).getPeso());
		double altura=(consultaDatos.consultaPersona(nombre).getAltura());
		imc=(peso/altura)*100;
		return imc;
		
	}
}
