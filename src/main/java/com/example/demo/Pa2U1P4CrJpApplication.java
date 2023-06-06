package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
//import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.banco.repository.modelo.Cajero;
import com.example.demo.banco.repository.modelo.Cuenta;
import com.example.demo.banco.repository.modelo.Impuesto;
import com.example.demo.banco.repository.modelo.Presidente;
import com.example.demo.banco.repository.modelo.Transferencia;
import com.example.demo.banco.service.CargaSistemaService;
import com.example.demo.banco.service.CuentaService;
import com.example.demo.banco.service.TransferenciaService;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.EstudianteService;

@SpringBootApplication
public class Pa2U1P4CrJpApplication implements CommandLineRunner { // me permite trabajar con la consola
	
	@Autowired
	private Cajero cajero;
	
	@Autowired
	private Cajero cajero1;
	
	@Autowired
	private Presidente presidente;
	
	@Autowired
	private Presidente presidente2;
	
	@Autowired
	private CargaSistemaService cargaSistemaService;
	
	@Autowired
	private TransferenciaService transferenciaService;
		
	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4CrJpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.cajero.setApellido("Rivera");
		this.cajero.setNombre("Cristina");
		this.cajero.setSalario(new BigDecimal(100));
		System.out.println(this.cajero);
		this.cajero1.setApellido("Almeida");
		System.out.println(this.cajero1);
		System.out.println(this.cajero1.getApellido());
	
		this.presidente.setApellido("Corrales");
		this.presidente.setNombre("Carolina");
		this.presidente.setCedula("1789653024");
		
		this.presidente2.setApellido("Taco");
		
		System.out.println(this.presidente);
		System.out.println(this.presidente2);
		
		System.out.println(">>>>>>>SEGUNDA PARTE<<<<<<<<");
		this.cargaSistemaService.cargar();
		Transferencia transfer = new Transferencia();
		transfer.setCuentaDestino(null);
		transfer.setCuentaOrigen(null);
		transfer.setFechas(LocalDateTime.now());
		transfer.setMonto(new BigDecimal(100));
		transfer.setNumero("123123");
		this.transferenciaService.guardar(transfer);
		
	}

}
