/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fred.monopoly.gui.controller;

import fred.monopoly.business.Player;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author fsr19
 */
public class PlayerController implements Initializable {

    @FXML
    private Label playerName;
    @FXML
    private Label playerMoney;
    

    
    private Player currentPlayer;
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }
    
    
    public void displayPlayer(Player player) {
        currentPlayer = player;
        playerName.setText(currentPlayer.getName());
        playerMoney.setText(currentPlayer.getMoney() + "");
        
        
    }

    @FXML
    private void Test(ActionEvent event) {
    }
    
}
