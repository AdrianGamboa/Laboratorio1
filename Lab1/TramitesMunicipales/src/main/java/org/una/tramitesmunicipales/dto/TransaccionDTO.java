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
public class TransaccionDTO {
 
    private Long id; 
    private Date fechaRegistro; 
    private String Objeto;
    private String Informacion; 
}

