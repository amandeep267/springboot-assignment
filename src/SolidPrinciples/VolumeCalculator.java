package SolidPrinciples;

import java.awt.geom.Area;
//liskov subsitution

public class VolumeCalculator extends AreaCalculator {


    VolumeCalculator(Object[] shapes) {
        super(shapes);}

public float sum()
        {
            float sum=0.0f;
            for(int i=0;i<shapes.length;i++)
                if(shapes[i] instanceof ThreeDimnesionalShapeInterface)
                sum+=((ThreeDimnesionalShapeInterface) shapes[i]).volume();

          return (float)sum;
        }

}
