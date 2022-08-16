package com.example.img2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HelloController {
    @FXML
    private ImageView imgView;
    private FileInputStream stream;

    @FXML
    void btnHandler(ActionEvent event) throws FileNotFoundException {
        FileChooser chooser = new FileChooser();
        File file = chooser.showOpenDialog(null);
        if (file == null) {
            System.out.println("Canceled...");
            stream = new FileInputStream(new File("C:\\Users\\Mohammed Ogleh\\IdeaProjects\\img2\\src\\main\\resources\\com\\example\\img2\\image\\najm.jpg"));
            imgView.setImage(new Image(stream));
        } else {
            stream = new FileInputStream(file);
            imgView.setImage(new Image(stream));
        }
        Users user = new Users("Mohamed", stream);
        System.out.println(user);
    }


}