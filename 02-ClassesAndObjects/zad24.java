

public class zad24 {
    public static void main(String[] args) {
        int hours = 0;
        int minutes = 2;
        System.out.println("hours = "+hours+"\nminutes = "+minutes);
        System.out.printf("time: %d:%d",hours,minutes);
        System.out.println("\nminutes from midnight: "+((hours*60)+minutes));
        System.out.println("seconds from midnight: "+((hours*60)+minutes)*60);
    }
}
