package BudgetingMethods;
import BudgetingPlan.Budget;

public class TraditionalMethod extends Method{
    public Budget calculateBudget(long income){
        long save = Math.round(income * 0.025);
        long invest = Math.round(income * 0.025);

        long wants = Math.round(income * 0.4);
        long needs = Math.round(income * 0.55);

        return new Budget(save, invest, wants, needs);
    }
}