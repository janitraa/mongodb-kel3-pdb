package spring.mongo.group3project.resource;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.mongo.group3project.document.Users;
import spring.mongo.group3project.repository.UserRepository;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UserResource {

    private UserRepository userRepository;

    public UserResource(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/all")
    public List<Users> getAll(){
        return userRepository.findAll();
    }


    @GetMapping("/all-test")
    public List<Users> getAllTest(){
        MongoOperations mongoOps = new MongoTemplate(new SimpleMongoDbFactory(new Mongo(), "database"));
    }
}
