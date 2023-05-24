package com.example.demo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.EstudianteService;

@SpringBootApplication
public class Pa2U1P4CrJpApplication implements CommandLineRunner { // me permite trabajar con la consola

	@Autowired
	private EstudianteService estudianteService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4CrJpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Estudiante miEstudiante = new Estudiante();
		miEstudiante.setApellido("Rivera");
		miEstudiante.setCedula("1726600537");
		miEstudiante.setNombre("Cristina");
		miEstudiante.setFechaNacimiento(LocalDateTime.of(1998, 8, 4, 18, 25));

		Estudiante miEstudiante1 = new Estudiante();
		miEstudiante1.setApellido("Bastidas");
		miEstudiante1.setCedula("1785693245");
		miEstudiante1.setNombre("Mauricio");
		miEstudiante1.setFechaNacimiento(LocalDateTime.of(1998, 5, 4, 9, 35));

		// 1. Guardar estudiante
		this.estudianteService.registrar(miEstudiante);
		this.estudianteService.registrar(miEstudiante1);

		// 5. Imprimir Reporte
		List<Estudiante> reporte = this.estudianteService.reporteDeTodos();
		System.out.println(">>> Reporte de todos los estudiantes: ");
		for (Estudiante estu : reporte) {
			System.out.println(estu);
		}

		// 2. Actualizar
		miEstudiante1.setApellido("Linares");
		this.estudianteService.actualizar(miEstudiante1);

		// 5. Imprimir Actualizacion
		List<Estudiante> reporte2 = this.estudianteService.reporteDeTodos();
		System.out.println(">>> Reporte de todos los estudiantes: ");
		for (Estudiante estu : reporte2) {
			System.out.println(estu);
		}

		// 3. Eliminar
		this.estudianteService.borrar("1726600537");

		// 5. Imprimir Eliminacion
		List<Estudiante> reporte3 = this.estudianteService.reporteDeTodos();
		System.out.println(">>> Reporte de todos los estudiantes: ");
		for (Estudiante estu : reporte3) {
			System.out.println(estu);
		}
		
		// 4. Busco por cedula
		System.out.println(">>> Buscando ...");
		Estudiante busqueda = this.estudianteService.buscarCedula("1785693245");
		Estudiante busqueda1 = this.estudianteService.buscarCedula("1746302365");
		System.out.println(busqueda);
		System.out.println(busqueda1);

	}

}
