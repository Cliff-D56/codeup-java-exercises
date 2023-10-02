import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String []args){
//        double pi = 3.14159;
//        byte myfavNum = -128;
//        String myString = "Hidden In Black Ice";
//        long num = 3258800000000000000L;
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        System.out.printf("The value of pi is approximately %s.",pi);
////        System.out.println(three);
        scanner();

    }
    public static void scanner(){
        String name = "Clifford";
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
//        while (scanner.hasNext()){
//            System.out.println(scanner.next());
//        }
        System.out.println("Type in Length");
        float userInput = Float.parseFloat(scanner.next());
        System.out.println("Type in Width");
        float userInput1 = Float.parseFloat(scanner.next());
        System.out.println("Type in Height");
        float userInput2 = Float.parseFloat(scanner.next());
        System.out.printf("%sFirst Number: "+userInput+" Second number: "+userInput1+" Third number: "+userInput2,name);
        System.out.printf("The length of the codeup classroom is %s and the width is %s with the total area being %s, the perimeter of the classroom is %s, and the volume of the class is %s",userInput,userInput1,(userInput*userInput1),(userInput*2+userInput1*2),(userInput*userInput1*userInput2));
    }

}
