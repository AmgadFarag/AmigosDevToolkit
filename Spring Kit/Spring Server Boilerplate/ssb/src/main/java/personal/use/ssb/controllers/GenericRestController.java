package personal.use.ssb.controllers;

//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("api/")
public class GenericRestController {
    Logger logger = LoggerFactory.getLogger(GenericRestController.class);

    @GetMapping("/")
    public ResponseEntity<String> initCall() {
        return ResponseEntity.ok("Hello World");
    }
}
