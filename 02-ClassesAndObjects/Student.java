public class Student {
    String name;
    int age;
    int id_card;
    boolean card_valid;
    int semester;
    double average_grade;

    public void sayHello(){
        System.out.println("Hello from "+name);
}
    public void displayName(){
        System.out.println(name);
    }
    public void displayAge(){
        System.out.println(age);

}
    public void displayStudent(){
        System.out.println(name+" "+semester+" "+average_grade);
    }
    public void changeIdStatus(){
        card_valid = false;
    }
}
