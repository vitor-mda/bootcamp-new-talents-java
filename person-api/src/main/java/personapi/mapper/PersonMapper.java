package personapi.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import personapi.dto.request.PersonDTO;
import personapi.entity.Person;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(
            target = "birthDate",
            source = "birthDate",
            dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO personDTO);

    @Mapping(
            target = "birthDate",
            source = "birthDate",
            dateFormat = "dd-MM-yyyy")
    PersonDTO toDTO(Person person);

}
