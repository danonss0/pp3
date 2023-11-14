public class C4 {
    public static int even(int[] array){
        int count =0;
        for(int i =0; i<=array.length-1;i++){
            if(array[i]%2==0){
                count+=1;
            }
        }
    return count;
    }

    public static int positiveOdd(int[] array){
        int count =0;
        for(int i =0; i<=array.length-1;i++){
            if(array[i]%2!=0 && array[i]>0){
                count+=1;
            }
        }
    return count;
    }
    
}
