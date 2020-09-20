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
public class UsuarioDTO {
 
    private Long id; 
    private String nombreCompleto;   
    private String cedula; 
    private boolean estado; 
    private Date fechaRegistro; 
    private Date fechaModificacion; 
    private Long departamentoId; 
    private boolean esJefe; 
}
