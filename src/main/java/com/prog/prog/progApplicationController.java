package com.prog.prog;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller

public class progApplicationController {

    @GetMapping("/home")
    public String home() {
        return "/testFolder/integrativeTest.html";
    }
    
}
