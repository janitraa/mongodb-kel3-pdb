package spring.mongo.group3project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.mongo.group3project.document.Accident;
import spring.mongo.group3project.repository.AccidentRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class AccidentServiceImpl implements AccidentService{

    @Autowired
    AccidentRepository accidentRepository;

    @Override
    public List<Accident> getAllAccident(){
        List<Accident> allAccident = accidentRepository.findAll();
        List<Accident> headAccident = new ArrayList<>();

        for(int i = 0; i< 5; i++)
            headAccident.add(allAccident.get(i));

        return headAccident;
    }

}
