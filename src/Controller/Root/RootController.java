/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controller.Root;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;

/**
 * FXML Controller class
 *
 * @author Sakib
 */
public class RootController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private TextArea textAreaID;
    @FXML
    private void fileOpenHandler(ActionEvent event) throws FileNotFoundException{
        FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showOpenDialog(null);
        
        Scanner sc = new Scanner(file);
        
        String str = "";
        
        while(sc.hasNext()){
        str+=sc.nextLine()+"\n";
        }
        textAreaID.setText(str);
    }
    @FXML
    private void handleClose(){}
    @FXML
    private void fileSaveHandle(ActionEvent event)throws Exception{
    FileChooser fileChooser= new FileChooser();
    File file = fileChooser.showSaveDialog(null);
    
    String str = textAreaID.getText();
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(str);
        fileWriter.close();
    
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
