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
public class AccidentController {

    @Autowired
    private AccidentService accidentService;

//    public AccidentController(AccidentRepository accidentRepository) {
//        this.accidentRepository = accidentRepository;
//    }

//    @GetMapping("/us-accident")
//    public String getUsAccident(Model model){
//        List<Accident> listAccident =  accidentService.getAllAccident();
//        model.addAttribute("listAccident", listAccident);
//        return "home";
//    }

    @GetMapping("/us-accidents/geo-loc")
    public String getUsAccidentByDistance(Model model,
                                          @RequestParam(value="long", required = false) float longitude,
                                          @RequestParam(value="lat", required = false) float latitude,
                                          @RequestParam(value="dist", required = false) int distance){
        List<Accidents> accidentsList =  accidentService.getALlAccidentsByDistance(longitude, latitude, distance);
        System.out.println("accidentsList.size() = " + accidentsList.size());

        model.addAttribute("accidentsList", accidentsList);
        return "index";
    }

    @GetMapping("/us-accidents")
    public String getUsAccidentByDistance(Model model,
                                          @RequestParam(value="city", required = false) String city,
                                          @RequestParam(value="county", required = false) String county
                                          ){

        System.out.println("city + county = " + city + county);
        List<Accidents> accidentsList = accidentService.getAllAccidentsByFilter(city, county);
        model.addAttribute("accidentsList", accidentsList);
        return "index";
    }
}
