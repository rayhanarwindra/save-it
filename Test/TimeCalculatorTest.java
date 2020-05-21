package Test;
import BudgetingPlan.TimeCalculator;
public class TimeCalculatorTest {
    private TimeCalculator timeCalculator;
    public void runTest(){
        System.out.println("Running tests for timeCalculator...");

        timeCalculator = new TimeCalculator();

        int expectedTime = 44;
        
        int actualTime = timeCalculator.calculateTime(25000000, 150000000, 250000, 250000);

        if (expectedTime == actualTime){
            System.out.println("Test passed");
        }
        else{
            System.out.println("Test failed");
        }

    }
}