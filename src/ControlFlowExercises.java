import java.awt.*;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){

//        {
//            int i = 5;
//            while (i <= 15) {
//                System.out.println(i);
//                i++;
//            }
//        }
//
//        for (int i=5;i<=15;i++){
//            System.out.println(i);
//        }
//        long count = 2L;
//        do {
//            count = count * count;
//            System.out.println(count);
//        }while(count <1000000);
//
//
//        for (long i =2L;i<1000000;i*=i){
//            System.out.println(i);
//        }
//
//
//        for (int i=1;i<=100;i++){
//            if (i%3==0 && i%5==0){
//                System.out.println("FizzBuzz");
//            } else if (i%3==0){
//                System.out.println("Fizz");
//            } else if (i%5==0) {
//                System.out.println("Buzz");
//        }else {
//            System.out.println(i);
//            }
//    }

        Scanner scanner = new Scanner(System.in);
        System.out.print("What number would you like to go up to?");
        int userInput = Integer.parseInt(scanner.next());
        System.out.println("Here is your table");
        System.out.println("Number | Squared | Cubed");
        System.out.println("-------|---------|------");
        for (int i = 1;i<=userInput;i++){
            int squared = i*i;
            int cubed = i*i*i;
            System.out.printf("%7d|%9d|%6d\n",i,squared,cubed);
        }
//            System.out.println("Give me a Grade");
//            int grade = Integer.parseInt(scanner.next());
//        while(grade<=100 && grade>0){
//            if (grade < 59){
//                System.out.println('F');
//            } else if (grade <=66&&grade >=60) {
//                System.out.println('D');
//            } else if (grade <=79&&grade >=67) {
//                System.out.println('C');
//            }else if (grade <=87&&grade >=80) {
//                System.out.println('B');
//            }else if (grade >=88) {
//                System.out.println('A');
//            }
//                System.out.println("Give me another grade if you wish to continue,\n if not put in a number above 100");
//            grade = Integer.parseInt(scanner.next());
//        };
    }
}
