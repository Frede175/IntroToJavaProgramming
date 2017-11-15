/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fred.monopoly;

import fred.monopoly.business.Monopoly;
import fred.monopoly.business.Monopoly;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author fsr19
 */
public class Start extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        
        Monopoly game = Monopoly.getInstance();
        game.init(2, 2);
        
        Parent root = FXMLLoader.load(getClass().getResource("gui/fxml/Simple.fxml"));
        
        Scene scene = new Scene(root);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
