package org.una.tramitesweb.DTO;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author adria
 */
@Entity
public class TramiteRegistradoDTO {
 @Id
    private Long id; 
    private Long clienteId; 
     
}
