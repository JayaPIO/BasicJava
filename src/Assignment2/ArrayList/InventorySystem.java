package Assignment2.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Item{
    private int itemId;
    private String name;
    private int quantity;
    private int price;

    Item(int itemId,String name, int quantity, int price){
        this.itemId = itemId;
        this.name = name;
        this.quantity=quantity;
        this.price = price;
    }

    Item(String name, int quantity, int price ){
        this.name = name;
        this.quantity=quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Item getItem(String itemName){
        if (name.equals(itemName)){
            return this;
        }
        return null;
    }
    public Item getItemById(int id){
        if (itemId == id){
            return this;
        }
        return null;
    }

    public int getItemId(){
        return itemId;
    }

    public String toString(){
        return name +" "+ quantity+" "+price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
public class InventorySystem {
    private List<Item> stationary;
    InventorySystem(){
        stationary = new ArrayList<>();
    }

    public List<Item> getStationary() {
        return stationary;
    }

    public void setStationary(List<Item> stationary) {
        this.stationary = stationary;
    }

    public void addItem(Item item){
        stationary.add(item);
    }
    public void removeitem(String itemName){
        for (Item item: stationary){
            if (item.getName().equals(itemName)){
                Item removeingItem = item.getItem(itemName);
                stationary.remove(removeingItem);
            }
        }
    }

    public void updateItemQuantity(int id, int updatedQuantity){
        for (Item item: stationary){
            if (item.getItemId() == id){
                Item updatingItem = item.getItemById(id);
                updatingItem.setQuantity(updatedQuantity);
                break;
            }
        }


    }



    public static void main(String[] args){

//        System.out.println("Enter no. of items to be entered: ");
//        Scanner sc = new Scanner(System.in);
//
//        int noOfItems = sc.nextInt();
//
//        for(int i=0;i<noOfItems;i++){
//            System.out.println("enter item name: ");
//            String itemName = sc.nextLine();
//
//            System.out.println("enter item quantity: ");
//            int quantity = sc.nextInt();
//
//            System.out.println("enter price");
//            int price = sc.nextInt();
//
//            addItem(new Item(itemName,quantity,price));
//        }
//        System.out.println("enter item you want to remove: ");
//        int itemName = sc. nextInt();
//        int indexOfItem = stationary.indexOf();
//        removeitem(item);

        InventorySystem inventorySystem = new InventorySystem();
        Item item1 = new Item(1,"pen",10,100);
        Item item2 = new Item(2,"pencil",11,100);
        inventorySystem.addItem(item1);
        inventorySystem.addItem(item2);
        inventorySystem.removeitem("pen");
        System.out.println(inventorySystem.stationary);

        inventorySystem.updateItemQuantity(2,1000);
        System.out.println(inventorySystem.stationary);



    }
}
