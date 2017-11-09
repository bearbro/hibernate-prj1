package cn.edu.zjut.action;

import cn.edu.zjut.po.Customer;
import cn.edu.zjut.po.ItemDetail;
import cn.edu.zjut.service.ItemService;

import java.util.List;

public class ItemAction{
    private Customer loginUser;


    private List<ItemDetail> items;

    public List<ItemDetail> getItems() {
        return items;
    }

    public void setItems(List<ItemDetail> items) {
        this.items = items;
    }

    public String show() {
        ItemService itemServ = new ItemService();
        items = itemServ.getItems();

        return "itemsuccess";

    }
}
