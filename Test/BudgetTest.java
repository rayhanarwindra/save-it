package Test;
import BudgetingMethods.*;
import BudgetingPlan.Budget;

public class BudgetTest {
    private Method method;
    private Budget budget;
    private int expectedSave;
    private int expectedInvest;
    private int expectedWants;
    private int expectedNeeds;

    public void runTest(){
        System.out.println("Running tests for budget...");
        traditionalMethodTest();
        minimalistMethodTest();
        frugalMethodTest();
    }

    public void traditionalMethodTest(){
        System.out.println("Running test with traditional method...");
        method = new TraditionalMethod();

        expectedSave = 250000;
        expectedInvest = 250000;
        expectedWants = 4000000;
        expectedNeeds = 5500000;

        budget = method.calculateBudget(10000000);

        System.out.println(budget.toString());

        if (expectedSave == budget.getSave() && expectedInvest == budget.getInvest() && expectedWants == budget.getWants() && expectedNeeds == budget.getNeeds()){
            System.out.println("Test passed");
        }
        else{
            System.out.println("Test failed");
        }
    }

    public void minimalistMethodTest(){
        System.out.println("Running test with minimalist method...");
        method = new MinimalistMethod();

        expectedSave = 500000;
        expectedInvest = 1000000;
        expectedWants = 3500000;
        expectedNeeds = 5000000;

        budget = method.calculateBudget(10000000);

        System.out.println(budget.toString());

        if (expectedSave == budget.getSave() && expectedInvest == budget.getInvest() && expectedWants == budget.getWants() && expectedNeeds == budget.getNeeds()){
            System.out.println("Test passed");
        }
        else{
            System.out.println("Test failed");
        }
    }

    public void frugalMethodTest(){
        System.out.println("Running test with frugal method...");
        method = new FrugalMethod();

        expectedSave = 500000;
        expectedInvest = 6000000;
        expectedWants = 1000000;
        expectedNeeds = 2500000;

        budget = method.calculateBudget(10000000);

        System.out.println(budget.toString());

        if (expectedSave == budget.getSave() && expectedInvest == budget.getInvest() && expectedWants == budget.getWants() && expectedNeeds == budget.getNeeds()){
            System.out.println("Test passed");
        }
        else{
            System.out.println("Test failed");
        }
    }
}