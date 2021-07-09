package one.digitalinoovation.personapidio.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import one.digitalinoovation.personapidio.dto.request.PersonDTO;
import one.digitalinoovation.personapidio.dto.response.MessageResponseDTO;
import one.digitalinoovation.personapidio.service.PersonService;

@RestController // Controler acessado via API REST
@RequestMapping("/api/v1/people") // caminho de acesso da APi
public class PersonController {

	@Autowired
	private PersonService personService;
	
	
	@PostMapping 
	@ResponseStatus(HttpStatus.CREATED)
	//@RequestBody informa que o objeto person vai ser passado via requisicao
	public MessageResponseDTO createPerson(@RequestBody @Valid PersonDTO personDTO) {
		return personService.createPerson(personDTO);
	}
	
	
	
//	{
//	    "firstName": "Diego",
//	    "lastName" : "Freitas", 
//	    "cpf": "808.808.808-00",
//	    "phones" : [
//	        {
//	            "type":"MOBILE",
//	            "number":"71 99999-9999" 
//	    }
//	    ]
//	}
	
}
