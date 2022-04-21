package SolidPrinciples;

import java.awt.geom.Area;

public class Demo {
    public static void main(String args[])
    {
Object shapes[]={new Circle(2),new Square(4), new Square(6),new Cube(2)};
        AreaCalculator areacalculator=new AreaCalculator(shapes);
       // areacalculator.output();
      SumCalculatorOutputter sumCalculatorOutputter= new SumCalculatorOutputter(new VolumeCalculator(shapes));
    sumCalculatorOutputter.addResultInJASON();
    sumCalculatorOutputter.addResultInHTML();
    }
}
