package FinancialStatus;

import BudgetingMethods.*;
import BudgetingPlan.Budget;
import static Utilities.CurrencyFormatter.rupiahFormat;
import static Utilities.FilePrinter.printToFile;

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

    public String printBudget(){
        return this.budget.toString();
    }

    public String printTime(){
        String output = (time <= 0) ? 
        "Congratulations! You've achieved your goal!" : "You will achieve your goal in " + time +" months.";

        return output;
    }

    @Override
    public String toString(){
        return "Your monthly income is " + rupiahFormat(this.income)
        + ",\nyour current savings is " + rupiahFormat(this.savings)
        + ",\nand your financial goal is " + rupiahFormat(this.goal);
    }

    public void saveToFile(String fileName){
        String buffer = "\n=========================\n";
        String content = this.toString() + buffer + this.printBudget() + buffer + this.printTime();
        printToFile(fileName, content);
    }
}