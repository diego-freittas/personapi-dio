package one.digitalinoovation.personapidio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import one.digitalinoovation.personapidio.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{
	

}
