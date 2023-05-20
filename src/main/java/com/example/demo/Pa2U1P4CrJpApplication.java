package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Pa2U1P4CrJpApplication implements CommandLineRunner{
	
	@Autowired //inyeccion de dependencia
	private Profesor profe2; 

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4CrJpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Mi primer proyecto");
		/*Spring framework: Framework que permite la construccion/desarrollo
		 * de aplicaciones empresariales basadas en Spring*/
		
		Profesor profe = new Profesor(); //delegamos el manejo del contenedor a profesor
		profe.setApellido("Rivera");
		profe.setCedula("1726600537");
		profe.setFechaNacimiento(LocalDateTime.now());
		profe.setNombre("Cristina");
		
		System.out.println(profe);
		System.out.println(profe.getApellido());
		
		System.out.println(profe2); //null pointer exception se da porque quisimos acceder a algo que no existe (es nulo) 
		profe2.setApellido("Sanchez");
		System.out.println(profe2.getApellido());
		
		/*Profesor profe3 = new Profesor();
		profe3 = profe;
		System.out.println(profe3);
		profe.setApellido("TT");
		System.out.println(profe3);
		profe3.setNombre("UwU");
		System.out.println(profe3);*/

		MatriculaCalculo mat = new MatriculaCalculo();
		mat.realizarMatricula("1");
		
	}

}
