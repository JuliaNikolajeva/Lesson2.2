import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ThirdTask {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the seconds-");
            long seconds = Long.parseLong(sc.nextLine());

            long HH = TimeUnit.SECONDS.toHours(seconds) % 24;
            long MM = TimeUnit.SECONDS.toMinutes(seconds) % 60;
            long SS = TimeUnit.SECONDS.toSeconds(seconds) % 60;

            System.out.printf("%02d:%02d:%02d%n", HH, MM, SS);
        }




    }
}
