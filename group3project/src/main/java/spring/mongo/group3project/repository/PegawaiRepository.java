package spring.mongo.group3project.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import spring.mongo.group3project.document.Pegawai;

public interface PegawaiRepository extends MongoRepository<Pegawai, Integer> {
}
