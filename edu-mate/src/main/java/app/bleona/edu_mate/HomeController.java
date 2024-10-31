package app.bleona.edu_mate;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HomeController {
    
    @GetMapping("/home")
    public String home(){
        return "Home Page";
    }

}
