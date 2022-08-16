package com.example.imageproject;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private TextField username;
    @FXML
    private ImageView imgView;
    List<Users> users = new ArrayList<>();
    @FXML
    private TextField search;
    @FXML
    private TextField name;

    @FXML
    void searchHdler(ActionEvent event) {
        Image image = new Image(users.get(Integer.parseInt(search.getText())).image());

        imgView.setPreserveRatio(true);
        imgView.imageProperty().setValue(image);
        name.setText(users.get(Integer.parseInt(search.getText())).name());
        System.out.println("Image view " + imgView.getImage());
        System.out.println("Image " + image);

    }

    @FXML
    void loadImage(ActionEvent event) throws Exception {
        FileChooser chooser = new FileChooser();
        File file = chooser.showOpenDialog(username.getScene().getWindow());
        imgView.setImage(new Image(file.getAbsolutePath()));
        setDabase(username.getText(), file);

    }

    @FXML
    void uploadImage(ActionEvent event) throws Exception {

    }

    public void setDabase(String name, File fIle) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(fIle);
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost/img", "postgres", "1234");
        System.out.println("seccufully connected.....");
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users VALUES(?,?)");
        preparedStatement.setString(1, name);
        preparedStatement.setBinaryStream(2, fileInputStream, fileInputStream.available());
        preparedStatement.execute();
        System.out.println("Saved....");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost/img", "postgres", "1234");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users");
            while (resultSet.next()) {
                InputStream inputStream = resultSet.getBinaryStream(2);
                users.add(new Users(resultSet.getString(1), inputStream));

            }
            imgView.setImage(new Image(users.get(0).image()));

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}