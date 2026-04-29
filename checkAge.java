public class checkAge {
    int age = 18;

    public void checkAgeLimit(int userAge) throws validAgeException {
        if(userAge<age){
            throw new validAgeException("Age must be at least " + age);
        }
        System.out.println("candidate is eligible");
    }
}
