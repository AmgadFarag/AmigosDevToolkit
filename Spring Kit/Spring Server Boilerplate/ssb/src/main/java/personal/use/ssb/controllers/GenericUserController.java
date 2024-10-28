package personal.use.ssb.controllers;

import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import personal.use.ssb.dtos.GenericUserDTO;
import personal.use.ssb.services.IGenericUserService;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@NoArgsConstructor
public class GenericUserController {
    Logger logger = LoggerFactory.getLogger(GenericUserController.class);

    @Autowired
    private IGenericUserService genericUserService;

    // ----------------------------------------------------------------

    @GetMapping("/{id}")
    public ResponseEntity<GenericUserDTO> getUserById(@RequestParam Long id) {
        try {
            return ResponseEntity.ok(genericUserService.getUserById(id));
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping("/all")
    public ResponseEntity<List<GenericUserDTO>> getAllUsers() {
        try {
            return ResponseEntity.ok(genericUserService.getAllUsers());
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw e;
        }
    }

    @PostMapping("/{id}")
    public ResponseEntity<GenericUserDTO> updateUserById(@RequestParam Long id, @RequestBody GenericUserDTO userDTO) {
        try {
            return ResponseEntity.ok(genericUserService.updateUserById(id, userDTO));
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw e;
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<GenericUserDTO> deleteUserById(@RequestParam Long id) {
        try {
            return ResponseEntity.ok(genericUserService.deleteUserById(id));
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw e;
        }
    }

}
