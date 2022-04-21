package SolidPrinciples;
//single responsibility and open closed principle
public class AreaCalculator {
    protected Object shapes[];
    AreaCalculator(Object shapes[])

    {
        this.shapes=shapes;
    }
    public float  sum()
    {float sum=0;

        for(int i=0;i<shapes.length;i++)
        {
            if(shapes[i] instanceof ShapeInterface)
            {
                sum+=((ShapeInterface) shapes[i]).area();
            }

        }
        return sum;}



}
