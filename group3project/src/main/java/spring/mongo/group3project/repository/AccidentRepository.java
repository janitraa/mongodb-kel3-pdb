package spring.mongo.group3project.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import spring.mongo.group3project.document.Accident;
import spring.mongo.group3project.document.Accidents;

import java.util.List;

public interface AccidentRepository extends MongoRepository<Accidents, Integer> {
    List<Accidents> findAllByCityContains(String city);
    List<Accidents> findAllByCountyContains(String county);
    List<Accidents> findAllByCityContainsAndCountyContains(String city, String county);
//    Accidents findAllByStr
}
