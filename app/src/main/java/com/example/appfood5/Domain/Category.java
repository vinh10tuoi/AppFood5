package com.example.appfood5.Domain;

public class Category {

    private int id;
    private String ImagePath;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImagePath() {
        return ImagePath;
    }

    public void setImagePath(String imagePath) {
        this.ImagePath = imagePath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category() {
    }

    public Category(int id, String ImagePath, String name ) {
        this.id = id;
        this.ImagePath = ImagePath;
        this.name = name;
    }
}
