public class circleCalculator {
    public static void main(String[] args) {
        double circleRadius;
        circleRadius = 12.0;

        double circleDiameter;
        double circleCircumference;
        double circleArea;
        double pi = 3.14;

        circleDiameter = 2*(circleRadius);
        circleCircumference = pi*(circleDiameter);
        circleArea = pi*(circleRadius)*(circleRadius);

        System.out.println("Radius is:"+circleRadius);
        System.out.println("Diameter is:"+circleDiameter);
        System.out.println("Circumference is:"+circleCircumference);
        System.out.println("Area is:"+circleArea);
    }

}
