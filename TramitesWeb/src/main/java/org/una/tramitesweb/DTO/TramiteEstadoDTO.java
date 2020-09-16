package org.una.tramitesweb.DTO;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author acer
 */
@Entity
public class TramiteEstadoDTO {
 @Id
    private Long id; 
    private String nombre;   
    private String descripcion; 
    private String estado_sucesor; 
     
}

