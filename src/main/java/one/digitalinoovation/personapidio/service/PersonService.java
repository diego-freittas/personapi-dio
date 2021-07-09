package one.digitalinoovation.personapidio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.digitalinoovation.personapidio.dto.request.PersonDTO;
import one.digitalinoovation.personapidio.dto.response.MessageResponseDTO;
import one.digitalinoovation.personapidio.entity.Person;
import one.digitalinoovation.personapidio.mapper.PersonMapper;
import one.digitalinoovation.personapidio.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	private final PersonMapper personMapper = PersonMapper.INSTANCE;

	
	// Metodo refatorado que utiliza o MapStruct para fazer a conversão de um um objeto do tipo PersonDTO para Person
	
	public MessageResponseDTO createPerson(PersonDTO personDTO) {
		
		Person personToSave = personMapper.toModel(personDTO); // Convertendo o PersonDTO em uma Entity
		Person savedPerson = personRepository.save(personToSave);
		return MessageResponseDTO
				.builder()
				.message("Created person with ID" + savedPerson.getId())
				.build();
	}
	
	// Metodo que faz "manualmente" a conversão de um objeto do tipo PersonDTO para Person
//	public MessageResponseDTO createPerson(PersonDTO personDTO) {
//		Person personToSave = Person.builder()
//				.firstName(personDTO.getFirstName())
//				.lastName(personDTO.getLastName())
//				.birthDate(personDTO.getBirthDate())
//				.cpf(personDTO.getCpf())
//				.build();
//		
//		Person savedPerson = personRepository.save(personToSave);
//		return MessageResponseDTO
//				.builder()
//				.message("Created person with ID" + savedPerson.getId())
//				.build();
//	}
}
