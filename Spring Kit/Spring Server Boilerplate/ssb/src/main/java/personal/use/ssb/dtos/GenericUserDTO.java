package personal.use.ssb.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GenericUserDTO extends GenericEntityDTO {

    private String name;

    private Boolean active;
}
