public class zad29 {
    int count = 0;

    public void p10(){
        count+=10;
    }
     public void p1(){
        count+=1;
    }
     public void m10(){
        count+=-10;
    }
     public void m1(){
        count+=-1;
    }
     public void show(){
        System.out.println(count);
    }
    
    public static void main(String[] args) {
        zad29 counter1 = new zad29();
        zad29 counter2 = new zad29();
        counter1.p10();
        counter1.p10();
        counter1.p1();
        counter1.p1();
        counter1.p1();
        counter1.show();

       
        counter2.m10();
        counter2.m10();
        counter2.m10();
        counter2.m10();
        counter2.m10();
        counter2.p1();
        counter2.p1();
        counter2.p1();
        counter2.show();
    

    }

}
