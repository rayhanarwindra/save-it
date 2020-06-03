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

        System.out.println("Press enter to continue...");
        scanner.nextLine();
        
        long income = initIncome();

        long savings = initSavings();

        long goal = initGoal();

        String method = initMethod();

        user = new User(income, savings, goal, method);

        user.calculateBudget();
        user.calculateTime();

        inputLoop();
    }

    public static long initIncome(){
        System.out.println("How much do you make in a month?");
        return Long.parseLong(scanner.nextLine(), 10);
    }

    public static long initSavings(){
        System.out.println("How much money do you have in your savings account?");
        return Long.parseLong(scanner.nextLine(), 10);
    }

    public static long initGoal(){
        System.out.println("Finally, how much does it cost to achieve your goal?");
        return Long.parseLong(scanner.nextLine(), 10);
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

    public static void inputLoop(){
        int option;
        do {
            printOptions();
            option = scanner.nextInt();
            switch (option){
                case 1:
                    System.out.println(user.toString());
                    pressEnter();
                    break;
                case 2:
                    System.out.println(user.printBudget());
                    pressEnter();
                    break;
                case 3:
                    System.out.println("Input your new financial goal: ");
                    user.setGoal(scanner.nextLong());

                    break;
                case 4:
                    System.out.println("Please choose a new method:");
                    System.out.println(" 1. Traditional \n 2. Minimalist \n 3. Frugal");

                    String method = chooseMethod(scanner.nextInt());
                    user.setMethod(method);

                    break;
            }
        }
        while (option != 5);
    
        scanner.close();
    }

    public static void printOptions(){
        System.out.println("Pick an option...");
        System.out.println(" 1. See financial status \n 2. See budget plan \n 3. Change goal \n 4. Change budgeting method \n 5. Exit app");
        System.out.println(user.printTime());
    }

    public static void pressEnter(){
        System.out.println("Press enter to continue...");
        scanner.nextLine();
        scanner.nextLine();
    }
}