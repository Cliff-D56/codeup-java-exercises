package movies;
import util.Input;
import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {
    public static String genre(int num){
        Input input = new Input();
        String genre = switch (num) {
            case 0 -> "Exit";
            case 1 -> "All";
            case 2 -> "Animated";
            case 3 -> "Drama";
            case 4 -> "Horror";
            case 5 -> "Scifi";
            case 6 -> "Added Movie";
            default -> "Unknown";
        };
        while (genre.equalsIgnoreCase("Unknown")){
            System.out.println("You're Choice was unrecognized please try again");
            num = input.getInt();
            genre = genre(num);
        }
        return genre;
    }
    public static Movie[] movies(int num,Movie[]hi){
        Input input = new Input();
        Movie []movies2 = new Movie[0];
        String genre =genre(num);
        if(genre.equalsIgnoreCase("Added Movie")){
            System.out.println("You've added a movie");
            return movies2;
        }
        if (genre.equalsIgnoreCase("Exit")){
            return movies2;
        }
        int count=0;
        System.out.printf("These Movies are in the %s Category:%n%n",genre);
        for (int i =0;i<hi.length;i++) {
            if (genre.equalsIgnoreCase("All")){
                movies2 = hi;
                System.out.println(movies2[i].getName());
            }
            if (hi[i].getCategory().equalsIgnoreCase(genre)) {
                count++;
                movies2 = Arrays.copyOf(hi, count);
                movies2[count-1] = hi[i];
                System.out.printf("Movie #%s: %s.%n",i+1,movies2[count-1].getName());
            }
        }
        return movies2;
    }
    public static Movie[] addmovie(Input input,Movie[]array){
        System.out.println("Please Enter Name and Category of Movie");
        System.out.print("Name: ");
        String name = input.getString();
        System.out.printf("The Movie name is: %s%n",name);
        System.out.print("Category: ");
        String category = input.getString();
        System.out.printf("The Movie Category is: %s%n",category);
        Movie[] movies2 = Arrays.copyOf(array,array.length+1);
        movies2[array.length]=new Movie(name,category);
        return movies2;
    }
    public static void main(String[] args) {
        Input input = new Input();
        String message = "\n" +
                " 0 - exit\n" +
                " 1 - view all movies\n" +
                " 2 - view movies in the animated category\n" +
                " 3 - view movies in the drama category\n" +
                " 4 - view movies in the horror category\n" +
                " 5 - view movies in the scifi category\n"+
                " 6 - add movie\n"+
                "\n Please input your next choice";
        System.out.println(message);
        Movie[]hi=MoviesArray.findAll();
        int num = input.getInt();
        while (num<0||num>6){
            System.out.println("Invalid Choice Please try again");
            System.out.println(message);
            num = input.getInt();
        }
        while (num>=0&&num<=6){
            if(num == 6){
                hi =addmovie(input,hi);
            }
            if(num==0){
                System.out.println("Goodbye");
                break;
            }
            movies(num,hi);
            System.out.println(message);
            num = input.getInt();
        }
    }
}
