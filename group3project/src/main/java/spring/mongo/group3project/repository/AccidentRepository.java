package spring.mongo.group3project.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import spring.mongo.group3project.document.Accident;

public interface AccidentRepository extends MongoRepository<Accident, Integer> {
}
