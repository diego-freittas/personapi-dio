package one.digitalinoovation.personapidio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import one.digitalinoovation.personapidio.dto.response.MessageResponseDTO;
import one.digitalinoovation.personapidio.entity.Person;
import one.digitalinoovation.personapidio.repository.PersonRepository;

@Service // O Spring vai gerenciar um servico
public class PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	public MessageResponseDTO createPerson(Person person) {
		Person savedPerson = personRepository.save(person);
		return MessageResponseDTO
				.builder()
				.message("Created person with ID" + savedPerson.getId())
				.build();
	}
	
}
