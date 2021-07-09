package one.digitalinoovation.personapidio.dto.request;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinoovation.personapidio.enums.PhoneType;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class PhoneDTO {

	private Long id;
	@Enumerated(EnumType.STRING)
	private PhoneType type;
	
	@NotEmpty
	@Size(min = 2, max = 20)
	private String number;
}
