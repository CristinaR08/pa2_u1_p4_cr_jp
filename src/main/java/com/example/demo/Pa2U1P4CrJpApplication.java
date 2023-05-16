package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Pa2U1P4CrJpApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4CrJpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Mi primer proyecto");
		/*Spring framework: Framework que permite la construccion/desarrollo
		 * de aplicaciones empresariales basadas en Spring*/
		
		Profesor profe = new Profesor();
		profe.setApellido("RIVERA, AGUAS");
		profe.setCedula("1724340391");
		profe.setFechaNacimiento(LocalDateTime.now());
		profe.setNombre("Cristina, Roberto");
		
		System.out.println(profe);
	}

}
