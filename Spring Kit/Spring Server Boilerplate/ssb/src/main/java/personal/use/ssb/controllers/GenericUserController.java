package personal.use.ssb.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import personal.use.ssb.services.IGenericUserService;

@RestController("api/")
public class GenericUserController {
    Logger logger = LoggerFactory.getLogger(GenericUserController.class);

    private final IGenericUserService genericUserService;

    public GenericUserController(IGenericUserService service) {
        this.genericUserService = service;
    }

}
