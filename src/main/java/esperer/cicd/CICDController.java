package esperer.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CICDController {

    @GetMapping
    public String hello() {
        return "Hello World";
    }
}
