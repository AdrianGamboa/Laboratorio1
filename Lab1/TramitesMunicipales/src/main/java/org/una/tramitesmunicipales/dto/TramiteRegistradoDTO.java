package org.una.tramitesmunicipales.dto;

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
public class TramiteRegistradoDTO {
 
    private Long id; 
    private Long tramiteTipoId;
    private Long clienteId;
}
