package one.digitalinoovation.personapidio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.digitalinoovation.personapidio.dto.request.PersonDTO;
import one.digitalinoovation.personapidio.dto.response.MessageResponseDTO;
import one.digitalinoovation.personapidio.entity.Person;
import one.digitalinoovation.personapidio.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	public MessageResponseDTO createPerson(PersonDTO personDTO) {
		Person personToSave = Person.builder()
				.firstName(personDTO.getFirstName())
				.lastName(personDTO.getLastName())
				.birthDate(personDTO.getBirthDate())
				.cpf(personDTO.getCpf())
				.build();
		
		Person savedPerson = personRepository.save(personToSave);
		return MessageResponseDTO
				.builder()
				.message("Created person with ID" + savedPerson.getId())
				.build();
	}
}
