package BudgetingPlan;

public class TimeCalculator {
    public int calculateTime(long savings, long goal, long save, long invest){
        int invested = 0;
        int time = 0;

        return calculateTimeRec(savings, goal, save, invest, invested, time);
    }

    private int calculateTimeRec(long savings, long goal, long save, long invest, long invested, int time){
        if (savings >= goal * 2){
            return time;
        }
        
        savings += save;

        invested += invest;

        invested = Math.round(invested + (invested * 0.005));

        savings += invested;

        return calculateTimeRec(savings, goal, save, invest, invested, time + 1);
    }
}