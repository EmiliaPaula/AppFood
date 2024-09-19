package com.example.appfood.Domain;

public class CategoryDomain {
    private String ImagePath;
    private String Name;
    private String Id;

    public CategoryDomain(){

    }

    @Override
    public String toString() {
        return Name;
    }

    public String getImagePath() {
        return ImagePath;
    }

    public void setImagePath(String imagePath) {
        ImagePath = imagePath;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }
}
