package BudgetingMethods;
import BudgetingPlan.Budget;

public abstract class Method {   

    protected static double savePercentage;
    protected static double investPercentage;
    protected static double wantsPercentage;
    protected static double needsPercentage;

    public static Method parseMethod(String method){
        switch(method){
            case "Traditional":
                return new TraditionalMethod();
            
            case "Minimalist":
                return new MinimalistMethod();

            case "Frugal":
                return new FrugalMethod();

            default:
                return new TraditionalMethod();
        }
    }
     /**
     * Computes the user's budget, and creates a new Budget object
     * @param income the user's monthly income.
     * @return a new budget object, with save, invest, wants, 
     *         and needs calculated from the user's income
     */
    public abstract Budget calculateBudget(long income);
}