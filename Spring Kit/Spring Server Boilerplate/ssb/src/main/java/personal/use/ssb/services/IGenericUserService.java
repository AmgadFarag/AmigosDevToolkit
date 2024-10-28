package personal.use.ssb.services;

import personal.use.ssb.dtos.GenericUserDTO;

import java.util.List;

public interface IGenericUserService {

    public GenericUserDTO getUserById(Long id);

    public List<GenericUserDTO> getAllUsers();

    public GenericUserDTO updateUserById(Long id, GenericUserDTO userDTO);

    public GenericUserDTO deleteUserById(Long id);

}
