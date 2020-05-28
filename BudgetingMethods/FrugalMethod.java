package BudgetingMethods;
import BudgetingPlan.Budget;

public class FrugalMethod extends Method {
    public Budget calculateBudget(long income){
        long save = Math.round(income * 0.05);
        long invest = Math.round(income * 0.6);

        long wants = Math.round(income * 0.1);
        long needs = Math.round(income * 0.25);

        return new Budget(save, invest, wants, needs);
    }
    
}