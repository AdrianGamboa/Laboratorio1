/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.una.tramitesmunicipales.controllersView;


import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


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
            FXMLLoader loader = new FXMLLoader(getClass().getResource("org/una/tramitesmunicipales/view/Dashboard.fxml")); 
            Parent root = loader.load();
  
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Menu principal");
            stage.show();
            } catch (IOException ex) 
            {System.err.println(ex);}
            
             //Cierra la ventana actual
             Node source = (Node) event.getSource();
             Stage stage = (Stage) source.getScene().getWindow();
             stage.close();
        
    }
    
    public void start(Stage stage) throws Exception {
      
        
    }
}
