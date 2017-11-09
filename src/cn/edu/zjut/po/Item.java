package cn.edu.zjut.po;

import java.sql.Blob;

public class Item {
    private ItemPK iPK;
    private String description;
    private Double cost;
    private Blob image;

    public String getItemID() {
        return iPK.getItemID();
    }

    public void setItemID(String itemID) {
        iPK.setItemID(itemID);
    }

    public ItemPK getiPK() {
        return iPK;
    }

    public void setiPK(ItemPK iPK) {
        this.iPK = iPK;
    }

    public String getTitle() {
        return iPK.getTitle();
    }

    public void setTitle(String title) {
        iPK.setTitle(title);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }

}
