package com.capasIMC.ejemplo.controlador;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.capasIMC.ejemplo.negocio.ICalcularIMC;
@Controller
public class Controlador {
	@Autowired
	ICalcularIMC calc;
	@RequestMapping("respuesta")
	public String calculaNumCoches(@RequestParam("nombre") String nombreRecibido,ModelMap model) {
		
		try {
			double numIMC=calc.calcularImc(nombreRecibido);
			model.addAttribute("imc",numIMC);
			model.addAttribute("nombre", nombreRecibido);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "respuestaIMC";
		
	}
}
