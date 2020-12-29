package spring.mongo.group3project.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {

    public MongoClient mongoClient() {
        return MongoClients.create("mongodb://localhost:27118");
    }

    public @Bean MongoTemplate mongoTemplate() {
        return new MongoTemplate(mongoClient(), "AccidentDatabase");
    }
}