package de.aittr.firstdemohomework;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/cats")
public class CatController {

    private CatService service;

    public CatController(CatService service) {
        this.service = service;
    }

    @GetMapping                  // ultimul punct
    public String getAllCats(Model model){
        List<Cat> cats = service.findAll();
        model.addAttribute("cats", cats);
        return "cats_view";
    }
}
