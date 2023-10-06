package shapes;
import util.Input;

import java.util.Scanner;

public class Circle {
    private double radius;
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(double radius){
        return this.radius = radius;
    }
    public double getArea(){
        return Math.PI*(this.radius*this.radius);
    }
    public double getcircumference(){
        return 2*Math.PI*this.radius;
    }
    public Circle(double radius){
        this.radius = radius;
    }

    public static void main(String[] args) {
        Input input = new Input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in your radius for Circle");
        double radius = scanner.nextInt();
        Circle icon = new Circle(radius);
        System.out.println("ready to start");
        boolean answer = input.yesNo();
        while (answer == true) {
            System.out.printf("The area of the circle is %s%n", icon.getArea());
            System.out.printf("The circum of the circle is %s%n", icon.getcircumference());
            System.out.println("Do you wish to input another circle?");
            answer = input.yesNo();
            if (answer == true) {
                System.out.println("enter new radius");
                icon.radius = scanner.nextInt();
            } else {
                break;
            }
        }
    }
}
