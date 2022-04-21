package Demo;

import SolidPrinciples.ShapeInterface;

//voilating solid principles
public class AreaCalculator {
    protected Object shapes[];
    AreaCalculator(Object shapes[])
    {
        this.shapes=shapes;
    }

    public float  sum(){
        float sum=0;

        for(int i=0;i<shapes.length;i++)
        {
            if(shapes[i] instanceof Circle)
                sum+= ((Circle) shapes[i]).radius* ((Circle) shapes[i]).radius*3.14f;
            else if(shapes[i] instanceof Square)
                sum+= ((Square) shapes[i]).side* ((Square) shapes[i]).side;
        }
        return sum;
    }

        public void output()

        {
            System.out.println(sum());
        }

}
