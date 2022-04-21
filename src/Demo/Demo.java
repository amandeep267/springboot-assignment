package Demo;


class Demo {
    public static void main(String args[])
    {
Object shapes[]={new Circle(2),new Square(4), new Square(6)};
        AreaCalculator areacalculator=new AreaCalculator(shapes);
        areacalculator.output();

    }
}
