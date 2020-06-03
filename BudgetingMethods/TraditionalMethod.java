package BudgetingMethods;
import BudgetingPlan.Budget;

public class TraditionalMethod extends Method{
     /**
     * Computes the user's budget, and creates a new Budget object
     * Traditional method states that the user's budget formula is:
     * Save: 2.5% Invest: 2.5% Wants: 40% Needs: 55%
     * @param income the user's monthly income.
     * @return a new budget object, with save, invest, wants, 
     *         and needs calculated from the user's income
     */
    public Budget calculateBudget(long income){
        savePercentage = 0.025;
        investPercentage = 0.025;

        wantsPercentage = 0.4;
        needsPercentage = 0.55;

        long save = Math.round(income * savePercentage);
        long invest = Math.round(income * investPercentage);

        long wants = Math.round(income * wantsPercentage);
        long needs = Math.round(income * needsPercentage);

        return new Budget(save, invest, wants, needs);
    }
}