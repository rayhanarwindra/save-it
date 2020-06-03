package BudgetingPlan;

public class TimeCalculator {
    private final static double INVESTMENT_RETURN = 0.005;
    
    public int calculateTime(long savings, long goal, long save, long invest){
        int invested = 0;
        int time = 0;

        return calculateTimeRec(savings, goal, save, invest, invested, time);
    }

    /**
     * Compute the time required to reach goal recursively.
     * @param savings the user's current savings.
     * @param goal the user's financial goal.
     * @param save how much user has to save based on their budget plan.
     * @param invest how much user has to invest based on their budget plan.
     * @param invested how much the user has invested over time, initaly 0.
     * @param time how much time has passed (in months), initialy 0.
     * @return the time required for user to reach goal, starting from 0, 
     *         and increments until recursive method reaches base case.
     */
    private int calculateTimeRec(long savings, long goal, long save, long invest, long invested, int time){
        if (savings >= goal * 2){
            return time;
        }
        
        savings += save;

        invested += invest;

        invested = Math.round(invested + (invested * INVESTMENT_RETURN));

        savings += invested;

        return calculateTimeRec(savings, goal, save, invest, invested, time + 1);
    }
}