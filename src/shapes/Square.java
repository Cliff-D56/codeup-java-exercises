package shapes;

public class Square extends Rectangle{
    public static int perimeter(int side){
        return 4*side;
    }
    public static int area(int side){
        return side * side;
    }
    public Square(int side){
        super(side, side);

    }
}
