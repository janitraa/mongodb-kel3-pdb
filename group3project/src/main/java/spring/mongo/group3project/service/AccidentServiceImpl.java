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

//    @Override
//    public List<Accidents> getAllAccident(){
//        List<Accident> allAccident = accidentRepository.findAll();
//        List<Accident> headAccident = new ArrayList<>();
//
//        for(int i = 0; i< 5; i++)
//            headAccident.add(allAccident.get(i));
//
//        return headAccident;
//    }

    @Override
    public List<Accidents> getALlAccidentsByDistance(float longitude, float latitude, int distance) {
        Point basePoint = new Point(longitude, latitude);

        Distance radius = new Distance(distance, Metrics.KILOMETERS);

        Circle area = new Circle(basePoint, radius);

        Query query = new Query();
        query.addCriteria(Criteria.where("location.coordinates").withinSphere(area));

        return mongoOperations.find(query, Accidents.class);
    }

    @Override
    public List<Accidents> getAllAccidentsByFilter(String city, String county){
//        System.out.println("city.isEmpty() = " + city.isEmpty());
//        System.out.println("city.isBlank() = " + city.isBlank());
//        System.out.println("county.isEmpty() = " + county.isEmpty());
//        System.out.println("county.isBlank() = " + county.isBlank());

        List<Accidents> accidentsList = new ArrayList<>();

        if((city == null && county == null) || (city.isEmpty() && county.isEmpty())){
            accidentsList.addAll(accidentRepository.findAll());
            System.out.println("accidentsList.size() = " + accidentsList.size());

            return accidentsList;
        }

        if(city != null && !city.isEmpty()){
            List<Accidents> accidentsByCity = accidentRepository.findAllByCityContains(city);
            System.out.println("accidentsByCity = " + accidentsByCity.size());

            accidentsList.addAll(accidentsByCity);
        }

        if(county != null && !county.isEmpty()){
            List<Accidents> accidentsByCounty = accidentRepository.findAllByCountyContains(county);

            System.out.println("accidentsByCounty = " + accidentsByCounty.size());

            accidentsList.retainAll(accidentsByCounty);
        }
        System.out.println("accidentsList filtered = " + accidentsList.size());

        return accidentsList;
//        return null;
//        Query query = new Query();
//        query.addCriteria(Criteria.where("city").regex(city));
    }


}
