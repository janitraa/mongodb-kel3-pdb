package spring.mongo.group3project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.mongo.group3project.document.Accident;
import spring.mongo.group3project.document.Accidents;
import spring.mongo.group3project.repository.AccidentRepository;

import java.util.ArrayList;
import java.util.List;

public interface AccidentService {

    public List<Accident> getAllAccident();

    public List<Accidents> getALlAccidentsByDistance(float longitude, float latitude, int distance);

}
