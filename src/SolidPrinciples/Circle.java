package SolidPrinciples;
class Circle implements ShapeInterface
{
    int radius;
    Circle(int radius)
    {
        this.radius=radius;
    }

    @Override
    public float area() {
        return radius*radius*3.14f;
    }

//    @Override
//    public float volume() {
//        return  (3.14f*radius*radius*radius);
//    }

}
