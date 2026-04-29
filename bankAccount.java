public class bankAccount {

    private double balance = 10000;

    public void withdraw (double amount) throws customException{
        if(amount> balance){
            throw new customException("amount is greater than balance");
        }

        balance-= amount;
        System.out.println("withdrawn successfully. New balance: " + balance);
    }
}