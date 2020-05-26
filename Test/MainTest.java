package Test;

public class MainTest {
    private static UserTest userTest;
    private static BudgetTest budgetTest;
    private static TimeCalculatorTest timeCalculatorTest;
    private static UpdateMethodTest updateMethodTest;

    public static void main(String [] args){
        userTest = new UserTest();
        budgetTest = new BudgetTest();
        timeCalculatorTest = new TimeCalculatorTest();
        updateMethodTest = new UpdateMethodTest();
        
        userTest.runTest();
        budgetTest.runTest();
        timeCalculatorTest.runTest();
        updateMethodTest.runTest();
    }
}