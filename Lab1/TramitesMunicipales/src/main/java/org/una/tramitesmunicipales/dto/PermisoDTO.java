package org.una.tramitesmunicipales.dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author adria
 */
@Data
@AllArgsConstructor
@NoArgsConstructor 
@ToString
public class PermisoDTO {
 
    private Long id; 
    private String Codigo;
    private String Descripcion;
    private Date fechaRegistro;
    private Date fechaModificacion;
    private boolean estado;
}

