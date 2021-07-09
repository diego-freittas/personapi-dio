package one.digitalinoovation.personapidio.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.digitalinoovation.personapidio.dto.request.PersonDTO;
import one.digitalinoovation.personapidio.dto.response.MessageResponseDTO;
import one.digitalinoovation.personapidio.entity.Person;
import one.digitalinoovation.personapidio.exeption.PersonNotFoundExeption;
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


	public List<PersonDTO> listAll() {
		
		List<Person> allPeople = personRepository.findAll();
		
		return allPeople.stream()
				.map(personMapper::toDTO)
				.collect(Collectors.toList());
	}


	public PersonDTO findById(Long id) throws PersonNotFoundExeption {
		
		Optional<Person> optionalPerson = personRepository.findById(id);
		// Verificando se o ID passado como parametro existe no banco de dados
		if(optionalPerson.isEmpty()) { 
			throw new PersonNotFoundExeption(id);
		}
		return personMapper.toDTO(optionalPerson.get());
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
