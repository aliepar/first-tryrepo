import java.io.Reader;
import java.util.Scanner;
public class userInput {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the width");
        double width = myObj.nextDouble();

        // Read user input
        System.out.println("width is: " + width);
        System.out.println("Enter the height");
        double height = myObj.nextDouble();
        System.out.println("height is: " + height);

        System.out.println("perimeter is: " +2*(width +height));
        System.out.println("area is: " +(width *height));
    }

}
