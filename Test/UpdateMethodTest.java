package Test;
import FinancialStatus.User;
import BudgetingPlan.Budget;

public class UpdateMethodTest {
    private static User user;
    private static Budget budget;
    public void runTest(){
        System.out.println("Running test to update Method in User...");
        System.out.println("Starting with frugal method...");

        int income = 10000000;
        int savings = 25000000;
        int goal = 150000000;
        String method = "Frugal";

        user = new User(income, savings, goal, method);
        user.calculateBudget();

        int expectedSave = 500000;
        int expectedInvest = 6000000;
        int expectedWants = 1000000;
        int expectedNeeds = 2500000;

        budget = user.getBudget();

        if (expectedSave == budget.getSave() && expectedInvest == budget.getInvest() && expectedWants == budget.getWants() && expectedNeeds == budget.getNeeds()){
            System.out.println("Test passed");
        }
        else{
            System.out.println("Test failed");
        }

        System.out.println("Changing to Traditional Method...");

        user.setMethod("Traditional");

        expectedSave = 250000;
        expectedInvest = 250000;
        expectedWants = 4000000;
        expectedNeeds = 5500000;

        budget = user.getBudget();

        if (expectedSave == budget.getSave() && expectedInvest == budget.getInvest() && expectedWants == budget.getWants() && expectedNeeds == budget.getNeeds()){
            System.out.println("Test passed");
        }
        else{
            System.out.println("Test failed");
        }
    }
}