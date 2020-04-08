package Controller;

import org.springframework.web.bind.annotation.GetMapping;

public interface loginterface {
    @GetMapping("/log")
    public String HelloLog();
}
