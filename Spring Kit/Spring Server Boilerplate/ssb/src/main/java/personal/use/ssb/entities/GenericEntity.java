package personal.use.ssb.entities;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class GenericEntity implements Serializable {

    @Id
    private Long id;

    private Date creationDate;

    private Date modificationDate;

}