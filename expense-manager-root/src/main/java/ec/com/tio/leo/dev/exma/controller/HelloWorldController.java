package ec.com.tio.leo.dev.exma.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/public")
public class HelloWorldController {

    @GetMapping("/hello")
    ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("Helloo world");
    }
}
