package org.una.tramitesweb.DTO;

import java.util.Date;
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
public class TransaccionDTO {
 @Id
    private Long id; 
    private Date fechaRegistro; 
    private String Objeto;
    private String Informacion;
    
    
        
}

