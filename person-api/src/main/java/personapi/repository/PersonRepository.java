package personapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import personapi.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
