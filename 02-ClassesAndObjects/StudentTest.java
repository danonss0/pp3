public class StudentTest {    
    public static void main(String[] args) {
        
        // object creation
        Student s1 = new Student();
        Student s2 = new Student();
        
        // object manipulation
        s1.name = "Łukasz";
        s1.age = 21;
        s1.id_card = 227779;
        s1.card_valid = true;
        s1.semester = 3;
        s1.average_grade = 3.85;
        s1.sayHello();
        s1.displayName();
        s1.displayAge();
        s2.name = "Peter";
        s2.age = 27;
        s2.sayHello();
        s2.displayName();
        s2.displayAge();
        System.out.println(s1.name + " " + s1.age);
    }
    
}
