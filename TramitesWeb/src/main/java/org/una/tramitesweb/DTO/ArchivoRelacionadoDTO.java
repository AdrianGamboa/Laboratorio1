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
 */@Entity
public class ArchivoRelacionadoDTO {
    @Id
    private Long id;
    private String nombre;   
    private String etiquetas;
    private String ruta_Archivo;
    private Boolean estado;
    private Boolean tipo;
    private Date fechaRegistro; 
    private Date fechaModificacion; 
}
