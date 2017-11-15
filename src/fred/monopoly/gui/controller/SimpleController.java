/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fred.monopoly.gui.controller;

import fred.monopoly.business.IBusinessService;
import fred.monopoly.gui.display.ActionMessage;
import java.net.URL;
import java.util.Collections;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

/**
 * FXML Controller class
 *
 * @author fsr19
 */
public class SimpleController implements Initializable {

    @FXML
    private ListView<ActionMessage> output;
    @FXML
    private Label playerName;
    @FXML
    private Label playerMoney;
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    
    
    private ObservableList<ActionMessage> messages;
    
    
    private IBusinessService service;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        messages = javafx.collections.FXCollections.observableArrayList();
        output.setItems(messages);
    }    
    
}
