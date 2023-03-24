package ru.palyanaff.androidmirea4;

public class OrderItem {
    private int image;
    private String header;
    private String description;
    private String cost;

    public OrderItem(int image, String header, String description, String cost) {
        this.image = image;
        this.header = header;
        this.description = description;
        this.cost = cost;
    }

    public int getImage() {
        return image;
    }

    public String getHeader() {
        return header;
    }

    public String getDescription() {
        return description;
    }

    public String getCost() {
        return cost;
    }
}
