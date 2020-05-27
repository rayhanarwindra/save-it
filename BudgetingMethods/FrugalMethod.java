package BudgetingMethods;
import BudgetingPlan.Budget;

public class FrugalMethod extends Method {
    public Budget calculateBudget(long income){
        int save =(int) Math.round(income * 0.05);
        int invest =(int) Math.round(income * 0.6);

        int wants = (int) Math.round(income * 0.1);
        int needs = (int) Math.round(income * 0.25);

        return new Budget(save, invest, wants, needs);
    }
    
}