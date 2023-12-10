import java.util.ArrayList;

public class Library {
    static ArrayList<Book> products = new ArrayList<Book>();
    public static void main(String[] args) {
        Book b1 = new Book("Harry Potter", "J.K. Rowling");
        Ebook eb1 = new Ebook("The Witcher", "Andrzej Sapkowski", "wiesmin.txt");
        Ebook eb2 = new Ebook("Lalka", "Bolesław Prus", "lalka.txt");
        Audiobook ab1 = new Audiobook("The Witcher", "Andrzej Sapkowski", "Wiedzmin-audio.wav", 124, 18);
        Audiobook ab2 = new Audiobook("Kamienie na szaniec", "Aleksander Kamiński", "kamienienaszaniec.wav", 412, 55);

        products.add(b1);
        products.add(eb1);
        products.add(ab1);
        products.add(eb2);
        products.add(ab2);

        
        
        for(Book i:products){
            System.out.println(i.display());
        }



    }
    
    
}
