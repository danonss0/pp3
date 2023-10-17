public class zad22 {
    public static void main(String[] args) {
        int speed = 128;
        boolean check;
        if (speed >= 40 && speed <= 140) {
            check = true;
        }
        else{
            check = false;
        }
        System.out.println("Vechicle speed: "+speed+"\nSpeed is valid: "+check);
    }
}
