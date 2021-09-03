package personapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import personapi.dto.request.PersonDTO;
import personapi.dto.response.MessageResponseDTO;
import personapi.entity.Person;
import personapi.mapper.PersonMapper;
import personapi.repository.PersonRepository;

@Service
public class PersonService {
    private PersonRepository personRepository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    @Autowired
    PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(PersonDTO personDTO) {
        Person savedPerson = personRepository.save(personMapper.toModel(personDTO));

        return MessageResponseDTO
                .builder()
                .message("Created person with ID " + savedPerson.getId())
                .build();
    }
}
