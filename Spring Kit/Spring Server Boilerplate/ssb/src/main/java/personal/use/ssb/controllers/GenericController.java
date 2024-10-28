package personal.use.ssb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import personal.use.ssb.services.IGenericService;

@Controller
public abstract class GenericController {

    private final IGenericService genericService;

    public GenericController(IGenericService service) {
        this.genericService = service;
    }

}
