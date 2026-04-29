
//import java.util.concurrent.CancellationException;

public class exception {
    public static void main(String[] args) {
        bankAccount account = new bankAccount();
        //validAgeException ageCheck = new validAgeException();
        try {
            account.withdraw(122200);
        } catch (customException e) {
            System.out.println(e.getMessage());
        }
        try {
            checkAge ageCheck = new checkAge();
            ageCheck.checkAgeLimit(163);
            //System.out.println("Age is valid for candidate");
        } catch (validAgeException e) {
            System.out.println("Age is not valid for candidate");
        }
    }
}
