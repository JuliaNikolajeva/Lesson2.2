import java.util.Scanner;

public class SecondTask {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the height");
            double height = scanner.nextDouble();
            System.out.println("Enter the weight");
            double weight = scanner.nextDouble();

            double BMI = weight / (height * height);
            System.out.println("BMI" + BMI);



        }

}
