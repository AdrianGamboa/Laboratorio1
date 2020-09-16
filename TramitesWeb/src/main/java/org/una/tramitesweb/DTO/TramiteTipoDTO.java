package org.una.tramitesweb.DTO;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
public class TramiteTipoDTO {
 @Id
    private Long id; 
    private String descripcion;   
    private boolean estado; 
    private Long departamentoId; 
    private Date fechaRegistro; 
    private Date fechaModificacion; 
}
