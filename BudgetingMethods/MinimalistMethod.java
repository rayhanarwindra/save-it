package BudgetingMethods;
import BudgetingPlan.Budget;

public class MinimalistMethod extends Method {
    /**
     * Computes the user's budget, and creates a new Budget object
     * Minimalist method states that the user's budget formula is:
     * Save: 5% Invest: 10% Wants: 35% Needs: 50%
     * @param income the user's monthly income.
     * @return a new budget object, with save, invest, wants, 
     *         and needs calculated from the user's income
     */
    public Budget calculateBudget(long income){
        savePercentage = 0.05;
        investPercentage = 0.1;
        
        wantsPercentage = 0.35;
        needsPercentage = 0.5;

        long save = Math.round(income * savePercentage);
        long invest = Math.round(income * investPercentage);

        long wants = Math.round(income * wantsPercentage);
        long needs = Math.round(income * needsPercentage);

        return new Budget(save, invest, wants, needs);
    }
}