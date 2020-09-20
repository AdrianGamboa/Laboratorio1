/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.una.tramitesmunicipales.controllersView;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.una.tramitesmunicipales.WebService.AutenticationWebService;


/**
 * FXML Controller class
 *
 * @author Esteban Vargas
 */
public class LoginController implements Initializable {

    @FXML
    private JFXPasswordField txtContrasena;
    @FXML
    private JFXTextField txtCedula;
    @FXML
    private JFXButton btnIniciaSesion;
    
    AutenticationWebService autenticationWebService;
    String respuesta;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void btnIniciaSesionAction(ActionEvent event) throws IOException 
    {
        try {
            respuesta = AutenticationWebService.login(txtCedula.getText(), txtContrasena.getText());
            if(!"Debe verificar y proporcionar credenciales correctos para realizar esta acción".equals(respuesta) &&
                    !"Debe verifiar el formato y la información de su solicitud con el formato esperado".equals(respuesta)){
               Parent tableViewParent = FXMLLoader.load(getClass().getResource("/org/una/tramitesmunicipales/view/Dashboard.fxml"));
               Scene tableViewScene = new Scene(tableViewParent);
        
               Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
              window.setScene(tableViewScene);
              window.show(); 
        }
            
        } catch (InterruptedException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JsonProcessingException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void start(Stage stage) throws Exception {
      
        
    }
}
