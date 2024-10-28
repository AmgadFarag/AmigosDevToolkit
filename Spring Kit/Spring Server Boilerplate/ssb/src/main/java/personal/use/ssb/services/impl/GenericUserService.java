package personal.use.ssb.services.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import personal.use.ssb.controllers.GenericUserController;
import personal.use.ssb.dtos.GenericUserDTO;
import personal.use.ssb.services.IGenericUserService;

public class GenericUserService implements IGenericUserService {
    Logger logger = LoggerFactory.getLogger(GenericUserService.class);

    // ----------------------------------------------------------------

    @Override
    public GenericUserDTO getUserById(Long id) {
        // TODO implement this method
        return null;
    }
}
