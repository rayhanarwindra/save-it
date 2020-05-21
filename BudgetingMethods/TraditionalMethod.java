package BudgetingMethods;
import BudgetingPlan.Budget;

public class TraditionalMethod extends Method{
    public Budget calculateBudget(int income){
        int save =(int) Math.round(income * 0.025);
        int invest =(int) Math.round(income * 0.025);

        int wants = (int) Math.round(income * 0.4);
        int needs = (int) Math.round(income * 0.55);

        return new Budget(save, invest, wants, needs);
    }
}