package personal.use.ssb.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
public class GenericEntityDTO {

    private Long id;

    private Date creationDate;

    private Date modificationDate;
}
