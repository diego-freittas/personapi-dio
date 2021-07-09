package one.digitalinoovation.personapidio.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import one.digitalinoovation.personapidio.dto.request.PersonDTO;
import one.digitalinoovation.personapidio.entity.Person;

@Mapper
public interface PersonMapper {
	
	PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);
	
	Person toModel(PersonDTO personDTO);
	PersonDTO toDTO(Person person);

}
