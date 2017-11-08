package cn.edu.zjut.action;

import cn.edu.zjut.po.Customer;
import cn.edu.zjut.po.Item;
import cn.edu.zjut.service.ItemService;

import java.util.List;

public class ItemAction{
    private Customer loginUser;


    private List<Item> items;

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public String show() {
        ItemService itemServ = new ItemService();
        items = itemServ.getItems();

        return "itemsuccess";

    }
}
