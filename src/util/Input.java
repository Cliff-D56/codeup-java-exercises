package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;
    public Input(){
        scanner = new Scanner(System.in);
    }

    public Scanner getScanner() {
        return scanner;
    }

    public String getString(){
        return scanner.next();
    }
    public boolean yesNo() {
        System.out.println("Type in Yes or No");
        String hi = scanner.nextLine();
        return hi.equalsIgnoreCase("yes") || hi.equalsIgnoreCase("yea")||hi.equalsIgnoreCase("yeah");
    }
    public int getInt(int min,int max){
        int input;
        do {
            System.out.printf("Type in a Number between %d and %d",max,min);
            input = scanner.nextInt();
        }while(input>max||input<min);
        return input;
    }
    public int getInt(){
        return scanner.nextInt();
    }
    public double getDouble(double min, double  max){
        double input;
        do {
            System.out.printf("Type in a Number between %s and %s",max,min);
            input = scanner.nextDouble();
        }while(input>max||input<min);
        return input;
    }
    public double getDouble(){
        return getDouble(1.0,10.0);
    }

    public static void main(String[] args) {
        Input hi = new Input();
        System.out.println(hi.getDouble());
        System.out.println(hi.getInt());
    }
}

