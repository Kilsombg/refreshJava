package laboratory.sedmica_5;


import java.awt.*;

public class ShapeFactory {

    //use getShape method to get object of type shape
    public static String getShape(IShape shape) {
        if(shape == null){
            return null;
        }

        if (shape instanceof Rectangle) {
            return "Rectangle";
        }

        if (shape instanceof Square) {
            return "Square";
        }

        if (shape instanceof Circle) {
            return "Circle";
        }

        return null;
    }

    public static void main(String[] args) {
        String shape = getShape(new Circle());
        System.out.println(shape);
    }
}

