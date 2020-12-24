package spring.mongo.group3project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.mongo.group3project.document.Accident;
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
}
