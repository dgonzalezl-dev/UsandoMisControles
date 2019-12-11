/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usandomiscontroles;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import di_t3a3.MiControl;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

/**
 *
 * @author Usuario
 */
public class UsandoMisControles extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        BorderPane spane=new BorderPane();
        Label et=new Label("");
        MiControl mc=new MiControl(); 
        spane.setCenter(mc);
        
        mc.setMaxHeight(100);
        mc.setMaxWidth(100);
        
        mc.setOnAction(e->{
            et.setText("Has pulsado un cuadrado");
        });
        spane.setBottom(et);
        
        Scene scene = new Scene(spane,400,400);
        
        primaryStage.setTitle("Rectangle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
