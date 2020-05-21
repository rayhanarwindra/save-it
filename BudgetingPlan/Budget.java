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

    public int calculateTime(int savings, int goal){
        return this.timeCalculator.calculateTime(savings, goal, save, invest);
    }
    
}