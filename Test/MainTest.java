package Test;

public class MainTest {
    private static UserTest userTest;
    private static BudgetTest budgetTest;
    private static TimeCalculatorTest timeCalculatorTest;

    public static void main(String [] args){
        userTest = new UserTest();
        budgetTest = new BudgetTest();
        timeCalculatorTest = new TimeCalculatorTest();
        
        userTest.runTest();
        budgetTest.runTest();
        timeCalculatorTest.runTest();
    }
}