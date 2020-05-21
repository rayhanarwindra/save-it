package BudgetingPlan;

public class TimeCalculator {
    public int calculateTime(int savings, int goal, int save, int invest){
        int invested = 0;
        int time = 0;

        return calculateTimeRec(savings, goal, save, invest, invested, time);
    }

    private int calculateTimeRec(int savings, int goal, int save, int invest, int invested, int time){
        if (savings >= goal * 2){
            return time;
        }
        
        savings += save;

        invested += invest;

        invested = (int) Math.round(invested + (invested * 0.005));

        savings += invested;

        return calculateTimeRec(savings, goal, save, invest, invested, time + 1);
    }
}