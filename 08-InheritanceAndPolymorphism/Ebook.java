public class Ebook extends Book{
    private String filename;

    public Ebook(String title, String author, String filename) {
        super(title, author);
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
    
    public String display(){
        return "Title: "+getTitle()+"\nAuthor: "+getAuthor()+"\nFilename: "+filename+"\n";

    }
    public static void main(String[] args) {
        Ebook eb1 = new Ebook("The Witcher", "Andrzej Sapkowski", "wiesmin.txt");
        Book b1 = new Book("Harry Potter", "J.K. Rowling");
        
        
        System.out.println(eb1.display());
        System.out.println(b1.display());
        
    }
    
}
