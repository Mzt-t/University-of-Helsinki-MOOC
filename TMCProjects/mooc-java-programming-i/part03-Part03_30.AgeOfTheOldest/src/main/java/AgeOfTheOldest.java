
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        while (true) {
            String answer = scanner.nextLine();
            if (answer.isEmpty()) {
                break;
            }
            String[] split = answer.split(",");
            if (oldest < Integer.valueOf(split[1])) {
                oldest = Integer.valueOf(split[1]);

            }
        }
        System.out.println("Age of the oldest: "+oldest);
    }
}
