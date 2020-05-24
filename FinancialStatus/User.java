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

    public int getIncome(){
        return this.income;
    }

    public int getSavings(){
        return this.savings;
    }

    public int getGoal(){
        return this.goal;
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