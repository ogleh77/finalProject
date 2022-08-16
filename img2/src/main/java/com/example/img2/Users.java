package com.example.img2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Users {
    private String name;
    private InputStream image;

    public Users(String name, InputStream image) throws FileNotFoundException {
        this.name = name;

        this.image = image;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InputStream getImage() {
        return image;
    }

    public void setImage(InputStream image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", image=" + image +
                '}';
    }
}
