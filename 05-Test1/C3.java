public class C3 {
    
    

    public static boolean isAlphabet(String str){
        for(int i = 0;i<str.length()-1;i++)         
        if(str.charAt(i) > str.charAt(i+1))
            return false; 
    return true;
    }

    public static String hideText(String str){
        String text="";
        for(int i =0; i<=str.length()-1; i++)
            if(i!=0 && i!=str.length()-1){
                text+='*';
            }
            else{
                text+=str.charAt(i);
            }
            return text;
    }

   

}
