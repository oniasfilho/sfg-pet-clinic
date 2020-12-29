package guru.springframework.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PetClinicController {

    @RequestMapping({"", "/", "index","index.html"})
    public String getIndex(){

        return "index";
    }

}
