package BudgetingMethods;
import BudgetingPlan.Budget;

public class FrugalMethod extends Method {
     /**
     * Computes the user's budget, and creates a new Budget object
     * Minimalist method states that the user's budget formula is:
     * Save: 5% Invest: 60% Wants: 10% Needs: 25%
     * @param income the user's monthly income.
     * @return a new budget object, with save, invest, wants, 
     *         and needs calculated from the user's income
     */
    public Budget calculateBudget(long income){
        savePercentage = 0.05;
        investPercentage = 0.6;
        
        wantsPercentage = 0.1;
        needsPercentage = 0.25;

        long save = Math.round(income * savePercentage);
        long invest = Math.round(income * investPercentage);

        long wants = Math.round(income * wantsPercentage);
        long needs = Math.round(income * needsPercentage);

        return new Budget(save, invest, wants, needs);
    }
    
}