package shapes;

public class Rectangle {
    protected int length;
    protected int width;
    public static int perimeter(int length, int width){
        return 2*length+2*width;
    }
    public static int area(int length, int width){
        return length*width;
    }

    Rectangle(int length,int width) {
        this.length = length;
        this.width = width;
    }
}
