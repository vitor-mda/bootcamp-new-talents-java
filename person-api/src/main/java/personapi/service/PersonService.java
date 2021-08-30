package personapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import personapi.dto.response.MessageResponseDTO;
import personapi.entity.Person;
import personapi.repository.PersonRepository;

@Service
public class PersonService {
    private PersonRepository personRepository;

    @Autowired
    PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(Person person) {
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Created person with ID " + savedPerson.getId())
                .build();
    }
}
