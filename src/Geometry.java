import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Construction of a new point");
        Triangle triangle = new Triangle();
        List<Points> points = new ArrayList<>();
        for(int i = 0 ; i< 3; i++) {
            System.out.println("Please enter x: ");
            double x = keyboard.nextDouble();
            System.out.println("Please enter y: ");
            double y = keyboard.nextDouble();
            Points point = new Points(x,y);
            points.add(point);

        }

        for(Points p :points ){
            triangle.triangle.add(p);
        }

        System.out.printf("Perimeter: %f \n" , triangle.getPerimeter());
        String value = triangle.isIsosceles() ? "isosceles" : "not isosceles";
        System.out.println( "The triangle is " + value);
    }
}
