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
public class ClienteDTO {
 @Id
    private Long id; 
    private String nombreCompleto;   
    private String cedula; 
    private String telefono; 
    private String direccion; 
    private Date fechaRegistro; 
    private Date fechaModificacion; 
    private boolean estado; 
}

