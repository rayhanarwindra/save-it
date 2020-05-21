import FinancialStatus.User;
import java.util.Scanner;
public class MainApplication {
    private static User user;
    private static Scanner scanner;
    public static void main (String [] args){
        init();
    }

    public static void init(){
        scanner = new Scanner(System.in);

        System.out.println("Hi! Welcome to Save-it!");
        System.out.println("We're here to help you in achieving your most desired financial goals.");
        System.out.println("First, we need to collect your current financial status.");

        int income = initIncome();

        int savings = initSavings();

        int goal = initGoal();

        String method = initMethod();

        user = new User(income, savings, goal, method);

        scanner.close();
    }

    public static int initIncome(){
        System.out.println("How much do you make in a month?");
        return scanner.nextInt();
    }

    public static int initSavings(){
        System.out.println("How much money do you have in your savings account?");
        return scanner.nextInt();
    }

    public static int initGoal(){
        System.out.println("Finally, how much does it cost to achieve your goal?");
        return scanner.nextInt();
    }

    public static String initMethod(){
        System.out.println("Great! Before you get your results, how do you wish to save in order to achieve your goal?");
        System.out.println(" 1. Traditional \n 2. Minimalist \n 3. Frugal");
        System.out.println("Please input one number from the above list (Default: 1)");

        return chooseMethod(scanner.nextInt());
    }

    public static String chooseMethod(int methodChoice){
        switch (methodChoice){
            case 1:
                return "Traditional";

            case 2:
                return "Minimalist";

            case 3:
                return "Frugal";

            default:
                return "Traditional";
        }
    }
}