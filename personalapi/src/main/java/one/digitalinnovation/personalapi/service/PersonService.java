package one.digitalinnovation.personalapi.service;

import one.digitalinnovation.personalapi.dto.MessageResponseDTO;
import one.digitalinnovation.personalapi.entity.Person;
import one.digitalinnovation.personalapi.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class PersonService {
    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @PostMapping
    public MessageResponseDTO createPerson(Person person){
        Person savedPerson = personRepository.save(person);

        return MessageResponseDTO.builder().message("Created a person with ID " + savedPerson.getId()).build();
    }
}
