package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/Hello")
public class Logcontrol implements loginterface{

    @GetMapping("/log")
    public String HelloLog()
    {
        System.out.println("Happy Logging");
        return "Happy Logging!";
    }
}
