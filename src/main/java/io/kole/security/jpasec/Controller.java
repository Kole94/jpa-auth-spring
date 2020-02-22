package io.kole.security.jpasec;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/admin")
    public String controller() {
        return "admin!";
    }

    @GetMapping("/abc")
    public String abc() {
        return "abc!";
    }

    @GetMapping("/www")
    public String www() {
        return "<h1>www</h1>!";
    }

    @GetMapping("/user")
    public String user() {
        return ("Welcome User");
    }

    @GetMapping("/")
    public String start(){
        return "Hello World!";
    }
}
