public class Writer {
    private String name;
    private String surname;
    

    public Writer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    

    @Override
    public String toString() {
        return "Writer [name=" + name + ", surname=" + surname + "]";
    }



    public static void main(String[] args) {
        Writer w1 = new Writer("John", "Kowalsky");
        Book b1 = new Book("abc", w1);
        System.out.println(b1.toString());

    }

    
    
}
