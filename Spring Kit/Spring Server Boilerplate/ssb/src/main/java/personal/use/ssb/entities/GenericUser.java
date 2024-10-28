package personal.use.ssb.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class GenericUser extends GenericEntity {

    private String name;

    private Boolean active;

}
