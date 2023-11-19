package com.example.train;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.*;

public class Register {

    public TextField username;
    public PasswordField password;
    private Parent root;
    private Scene scene;
    private Stage stage;

    @FXML
    public void onRegistrationClick(ActionEvent e) throws Exception {
        String userName = username.getText();
        String Password = password.getText();
        File file = new File("C:\\Users\\pream\\Desktop\\userInfo.txt");
        FileWriter fw = new FileWriter(file, true); // append mode
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(userName + "&" + Password + "\n");
        System.out.println("Registration Done");
        bw.close();

        // Switch back to the login scene
        root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void switchToLog(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}

