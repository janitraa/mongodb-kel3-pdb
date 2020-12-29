package spring.mongo.group3project.service;

import spring.mongo.group3project.document.Accidents;

import java.util.List;

public interface AccidentService {

//    public List<Accident> getAllAccident();

    public List<Accidents> getALlAccidentsByDistance(float longitude, float latitude, int distance);

    public List<Accidents> getAllAccidentsByFilter(String city, String county, String date);

}
