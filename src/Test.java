import javax.swing.text.html.HTMLDocument;

public class Test {
    public String type;
    public String color;
    public float size;

    public static void main(String[] args) {
        Test todayshoes = new Test();
        todayshoes.type = "Offbrand";
        todayshoes.size = 10.5f;
        todayshoes.color = "Black";
        System.out.println(todayshoes.type);
        Test tmwshoes = new Test();
        tmwshoes.type = "Converse";
        tmwshoes.size = 10.5f;
        tmwshoes.color = "Grey";
        System.out.println(tmwshoes.type);
    }
}
