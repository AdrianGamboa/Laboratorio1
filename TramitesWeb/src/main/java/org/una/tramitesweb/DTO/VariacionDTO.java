package org.una.tramitesweb.DTO;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Esteban Vargas
 */
 @Entity
public class VariacionDTO {
    @Id
    private Long id; 
    private String descripcion;   
    private boolean estado; 
    private boolean grupo; 
    private Date fechaRegistro; 
    private Long tramite_tipoId; 
}
