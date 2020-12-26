package spring.mongo.group3project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Circle;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Metrics;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.mongo.group3project.document.Accident;
import spring.mongo.group3project.document.Accidents;
import spring.mongo.group3project.repository.AccidentRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class AccidentServiceImpl implements AccidentService{

    @Autowired
    AccidentRepository accidentRepository;

    @Autowired
    private MongoOperations mongoOperations;

    @Override
    public List<Accident> getAllAccident(){
        List<Accident> allAccident = accidentRepository.findAll();
        List<Accident> headAccident = new ArrayList<>();

        for(int i = 0; i< 5; i++)
            headAccident.add(allAccident.get(i));

        return headAccident;
    }

    @Override
    public List<Accidents> getALlAccidentsByDistance(float longitude, float latitude, int distance) {
        Point basePoint = new Point(longitude, latitude);

        Distance radius = new Distance(distance, Metrics.KILOMETERS);

        Circle area = new Circle(basePoint, radius);

        Query query = new Query();
        query.addCriteria(Criteria.where("location.coordinates").withinSphere(area));

        return mongoOperations.find(query, Accidents.class);
    }


}
