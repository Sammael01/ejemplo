package co.edu.unbosque.calculadora.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.calculadora.dto.OperacionDTO;
import co.edu.unbosque.calculadora.service.OperacionService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/operacion")
@CrossOrigin(origins = { "http://localhost:8081", "*" })

public class OperacionController {
	
	@Autowired
	private OperacionService operacionServi;
	
	public OperacionController() {
		// TODO Auto-generated constructor stub
	}
	
	@PostMapping("/sumar")
	public ResponseEntity<String> sumar(@RequestParam int numero1, @RequestParam int numero2) {
		OperacionDTO suma = new OperacionDTO(numero1, numero2);
		int status = operacionServi.suma(suma);
		if (status == 0) {
			return new ResponseEntity<>("Suma realizada con éxito, su resultado es: " + suma.getResultado(), HttpStatus.ACCEPTED);
		}else {
			return new ResponseEntity<>("Error al hacer la suma", HttpStatus.BAD_REQUEST);
		}			
	}
	
	@PostMapping("/restar")
	public ResponseEntity<String> restar(@RequestParam int numero1, @RequestParam int numero2) {
		OperacionDTO resta = new OperacionDTO(numero1, numero2);
		int status = operacionServi.resta(resta);
		if (status == 0) {
			return new ResponseEntity<>("Resta realizada con éxito, su resultado es: " + resta.getResultado()  , HttpStatus.ACCEPTED);
		}else {
			return new ResponseEntity<>("Error al hacer la resta", HttpStatus.BAD_REQUEST);
		}			
	}
	
	@PostMapping("/multiplicar")
	public ResponseEntity<String> multiplicar(@RequestParam int numero1, @RequestParam int numero2) {
		OperacionDTO multiplicacion = new OperacionDTO(numero1, numero2);
		int status = operacionServi.multi(multiplicacion);
		if (status == 0) {
			return new ResponseEntity<>("Multiplicación realizada con éxito, su resultado es: " + multiplicacion.getResultado(), HttpStatus.ACCEPTED);
		}else {
			return new ResponseEntity<>("Error al hacer la multiplicación", HttpStatus.BAD_REQUEST);
		}			
	}
	
	@PostMapping("/dividir")
	public ResponseEntity<String> dividir(@RequestParam int numero1, @RequestParam int numero2) {
		OperacionDTO division = new OperacionDTO(numero1, numero2);
		int status = operacionServi.divi(division);
		if (status == 0) {
			return new ResponseEntity<>("División realizada con éxito, su resultado es: " + division.getResultado(), HttpStatus.ACCEPTED);
		}else {
			return new ResponseEntity<>("Error al hacer la División", HttpStatus.BAD_REQUEST);
		}			
	}
	
	@GetMapping("mostrartodo")
	public ResponseEntity <List<OperacionDTO>> mostrarTodo () {
		List<OperacionDTO> operaciones = operacionServi.getAll();
		if(operaciones.isEmpty()) {
			return new ResponseEntity <List<OperacionDTO>>(operaciones, HttpStatus.NO_CONTENT);
		}else {
			return new ResponseEntity <List<OperacionDTO>>(operaciones, HttpStatus.ACCEPTED);
		}

	}
	
	
	
	
	
	
	


}
