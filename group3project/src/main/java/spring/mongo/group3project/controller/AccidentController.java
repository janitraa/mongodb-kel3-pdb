package spring.mongo.group3project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spring.mongo.group3project.document.Accident;
import spring.mongo.group3project.document.Accidents;
import spring.mongo.group3project.repository.AccidentRepository;
import spring.mongo.group3project.service.AccidentService;

import java.util.List;

@Controller
@RequestMapping("/accident")
public class AccidentController {

    private AccidentRepository accidentRepository;

    @Autowired
    private AccidentService accidentService;

    public AccidentController(AccidentRepository accidentRepository) {
        this.accidentRepository = accidentRepository;
    }

    @GetMapping("/us-accident")
    public String getUsAccident(Model model){
        List<Accident> listAccident =  accidentService.getAllAccident();
        model.addAttribute("listAccident", listAccident);
        return "home";
    }

    @GetMapping("/us-accident/by-distance")
    public String getUsAccidentByDistance(Model model,
                                          @RequestParam(value="long") float longitude,
                                          @RequestParam(value="lat") float latitude,
                                          @RequestParam(value="dist") int distance){
        List<Accidents> listAccidents =  accidentService.getALlAccidentsByDistance(longitude, latitude, distance);
        model.addAttribute("listAccident", listAccidents);
        return "home";
    }
}
