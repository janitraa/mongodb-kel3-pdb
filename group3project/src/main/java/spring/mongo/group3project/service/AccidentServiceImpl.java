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
    public List<Accidents> getALlAccidentsByDistance(float longitude, float latitude, int distance) {
        Point basePoint = new Point(longitude, latitude);

        Distance radius = new Distance(distance, Metrics.KILOMETERS);

        Circle area = new Circle(basePoint, radius);

        Query query = new Query();
        query.addCriteria(Criteria.where("location.coordinates").withinSphere(area));

        return mongoOperations.find(query, Accidents.class);
    }

    @Override
    public List<Accidents> getAllAccidentsByFilter(String city, String county, String date){
        List<Accidents> accidentsList = new ArrayList<>();

        if((city == null && county == null && date == null) || (city.isEmpty() && county.isEmpty() && date.isEmpty())){
            accidentsList = accidentRepository.findAll();
            List<Accidents> final_list = new ArrayList<>();
            if (accidentsList.size() >= 100) {
                for (int i = 0; i < 100; i++) {
                    final_list.add(accidentsList.get(i));
                }
            }
            else final_list.addAll(accidentsList);
            System.out.println("accidentsList.size() = " + accidentsList.size());

            return final_list;
        }

        if(county != null && city != null  && date != null && !date.isEmpty() && !city.isEmpty() && !county.isEmpty()){
            List<Accidents> accidentsByCityCountyDate = accidentRepository.findAllByCityContainsAndCountyContainsAndDateContains(city, county, date);

            System.out.println("accidentsByCityCountyDate = " + accidentsByCityCountyDate.size());

            accidentsList.addAll(accidentsByCityCountyDate);
            return accidentsList;
        }

        if(county != null && city != null  && !city.isEmpty() && !county.isEmpty()){
            List<Accidents> accidentsByCityCounty = accidentRepository.findAllByCityContainsAndCountyContains(city, county);

            System.out.println("accidentsByCityCounty = " + accidentsByCityCounty.size());

            accidentsList.addAll(accidentsByCityCounty);
            return accidentsList;
        }

        if(date != null && city != null  && !city.isEmpty() && !date.isEmpty()){
            List<Accidents> accidentsByCityDate = accidentRepository.findAllByCityContainsAndDateContains(city, date);

            System.out.println("accidentsByCityDate = " + accidentsByCityDate.size());

            accidentsList.addAll(accidentsByCityDate);
            return accidentsList;
        }

        if(date != null && county != null  && !county.isEmpty() && !date.isEmpty()){
            List<Accidents> accidentsByDateCounty = accidentRepository.findAllByDateContainsAndCountyContains(date, county);

            System.out.println("accidentsByDateCounty = " + accidentsByDateCounty.size());

            accidentsList.addAll(accidentsByDateCounty);
            return accidentsList;
        }

        if(city != null && !city.isEmpty()){
            List<Accidents> accidentsByCity = accidentRepository.findAllByCityContains(city);
            System.out.println("accidentsByCity = " + accidentsByCity.size());

            accidentsList.addAll(accidentsByCity);
            return accidentsList;

        }

        if(county != null && !county.isEmpty()){
            List<Accidents> accidentsByCounty = accidentRepository.findAllByCountyContains(county);

            System.out.println("accidentsByCounty = " + accidentsByCounty.size());

            accidentsList.addAll(accidentsByCounty);
            return accidentsList;

        }

        if(date != null && !date.isEmpty()){
            List<Accidents> accidentsByDate = accidentRepository.findAllByDateContains(date);

            System.out.println("accidentsByDate = " + accidentsByDate.size());

            accidentsList.addAll(accidentsByDate);
            return accidentsList;

        }
        System.out.println("accidentsList filtered = " + accidentsList.size());

        return accidentsList;
    }


}
