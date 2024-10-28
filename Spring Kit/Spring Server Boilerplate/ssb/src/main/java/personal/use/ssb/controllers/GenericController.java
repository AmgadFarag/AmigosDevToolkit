package personal.use.ssb.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import personal.use.ssb.services.IGenericService;

@RestController("api/")
public abstract class GenericController {
    Logger logger = LoggerFactory.getLogger(GenericController.class);

    private final IGenericService genericService;

    public GenericController(IGenericService service) {
        this.genericService = service;
    }

    // ----------------------------------------------------------------

    @GetMapping("/")
    public ResponseEntity<String> initCall() {
        return ResponseEntity.ok("Hello World");
    }
}
