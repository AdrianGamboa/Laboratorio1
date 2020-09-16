package org.una.tramitesweb.DTO;

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
public class AuthenticationRequest {
@Id
    private String cedula;
    private String password;

}
