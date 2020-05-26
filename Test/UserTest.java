package Test;
import FinancialStatus.User;

public class UserTest {
    private static User user;

    public void runTest(){
        System.out.println("Running tests for user...");

        int income  = 1000000;
        int savings = 2000000;
        int goal = 3000000;

        user = new User (1000000, 2000000, 3000000, "Traditional");

        System.out.println(user.toString());
        
        if (user.getIncome() == income && user.getSavings() == savings && user.getGoal() == goal){
            System.out.println("Test passed");
        }
        else{
            System.out.println("Test failed");
        }

        System.out.println("Changing goal...");

        int newGoal = 40000000;

        user.setGoal(newGoal);

        if (user.getGoal() == newGoal){
            System.out.println("Test passed");
        }
        else{
            System.out.println("Test failed");
        }
    }
}