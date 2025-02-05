package Day4;
// Enum
import java.awt.print.Book;

public enum BookGenre {
    BIOGRAPHY(12),
    HORROR(16);
    private int minAgeToRead;
    private BookGenre(int minAgeToRead){
        this.minAgeToRead = minAgeToRead;
    }
    public int getMinAgeToRead(){
        return minAgeToRead;
    }

    public static void main(String[] args){

        for (BookGenre bookGenre : BookGenre.values()){
            System.out.print("To string: " + bookGenre.toString());
            System.out.print(", name: "+bookGenre.name());
            System.out.print(", ordinal: " +bookGenre.ordinal());
            System.out.print(", Declaring class: " + bookGenre.getDeclaringClass());
            System.out.print(", compareTo horror: "+ bookGenre.compareTo(BookGenre.HORROR));
            System.out.print(", equals horror: " + bookGenre.equals(BookGenre.HORROR));
            System.out.println();

            System.out.println(bookGenre.getMinAgeToRead());
        }
    }
}
