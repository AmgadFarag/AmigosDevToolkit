package personal.use.ssb.services.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import personal.use.ssb.dtos.GenericUserDTO;
import personal.use.ssb.services.IGenericUserService;

import java.util.List;

public class GenericUserService implements IGenericUserService {
    Logger logger = LoggerFactory.getLogger(GenericUserService.class);

    // ----------------------------------------------------------------

    @Override
    public GenericUserDTO getUserById(Long id) {
        // TODO implement this method
        return null;
    }

    @Override
    public List<GenericUserDTO> getAllUsers() {
        // TODO implement this method
        return List.of();
    }

    @Override
    public GenericUserDTO updateUserById(Long id, GenericUserDTO userDTO) {
        // TODO implement this method
        return null;
    }

    @Override
    public GenericUserDTO deleteUserById(Long id) {
        // TODO implement this method
        return null;
    }
}
