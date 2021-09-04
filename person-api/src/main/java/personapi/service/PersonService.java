package personapi.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import personapi.dto.request.PersonDTO;
import personapi.dto.response.MessageResponseDTO;
import personapi.entity.Person;
import personapi.exception.PersonNotFoundException;
import personapi.mapper.PersonMapper;
import personapi.repository.PersonRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonService {
    private PersonRepository personRepository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    public MessageResponseDTO createPerson(PersonDTO personDTO) {
        Person createdPerson = personRepository.save(personMapper.toModel(personDTO));

        return MessageResponseDTO
                .builder()
                .message("Created person with ID " + createdPerson.getId())
                .build();
    }

    public List<PersonDTO> listAll() {
        return personRepository.findAll()
                .stream()
                .map(personMapper::toDTO)
                .collect(Collectors.toList());
    }

    public PersonDTO findById(Long id) throws PersonNotFoundException {
        return personMapper.toDTO(returnByIdIfExists(id));
    }

    public MessageResponseDTO updateById(Long id, PersonDTO personDTO) throws PersonNotFoundException {
        returnByIdIfExists(id);
        Person updatedPerson = personRepository.save(personMapper.toModel(personDTO));

        return createMessageResponse("Updated person with ID " + updatedPerson.getId());
    }

    public void delete(Long id) throws PersonNotFoundException {
        personRepository.delete(returnByIdIfExists(id));
    }

    private Person returnByIdIfExists(Long id) throws PersonNotFoundException{
        return personRepository
                .findById(id)
                .orElseThrow(() -> new PersonNotFoundException(id));
    }

    private MessageResponseDTO createMessageResponse(String message) {
        return MessageResponseDTO
                .builder()
                .message(message)
                .build();
    }
}