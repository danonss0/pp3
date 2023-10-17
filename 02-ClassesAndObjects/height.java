public class height {
    public static void main(String[] args) {
        int wzrost = 170;
        double ft = wzrost/30.48;
        int b = (int)ft;
        double c = Math.round((ft-b)*12);
        System.out.println("I am "+wzrost+"cm tall, i.e. "+b+" feet and "+(int)c+" inches.");
    }
    
}
