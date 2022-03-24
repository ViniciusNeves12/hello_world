package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	@GetMapping
	public String helloworld() {
		return "Hello World";
	}
	
	@GetMapping("listaBSM")
	public String listaBSM() {
		
		return  "Orientação ao Futuro\r\n"
				+ "Responsabilidade Pessoal\r\n"
				+ "Mentalidade de Crescimento\r\n"
				+ "Persistência\r\n"
				+ "Habilidades\r\n"
				+ "Trabalho em Equipe\r\n"
				+ "Atenção aos Detalhes\r\n"
				+ "Proatividade\r\n"
				+ "Comunicação ";
	}
	
	@GetMapping("objetivoAprendizagem")
	public String objetivoAprendizagem() {
		return "Aprender e praticar o framwork spring\r\n"
				+ "praticar mais o trabalho em equipe\r\n"
				+ "Melhorar minha lógica de programção\r\n"
				+ "melhorar minha comunicação\r\n";
	}
}
