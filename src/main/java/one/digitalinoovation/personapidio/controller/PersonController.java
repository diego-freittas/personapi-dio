package one.digitalinoovation.personapidio.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import one.digitalinoovation.personapidio.dto.request.PersonDTO;
import one.digitalinoovation.personapidio.dto.response.MessageResponseDTO;
import one.digitalinoovation.personapidio.exeption.PersonNotFoundExeption;
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
	
	@GetMapping
	public List<PersonDTO> listAll(){
		return personService.listAll();
	}
	
	@GetMapping("/{id}")
	//@PathVariable // indica que em uma requisição eu vou passar um parametro
	public PersonDTO findById(@PathVariable Long id) throws PersonNotFoundExeption {
		return personService.findById(id);
	}
	
	
//	{
//	    "firstName": "Diego",
//	    "lastName" : "Freitas", 
//	    "cpf": "369.333.878-79",
//	    "phones" : [
//	        {
//	            "type":"MOBILE",
//	            "number":"71 99999-9999" 
//	    }
//	    ]
//	}
	
}
