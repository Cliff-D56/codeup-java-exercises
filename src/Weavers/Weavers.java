package Weavers;

import java.util.*;
// TODO: MAKE CODERUNNER CLASS
public class Weavers{
    public static Scanner localScanner = new Scanner(System.in);
    public static void skillmenu(String skill1,String skill2,String skill3,String skill4){
        //87 Justify Spaces
        System.out.printf(
                "====================================== Skills =====================================\n" +
                "-----------------------------------------------------------------------------------\n" +
                "|1. %s                                               |\n" +
                "|2. %s|\n" +
                "|3. %s                 |\n" +
                "|4. %s                              |\n" +
                "-------------------------------------------------------------------------------------",
        skill1,skill2,skill3,skill4);
    }
    public static void skills(){
        //TODO Write Character skills


    }
    public static void battle(){
        System.out.println("Welcome to the Boss Rush. You will be assisting Ed in his plight against 7 Bosses\n\nEd is a brand new Knight of the church and his dream is to be a Paladin, the strongest Knight of the church. To do so, he decides to go out and slay monsters.");
        //TODO Write Story code

    }
    public static void main(String[] args) {
        //TODO MAKE CHARACTERS INTO DIFFERENT CLASSES AND EXTEND THEM FROM CHARACTER CLASS
//        Character_Stat Ed = new Character_Stat(200,20,10,15,);
//        Character_Stat Wrath = new Character_Stat(125,40,5,25);
//        Character_Stat Lust = new Character_Stat(100,15,10,10);
//        Character_Stat Gluttony = new Character_Stat(500,15,40,5);
//        Character_Stat Envy = new Character_Stat(200,20,10,15);
//        Character_Stat Sloth = new Character_Stat(300,20,15,5);
//        Character_Stat Greed = new Character_Stat(200,30,15,10);
//        Character_Stat Pride = new Character_Stat(700,80,40,30);
        Skill[] hi = Wrath.skills();
        System.out.println(hi[0].getDescription());
        //TODO: SKILLS OUTPUT

//        System.out.println("Are you ready for the Boss Rush?");
//        String response = localScanner.nextLine();
//        if (response.equalsIgnoreCase("Yes")){
//            battle();
//        }
//        skillmenu();
    }
}
