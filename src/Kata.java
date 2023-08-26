import java.text.DecimalFormat;

import static java.lang.Math.round;

public class Kata {

    public static double areaOfPolygonInsideCircle(double circleRadius, int numberOfSides) {


        double centralAngle = (double) 360 /numberOfSides;
        double centralAngle_radians = Math.toRadians(centralAngle);
        double apothem = (circleRadius * Math.cos(centralAngle_radians/2));
        double sideLength = 2*apothem * Math.tan(centralAngle_radians/2);
        double perimeter = sideLength * numberOfSides;
        double area = (apothem*perimeter)/2;

        double roundedValueStr = (Math.round(area*1000.0)/1000.0);

        return Double.parseDouble(String.valueOf(roundedValueStr));

    }

}
