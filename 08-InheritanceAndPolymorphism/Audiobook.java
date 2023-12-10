public class Audiobook extends Ebook{
    private int minutes, seconds;

    public Audiobook(String title, String author, String filename, int minutes, int seconds) {
        super(title, author, filename);
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    public String display(){
        return "Title: "+getTitle()+"\nAuthor: "+getAuthor()+"\nFilename: "+getFilename()+"\nAudio book duration: "+minutes+" minutes, "+seconds+" seconds\n";
    }

    public static void main(String[] args) {
        Book b1 = new Book("Harry Potter", "J.K. Rowling");
        Ebook eb1 = new Ebook("The Witcher", "Andrzej Sapkowski", "wiesmin.txt");
        Audiobook ab1 = new Audiobook("The Witcher", "Andrzej Sapkowski", "Wiedzmin-audio.wav", 124, 18);
        System.out.println(ab1.display());
        System.out.println(b1.display());
        System.out.println(eb1.display());
    }
}
