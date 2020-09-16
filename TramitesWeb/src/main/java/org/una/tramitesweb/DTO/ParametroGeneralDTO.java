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
public class ParametroGeneralDTO {
@Id
    private Long id;
    private String nombre;   
    private String valor;
    private String descripcion;   
    private Date fechaRegistro; 
    private Date fechaModificacion; 
}
