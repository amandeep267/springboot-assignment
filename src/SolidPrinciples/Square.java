package SolidPrinciples;

public class Square implements ShapeInterface
{
    int side;
    public Square(int side)
    {
        this.side=side;
    }

    @Override
    public float area() {
        return side*side;


    }

//    @Override
//    public float volume() {
//        return side*side*side;
//    }
}