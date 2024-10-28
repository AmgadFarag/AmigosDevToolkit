package personal.use.ssb.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import personal.use.ssb.entities.RoleType;

@Data
@NoArgsConstructor
public class GenericUserDTO extends GenericEntityDTO {

    private String firstName;

    private String lastName;

    private Boolean active;

    private String username;

    private String passwordEncrypt;

    private RoleType role;

}
