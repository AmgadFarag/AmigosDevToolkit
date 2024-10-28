package personal.use.ssb.controllers;

import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import personal.use.ssb.services.IGenericService;

@RestController
@RequestMapping("/api")
@NoArgsConstructor
public class GenericController {
    Logger logger = LoggerFactory.getLogger(GenericController.class);

    @Autowired
    private IGenericService genericService;

    // ----------------------------------------------------------------

    @GetMapping("/")
    public ResponseEntity<String> initCall() {
        return ResponseEntity.ok("Hello World");
    }
}
