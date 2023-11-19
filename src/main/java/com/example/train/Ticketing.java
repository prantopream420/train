package com.example.train;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Ticketing {
    public ComboBox<String> destination;
    public ComboBox<String> time;
    public ComboBox<String> train;
    private Parent root;
    private Scene scene;
    private Stage stage;
    @FXML
    public void initialize() {
        // Initialize the ComboBox items
        this.destination = new ComboBox<>(); // Initialize the destination field explicitly
        this.destination.getItems().addAll("Route 1", "Route 2");
        this.time.getItems().addAll("Morning", "Afternoon", "Evening");
        this.train.getItems().addAll("Train 1", "Train 2", "Train 3", "Train 4");
    }

    @FXML
    public void onBookClick(javafx.event.ActionEvent e) throws IOException {
        String selectedDestination = destination.getValue();
        String selectedTime = time.getValue();
        String selectedTrain = train.getValue();
        File file = new File("C:\\Users\\pream\\Desktop\\userInfo.txt");
        FileWriter fw = new FileWriter(file, true); // append mode
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(selectedDestination + "&" + selectedTime + "&" + selectedTrain + "\n");
        bw.close();
        System.out.println("Ticket booked successfully");
        // Switch back to the login scene
        root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}


