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

        System.out.println("How much do you make in a month?");
        int income = scanner.nextInt();

        System.out.println("How much money do you have in your savings account?");
        int savings = scanner.nextInt();

        System.out.println("Finally, how much does it cost to achieve your goal?");
        int goal = scanner.nextInt();

        System.out.println("Great! One more thing, how do you wish to save in order to achieve your goal?");
        System.out.println(" 1. Traditional \n 2. Minimalist \n 3. Frugal");
        System.out.println("Please input one number from the above list (Default: 1)");

        int methodChoice = scanner.nextInt();
        String method = chooseMethod(methodChoice);

        user = new User(income, savings, goal, method);

        scanner.close();
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