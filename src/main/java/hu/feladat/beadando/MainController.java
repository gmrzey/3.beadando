package hu.feladat.beadando;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @ResponseBody
    @GetMapping(path ="/input")
    public String getMessage(@RequestParam(defaultValue = "Felhasznalo") String name){

        return String.format("Hello %s", name);
    }

}
