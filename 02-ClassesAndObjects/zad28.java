public class zad28 {
    
    
    int x;
    int y;

    

    public void show(){
        System.out.println("Bok x: "+x+"\nBok y: "+y+"\nPole: "+x*y+"\n");
    }


    public static void main(String[] args) {
    
    zad28 x1 = new zad28();
    zad28 x2 = new zad28();
    x1.x=3;
    x1.y=4;
    x2.x=2;
    x2.y=7;
    x1.show();
    x2.show();
    
    }
}
