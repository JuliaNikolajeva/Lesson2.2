import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the width of a rectangle");
        double width = scanner.nextDouble();
        System.out.println("Enter the length of a rectangle");
        double length = scanner.nextDouble();

        double area = width * length;
        System.out.println("Area of a rectangle is" + area);
        double perimeter = (width + length) * 2;
        System.out.println("Perimeter of a rectangle is" + perimeter);


    }
}
