package Week3Day2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class Book{
    private String bookName;
    private String authorName;

    Book(String bookName, String authorName){
        this.bookName = bookName;
        this.authorName = authorName;
    }
    public String getBookName(){
        return this.bookName;
    }
    public String getAuthorName(){
        return this.authorName;
    }
    public String toString(){
        return bookName+" by "+ authorName;
    }
}
class BookLibrary{
    ArrayList<Book> books;
    BookLibrary(){
        books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void displayBooks(){
        for (Book book:books){
            System.out.println(book);
        }
        System.out.println();
    }

    public boolean containsBook(Book book){
        return books.contains(book);
    }

    //compartor with function
    public void sortBooksByTile(){
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getBookName().compareTo(o2.getBookName());
            }
        });
    }
    // comparator with method reference
    public void sortBooksByTitle(){
        Collections.sort(books, Comparator.comparing(Book::getBookName));
    }

    // clear library
    public void clearLibrary(){
        books.clear();
    }

    public int numberOfBooks(){
        return books.size();
    }
    // get book by index
    public Book getBookByIndex(int index){
        return books.get(index);
    }

    //set book at index
    public void setBookAtIndex(int index, Book book){
        books.set(index,book);
    }

    // add book at index
    public void addBookAtIndex(int index, Book book){
        books.add(index,book);
    }

    // get index of book
    public int indexOfBook(Book book){
        return books.indexOf(book);
    }

    // check if library is empty
    public boolean isEmpty(){
        return books.isEmpty();
    }
}
public class ArrayListLibrary {
    public static void main(String[] args){

        BookLibrary library= new BookLibrary();

        Book book = new Book("Hold my hand","Durjoy dutta");
        // add books to the library
        library.addBook(new Book("secret garden", "F H burnett"));
        library.addBook(book);
        library.addBook(new Book("Turning points", "APJ Abdul Kalam"));
        library.addBook(new Book("Pride and Prejudice","Jane Austen"));

        // display books
        library.displayBooks();
        System.out.println();



        // sorting books based on book name
        library.sortBooksByTile();

        library.displayBooks();

        // number of books present in library
        System.out.println("number of books present in library "+library.numberOfBooks());

        // contains
        System.out.println(library.containsBook(book));

        // get books by index
        System.out.println(library.getBookByIndex(2));
        System.out.println();

        // set book at index
        library.setBookAtIndex(3,new Book("Men without Women","Murakami"));
        library.displayBooks();

        // add book at index
        library.addBookAtIndex(1,new Book("secret garden", "F H burnett"));
        library.displayBooks();

        // index of book
        int index = library.indexOfBook(book);
        System.out.println(index);

        // clear library
        library.clearLibrary();
        System.out.println(library.isEmpty());

    }
}
