package one.digitalinoovation.personapidio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Controler acessado via API REST
@RequestMapping("/api/v1/people") // caminho de acesso da APi
public class PersonController {

	
	@GetMapping // Operação http do tipo GET
	public String getBook() {
		return "PersonController diz --> Hello World!!! ";
	}
	
}
