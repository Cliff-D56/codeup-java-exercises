import java.util.Scanner;

public class HelloWorld {

    public static void main(String []args){
        float pi = 3.1415f;
        byte myfavNum = -128;
        String myString = "Hidden In Black Ice";
        long num = 3258800000000000000L;
        String theNumberThree = "three";
        Object o = theNumberThree;
        System.out.println(--myfavNum);
//        System.out.println(three);
        scanner();

    }
    public static void scanner(){
        String name = "Clifford";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in Length");
        float userInput = Float.parseFloat(scanner.nextLine());
        System.out.println("Type in Width");
        float userInput1 = Float.parseFloat(scanner.nextLine());
        System.out.println("Type in Height");
        float userInput2 = Float.parseFloat(scanner.nextLine());
//        System.out.printf("%sFirst Number: "+userInput+" Second number: "+userInput1+" Third number: "+userInput2,name);
        System.out.printf("The length of the codeup classroom is %s and the width is %s with the total area being %s, the perimeter of the classroom is %s, and the volume of the class is %s%n",userInput,userInput1,(userInput*userInput1),(userInput*2+userInput1*2),(userInput*userInput1*userInput2));
        System.out.println("hi");
        String hi = scanner.nextLine();
        System.out.println(hi);
    }
}
