package SolidPrinciples;
//dependency inversion
public class SumCalculatorOutputter {
    protected AreaCalculator areaCalculator;

    SumCalculatorOutputter(AreaCalculator areaCalculator)

    {
        this.areaCalculator=areaCalculator;
    }

    void addResultInJASON()
    {
        // code for adding result in jason;
        System.out.println("result in json filr:"+areaCalculator.sum());
    }
    void addResultInHTML()
    {
        //code for adding result in HTML Fle
        System.out.println("result in HTML file:"+areaCalculator.sum());
    }
}
