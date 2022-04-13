package com.practica1.componentes;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class Componente_Implementa implements Componente_Dependencia {

	

	@Override
	public String leer_teclado() {
		System.out.println("Por favor ingresa tu nombre");
		Scanner leer = new Scanner(System.in); 
		return leer.nextLine();
	}
	
	@Override
	public void salida_mensaje(String mensaje) {
		System.out.println(mensaje);
		
	}

	

}
