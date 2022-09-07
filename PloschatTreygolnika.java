package org.example.Lesson4;

public class PloschatTreygolnika {

    // Площадь будет находиться по формуле Герона (Когда известны 3 стороны)
    static public String Ploschat (int a, int b, int c) throws NegativeNumber {
        double polyPerimeter = (a+b+c)/2;
        if (polyPerimeter<a|polyPerimeter<b|polyPerimeter<c) {
        throw new NegativeNumber();
        }
        double plochat =Math.sqrt(polyPerimeter*(polyPerimeter-a)*(polyPerimeter-b)*(polyPerimeter-c));
        return String.format("%.2f",plochat);
    }

}
