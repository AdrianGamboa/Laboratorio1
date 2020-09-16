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
 * @author Esteban Vargas
 */
@Entity
public class NotaDTO {
    @Id
    private Long id;
    private String titulo;   
    private String contenido;
    private Boolean estado;
    private Boolean tipo;
    private Date fechaRegistro; 
    private Date fechaModificacion;
}
