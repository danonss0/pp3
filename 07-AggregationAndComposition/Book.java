public class Book{
    private String title;
    private Writer author;
    
    

    public Book(String title, Writer author) {
        this.title = title;
        this.author = author;
    }

    

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + "]";
    }



    public static void main(String[] args) {
        
    }
    
}