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
public class RequisitoPresentadoDTO {
 
    private Long id; 
    private Date fechaRegistro; 
}
