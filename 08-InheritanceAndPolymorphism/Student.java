public class Student extends Person{
    private String ocena = "3.0";
    public void ocena(){
        System.out.println(ocena);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name();
        s1.ocena();
    }
}
