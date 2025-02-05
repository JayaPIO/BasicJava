package Day4;
import java.util.*;

// Generics

class ShoppingCart<T>{
    private List<T> items =new ArrayList<>();

    // add items to cart
    public void addItems(T item){
        items.add(item);
    }

    // get items from cart
    public List<T> getItems(){
        return items;
    }
}
class Book{
    private String title;
    private int price;

     public Book(String title, int price ){
         this.title = title;
         this.price = price;
     }

     // get Book
    public String toString(){
         return "Book { title= " + title+ "price= "+price+ '}';
    }

}
class Electronics {
    private String name;
    private int price;

    public Electronics(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String toString(){
        return "Electronic Item{ name: "+name+" price: "+price+"}";
    }
}

public class Shopping {
    public static void main(String[] args){
        // shopping cart for Book
        ShoppingCart<Book> bookCart = new ShoppingCart<>();
        bookCart.addItems(new Book("Java Programming ",400));
        bookCart.addItems(new Book("Cpp programming ",500));

        System.out.println("Books in cart "+bookCart.getItems());

        // shopping cart for electronic
        ShoppingCart<Electronics> electronicCart = new ShoppingCart<>();
        electronicCart.addItems(new Electronics("SmartPhone",3000));
        electronicCart.addItems(new Electronics("Laptop",45000));

        System.out.println("Electronic items in cart "+electronicCart.getItems());
    }
}
