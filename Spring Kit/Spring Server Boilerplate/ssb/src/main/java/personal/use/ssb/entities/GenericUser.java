package personal.use.ssb.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class GenericUser extends GenericEntity {

    private String firstName;

    private String lastName;

    private Boolean active;

    private String username;

    private String passwordEncrypt;

    private RoleType role;

}
