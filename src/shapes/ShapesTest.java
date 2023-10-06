package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5,4);
        Rectangle box2 = new Square(5);
        System.out.println(Square.perimeter(box2.length));
        System.out.println(Square.area(box2.length));
    }
}
