package cn.edu.zjut.po;


public class ItemBasic {
    private String itemID;
    private String title;
    private String description;
    private Double cost;

    public ItemBasic() {
    }

    public ItemBasic(String itemID) {
        this.itemID = itemID;
    }

    public ItemBasic(String itemID, String title, String description, Double cost) {
        this.itemID = itemID;
        this.title = title;
        this.description = description;
        this.cost = cost;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID= itemID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

}
