package one.digitalinoovation.personapidio.exeption;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Actor Not Found")
@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class PersonNotFoundExeption extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PersonNotFoundExeption(Long id) {
		super("Não foi encontrado uma pessoa com o código " + id);
	}
}
