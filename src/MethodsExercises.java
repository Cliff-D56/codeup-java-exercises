import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class MethodsExercises {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
//        add(2,3);
//        sub(10,7);
//        times(2,25);
//        div(40,0);
//        mod(20,9);

//        GET INTEGER
//        System.out.print("Enter a number between 1 and 10: ");
//        userinput = getInteger(userinput,1,10);

//        FACTORIAL
//        System.out.print("Enter a number between 1 and 10: ");
//        long userinput = Long.parseLong(scanner.next());
//        factorial(userinput);

//        DICE
//        System.out.println("Please enter the number of sided dice you want to play");
//        int input = Integer.parseInt(scanner.next());
//        dice(input);
    }
    public static void add(int input1, int input2){
        System.out.println(input1 + input2);
    }
    public static void sub(int input1, int input2){
        System.out.println(input1 - input2);
    }
    public static void times(int input1, int input2){
            int total =0;
        for (int i = 1; i <= input2; i++) {
            total += input1;
        }
        System.out.println(total);
    }
    public static void div(int input1, int input2){
        if (input2 == 0){
            System.out.println(0);
        }else {
            System.out.println(input1 / input2);
        }
    }
    public static void mod(int input1, int input2){
        System.out.println(input1 % input2);
    }
    public static int getInteger(int userinput,int min, int max){
        while(userinput<min||max<userinput){
            Scanner scanner= new Scanner(System.in);
            System.out.println("Number is not in range, please try again");
            userinput = Integer.parseInt(scanner.next());
        }
        System.out.printf("Your input of %s is within range.",userinput);
        return userinput;
    }
    public static void factorial (long userinput){
            Scanner scanner= new Scanner(System.in);
//        while(userinput<1||10<userinput){
//            System.out.println("Number is not in range, please try again");
//            userinput = Integer.parseInt(scanner.next());
//        }
        long total;
        System.out.printf("The first step in your factorial is %s * %s which equals %s.\n",userinput,userinput-1,(total=(userinput-1)*userinput));
        for (long i = userinput-1; i >0 ; i--) {
//            System.out.println("\nDo you wish to continue? If no please type, \"No\"");
//            String response = scanner.next();
//            if(response.equalsIgnoreCase("No")){
//                   break;
//            }
            System.out.printf("The next step in your factorial is %s * %s which equals %s.\n",total,i-1,((i-1)*total));
            if ((i-1)*total<0) {
                System.out.printf("Congrats, you've exceeded the long data type which means %s is the highest number the factorial of %s can go and at step %s",total,userinput,i);
                break;
            }
            else {
                total=(i-1)*total;
            }
            if (i == 2) {
                System.out.printf("You've reached the last step of the factorial, any further will make %s into 0",total);
                break;
            }
        }
    }
    public static void dice(int input){
        System.out.println("Ready to play? Type \"Yes\" to roll.");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.next();
        while (response.equalsIgnoreCase("Yes")){
            Random rand = new Random();
            int dice1 = (int) (Math.random()*(input))+1;
            int dice2 = (int) (Math.random()*(input))+1;
            System.out.printf("Your first dice roll was %s and your second dice roll was %s.\n",dice1,dice2);
            System.out.println("Do you wish to roll again");
            response = scanner.next();
        }

    }
}
