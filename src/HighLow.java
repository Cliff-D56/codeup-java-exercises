import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int random = (int) (Math.random()*(100))+1;
        System.out.println("Guess a number between 1 and 100: ");
        int guess = Integer.parseInt(scanner.next());
        game(guess,random);
    }
    public static void game(int guess,int random){
        Scanner scanner= new Scanner(System.in);
        int count =0;
        verify(guess);
        guess(guess,random,count);
    }
    public static int verify(int guess){
        while(guess<1||100<guess){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Number is not in range, please try again");
            guess = Integer.parseInt(scanner.next());
        }
        if(guess>1&&guess<100){
            return guess;
        }
        return verify(guess);
    }
    public static int guess(int guess,int random,int count){
        Scanner scanner= new Scanner(System.in);
        if(guess > random){
            count++;
            System.out.printf("LOWER. This is guess number %s out of 5",count);
            guess= Integer.parseInt(scanner.next());
        } else if (guess < random) {
            count++;
            System.out.printf("HIGHER. This is guess number %s out of 5",count);
            guess= Integer.parseInt(scanner.next());
        } else if (guess == random) {
            System.out.println("GOOD GUESS");
        return guess;
        }
        if(count==5){
            System.out.println("Too Many Guesses");
            return guess;
        }
        return guess(guess,random,count);
    };
}
