import java.util.ArrayList;
import java.util.List;

public class Triangle {

    List<Points> triangle = new ArrayList<>(3);

    public double getDistance(Points p1, Points p2){
        double dy = ( p1.y - p2.y ) * ( p1.y - p2.y );
        double dx = ( p1.x - p2.x ) * ( p1.x - p2.x );
        return Math.sqrt(dx+dy);
    }

    public double getPerimeter(){
        Points p1 = triangle.get(1);
        Points p2 = triangle.get(2);
        Points p3 = triangle.get(3);
        return getDistance(p1,p2) + getDistance(p2,p3) + getDistance(p3,p1);
    }

    public boolean isIsosceles(){
        Points p1 = triangle.get(1);
        Points p2 = triangle.get(2);
        Points p3 = triangle.get(3);
        double distance1 = getDistance(p1,p2);
        double distance2 = getDistance(p1,p2);
        double distance3 = getDistance(p1,p2);
        if (distance1 == distance2 || distance2 == distance3 ||distance3 == distance1 ) {
            return true;
        }
        else{
            return false;
        }
    }
}
