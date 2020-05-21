package BudgetingMethods;
import BudgetingPlan.Budget;

public abstract class Method {   

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

    public abstract Budget calculateBudget(int income);
}