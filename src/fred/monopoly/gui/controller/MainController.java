/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fred.monopoly.gui.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author fsr19
 */
public class MainController implements Initializable {

    @FXML
    private Pane boardPane;
    @FXML
    private ImageView monopolyBoard;
    @FXML
    private AnchorPane control;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        monopolyBoard.fitWidthProperty().bind(boardPane.widthProperty());
        monopolyBoard.fitHeightProperty().bind(boardPane.heightProperty());
        
        
    }    
    
}
