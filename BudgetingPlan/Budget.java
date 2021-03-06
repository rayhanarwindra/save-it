package BudgetingPlan;

import static Utilities.CurrencyFormatter.rupiahFormat;

public class Budget {
    private long save;
    private long invest;
    private long wants;
    private long needs;
    private TimeCalculator timeCalculator;

    public Budget(long save, long invest, long wants, long needs){
        this.save = save;
        this.invest = invest;
        this.wants = wants;
        this.needs = needs;
        this.timeCalculator = new TimeCalculator();
    }

    public long getSave(){
        return this.save;
    }

    public long getInvest(){
        return this.invest;
    }

    public long getWants(){
        return this.wants;
    }

    public long getNeeds(){
        return this.needs;
    }
    
    public int calculateTime(long savings, long goal){
        return this.timeCalculator.calculateTime(savings, goal, save, invest);
    }

    @Override
    public String toString(){
        return "You should save " + rupiahFormat(this.save) 
        + "\nand invest " + rupiahFormat(this.invest) 
        + ".\nYou should spend " + rupiahFormat(this.needs) +" on your needs, and\n"
        + rupiahFormat(this.wants) + " on your wants";
    }
    
}