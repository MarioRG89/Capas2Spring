package com.capasIMC.ejemplo.persona.dto;

public class Persona {
	String nombre;
	Integer peso;
	Integer altura;
	
	public Persona(String nombre, Integer peso, Integer altura) {
		this.nombre = nombre;
		this.peso = peso;
		this.altura = altura;
	}

	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return el peso
	 */
	public Integer getPeso() {
		return peso;
	}

	/**
	 * @param peso el peso a establecer
	 */
	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	/**
	 * @return el altura
	 */
	public Integer getAltura() {
		return altura;
	}

	/**
	 * @param altura el altura a establecer
	 */
	public void setAltura(Integer altura) {
		this.altura = altura;
	}
	
	
}
