package FinancialStatus;

import BudgetingMethods.*;
import BudgetingPlan.Budget;

public class User {
    private int income;
    private int savings;

    private int goal;
    private Method method;

    private Budget budget;
    private int time;

    public User (int income, int savings, int goal, String method){
        this.income = income;
        this.savings = savings;
        this.goal = goal;

        this.method = Method.parseMethod(method);
    }

    public void calculateBudget(){
        this.budget = method.calculateBudget(this.income);
    }

    public void calculateTime(){
        this.time = budget.calculateTime(this.savings,this.goal);
    }


}