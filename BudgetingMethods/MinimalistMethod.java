package BudgetingMethods;
import BudgetingPlan.Budget;

public class MinimalistMethod extends Method {
    public Budget calculateBudget(int income){
        int save =(int) Math.round(income * 0.05);
        int invest =(int) Math.round(income * 0.1);

        int wants = (int) Math.round(income * 0.35);
        int needs = (int) Math.round(income * 0.5);

        return new Budget(save, invest, wants, needs);
    }
}