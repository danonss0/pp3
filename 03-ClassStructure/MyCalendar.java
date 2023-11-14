public class MyCalendar {
    static int year = 2023;
    static int month = 4;
    static int day = 9;

    static String myDate(){
        if(month>=10 && day>=10){
        String dat = Integer.toString(year)+"-"+Integer.toString(month)+"-"+Integer.toString(day);
        return dat;
        }
        else if(month>=10 && day<10){
        String dat = Integer.toString(year)+"-"+Integer.toString(month)+"-0"+Integer.toString(day);
        return dat;
        }
        else if (month<10 && day>=10){
            String dat = Integer.toString(year)+"-0"+Integer.toString(month)+"-"+Integer.toString(day);
            return dat;
        }
        else{
            String dat = Integer.toString(year)+"-0"+Integer.toString(month)+"-0"+Integer.toString(day);
            return dat;
        }
    }
    static int days(){
        int numDays = 0;
    
        int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};

        for(int i =0; i<month-1;i++){
            numDays += monthDays[i];
        }
        numDays+=day;
        return numDays;
    }
    static String monthName(){
        String[] mname = {"Styczen","Luty","Marzec","Kwiecien","Maj","Czerwiec","Lipiec","Sierpien","Wrzesien","Pazdziernik","Listopad","Grudzien"};
        return mname[month-1];
    }    
    
    public static void main(String[] args) {
        System.out.println("Date: "+myDate()+"\nDays from the beginning of year: "+days()+"\nMonth name (in Polish): "+monthName());
    }
}
