import java.util.*;

public class Weavers {
    public static Scanner localScanner = new Scanner(System.in);
    int char_hp;
    int char_atk;
    int char_def;
    int char_spd;
    public Weavers(int hp,int atk,int def,int spd){
        char_hp = hp;
        char_atk = atk;
        char_def = def;
        char_spd = spd;
    }
    public static void main(String[] args) {
        Weavers Ed = new Weavers(200,20,10,15);
        Weavers Wrath = new Weavers(125,40,5,25);
        Weavers Lust = new Weavers(100,15,10,10);
        Weavers Gluttony = new Weavers(500,15,40,5);
        Weavers Envy = new Weavers(200,20,10,15);
        Weavers Sloth = new Weavers(300,20,15,5);
        Weavers Greed = new Weavers(200,30,15,10);
        Weavers Pride = new Weavers(700,80,40,30);

        System.out.println("Are you ready for the Boss Rush?");
        String response = localScanner.nextLine();
        if (response.equalsIgnoreCase("Yes")){
            System.out.println("Welcome to the Boss Rush. You will be assisting Ed in his plight against 7 Bosses\n\nEd is a brand new Knight of the church and his dream is to be a Paladin");
        }
    }
}
