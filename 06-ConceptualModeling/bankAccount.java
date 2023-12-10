public class bankAccount {
    private String number;
    private String owner;
    private String password;
    private double balance;

    bankAccount(double balance){
        this.balance = balance;
    }
    bankAccount(){
        this.balance = 0;
    }

    public void deposit(double ammount){
        balance+=ammount;

    }
    public String balance(){
        return "Your balance: "+balance;
    }
    public String withdraw(double ammount){
        if(balance>=ammount){
            if(ammount>500){
                return "You can only withdraw 500 at once";
            }
            else{
                balance-=ammount;
                return "a";
            }
        }
        else{
           return "Your balance is to low to withdraw";
        }

    }
    public static void main(String[] args) {
        bankAccount ac1 = new bankAccount();
        ac1.deposit(500);
        System.out.println(ac1.balance());
        ac1.deposit(800);
        System.out.println(ac1.balance());
        ac1.withdraw(200);
        System.out.println(ac1.balance());
        ac1.withdraw(501);
    }

}