package BudgetingPlan;

public class Budget {
    private int save;
    private int invest;
    private int wants;
    private int needs;
    private TimeCalculator timeCalculator;

    public Budget(int save, int invest, int wants, int needs){
        this.save = save;
        this.invest = invest;
        this.wants = wants;
        this.needs = needs;
        this.timeCalculator = new TimeCalculator();
    }

    public int getSave(){
        return this.save;
    }

    public int getInvest(){
        return this.invest;
    }

    public int getWants(){
        return this.wants;
    }

    public int getNeeds(){
        return this.needs;
    }
    
    public int calculateTime(int savings, int goal){
        return this.timeCalculator.calculateTime(savings, goal, save, invest);
    }

    @Override
    public String toString(){
        return "You should save " + this.save 
        + "\nand invest " + this.invest 
        + ".\nYou should spend " + this.needs +" on your needs, and\n"
        + this.wants + " on your wants";
    }
    
}