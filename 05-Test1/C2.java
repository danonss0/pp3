public class C2 {
    private int count = 0;

    public void increase(){
        count+=1;
    }

    public void increase(int n){
        count+=n;
    }

    public void decrease(){
        count+=-1;
    }

     public void decrease(int n){
        count=count-n;
    }

    public int value(){
        return count;
    }
    

}
