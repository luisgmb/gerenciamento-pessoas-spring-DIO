package one.digitalinnovation.personalapi.utils;

import one.digitalinnovation.personalapi.dto.request.PersonDTO;
import one.digitalinnovation.personalapi.entity.Person;

import java.time.LocalDate;
import java.util.Collections;

public class PersonUtils {
    private static final String FIRST_NAME = "Luis";
    private static final String LAST_NAME = "Barcelos";
    private static final String CPF_NMBR = "010.085.260-29";
    private static final LocalDate BIRTH_DATE = LocalDate.of(1997,7,25);
    private static final long PERSON_ID = 1L;

    public static PersonDTO createFakeDTO(){
        return PersonDTO.builder().firstName(FIRST_NAME).lastName(LAST_NAME).cpf(CPF_NMBR).birthDate("15-12-2000")
                .phones(Collections.singletonList(PhoneUtils.createFakeDTO())).build();
    }
    public static Person createFakeEntity(){
        return Person.builder().id(PERSON_ID).firstName(FIRST_NAME).lastName(LAST_NAME).cpf(CPF_NMBR).birthDate(BIRTH_DATE)
                .phones(Collections.singletonList(PhoneUtils.createFakeEntity())).build();
    }
}
