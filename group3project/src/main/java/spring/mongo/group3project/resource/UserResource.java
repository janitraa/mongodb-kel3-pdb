//package spring.mongo.group3project.resource;
//
//import org.springframework.data.mongodb.core.MongoOperations;
//import org.springframework.data.mongodb.core.MongoTemplate;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import spring.mongo.group3project.document.Accident;
////import spring.mongo.group3project.document.Pegawai;
////import spring.mongo.group3project.document.Users;
//import spring.mongo.group3project.repository.AccidentRepository;
////import spring.mongo.group3project.repository.PegawaiRepository;
////import spring.mongo.group3project.repository.UserRepository;
//import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/rest/users")
//public class UserResource {
//
////    private UserRepository userRepository;
//
////    private PegawaiRepository pegawaiRepository;
//
//    private AccidentRepository accidentRepository;
//
//    public UserResource(AccidentRepository accidentRepository) {
////        this.userRepository = userRepository;
////        this.pegawaiRepository = pegawaiRepository;
//        this.accidentRepository = accidentRepository;
//    }
//
////    @GetMapping("/all")
////    public List<Users> getAll(){
////        return userRepository.findAll();
////    }
//
//
////    @GetMapping("/all-test")
////    public List<Pegawai> getAllTest(){
//////        MongoOperations mongoOps = new MongoTemplate(new SimpleMongoClientDatabaseFactory(new Mongo(), "database"));
////        return pegawaiRepository.findAll();
////    }
//
//    @GetMapping("/us-accident")
//    public List<Accident> getUsAccident(){
////        MongoOperations mongoOps = new MongoTemplate(new SimpleMongoClientDatabaseFactory(new Mongo(), "database"));
//        return accidentRepository.findAll();
//    }
//}
