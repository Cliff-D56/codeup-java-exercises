public class ServerNameGenerator {
    public static String random(String[]array,String[]array2){
        int result =(int) (Math.random()*9);
        int result2 =(int) (Math.random()*9);
        return array[result]+"-"+array2[result2];
    }
    public static void main(String[] args){
        String[] adjectives = {"Strong","Weak","Complicated","Simple","Tall","Short","Fast","Slow","Efficient","Lazy"};
        String[] nouns = {"Computer","Knight","Paladin","Priest","Mage","Doctor","Mortician","Plague Doctor","Marksman", "Dueler"};
        for (int i = 0; i < 5; i++) {
            String hi=random(adjectives,nouns);
            System.out.println(hi);
        }
    }
}
