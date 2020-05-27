package FinancialStatus;

import BudgetingMethods.*;
import BudgetingPlan.Budget;

public class User {
    private long income;
    private long savings;

    private long goal;
    private Method method;

    private Budget budget;
    private int time;

    public User (long income, long savings, long goal, String method){
        this.income = income;
        this.savings = savings;
        this.goal = goal;

        this.method = Method.parseMethod(method);
    }

    public long getIncome(){
        return this.income;
    }

    public long getSavings(){
        return this.savings;
    }

    public long getGoal(){
        return this.goal;
    }

    public Budget getBudget(){
        return this.budget;
    }

    public void setGoal(long goal){
        this.goal = goal;
        calculateBudget();
        calculateTime();
    }

    public void setMethod(String method){
        this.method = Method.parseMethod(method);
        calculateBudget();
        calculateTime();
    }
    
    public void calculateBudget(){
        this.budget = method.calculateBudget(this.income);
    }

    public void calculateTime(){
        this.time = budget.calculateTime(this.savings,this.goal);
    }

    public void printBudget(){
        System.out.println(budget.toString());
    }

    public void printTime(){
        String output = (time <= 0) ? 
        "Congratulations! You've achieved your goal!" : "You will achieve your goal in " + time +" months.";

        System.out.println(output);
    }

    @Override
    public String toString(){
        return "Your monthly income is " + this.income
        + ",\nyour current savings is " + this.savings
        + ",\nand your financial goal is " + this.goal;
    }

}