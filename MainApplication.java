import FinancialStatus.User;
import java.util.Scanner;
import java.lang.NumberFormatException;
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

        pressEnterOneNextLine();
        
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
        long income;
        while (true){
            try{
                System.out.println("How much do you make in a month?");
                income = Long.parseLong(scanner.nextLine(), 10);
                break;
            } catch(NumberFormatException e){
                System.out.println("Please input a number.");
            }
        } 
        return income;
    }

    public static long initSavings() throws NumberFormatException{
        long savings;
        while (true){
            try{
                System.out.println("How much money do you have in your savings account?");
                savings = Long.parseLong(scanner.nextLine(), 10);
                break;
            } catch(NumberFormatException e){
                System.out.println("Please input a number.");
            }
        } 
        return savings;
    }

    public static long initGoal(){
        long goal;
        while (true){
            try{
                System.out.println("How much money do you have in your savings account?");
                goal = Long.parseLong(scanner.nextLine(), 10);
                break;
            } catch(NumberFormatException e){
                System.out.println("Please input a number.");
            }
        } 
        return goal;
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
                
                    long goal;
                    scanner.nextLine();
                    while (true){
                        try{
                            System.out.println("Input your new financial goal: ");
                            goal = Long.parseLong(scanner.nextLine(), 10);
                            break;
                        } catch(NumberFormatException e){
                            System.out.println("Please input a number.");
                        }
                    } 
                    
                    user.setGoal(goal);
                    break;
                case 4:
                    System.out.println("Please choose a new method:");
                    System.out.println(" 1. Traditional \n 2. Minimalist \n 3. Frugal");

                    String method = chooseMethod(scanner.nextInt());
                    user.setMethod(method);

                    break;
                case 5:
                    System.out.println("Please insert the name of the file you wish to save to:");
                    scanner.nextLine();

                    String fileName = scanner.nextLine() + ".txt";
                    user.saveToFile(fileName);

                    System.out.println("Succesfully saved to " + fileName);
                    pressEnterOneNextLine();

                    break;
            }
        }
        while (option != 6);
    
        scanner.close();
    }

    public static void printOptions(){
        System.out.println("Pick an option...");
        System.out.println(" 1. See financial status \n 2. See budget plan \n 3. Change goal \n 4. Change budgeting method \n 5. Save to file \n 6. Exit app");
        System.out.println(user.printTime());
    }

    public static void pressEnter(){
        System.out.println("Press enter to continue...");
        scanner.nextLine();
        scanner.nextLine();
    }

    public static void pressEnterOneNextLine(){
        System.out.println("Press enter to continue...");
        scanner.nextLine();
    }
}