
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String name = "";
        while (true) {
            String answer = scanner.nextLine();
            if (answer.isEmpty()) {
                break;
            }
            String[] split = answer.split(",");
            if (oldest < Integer.valueOf(split[1])) {
                oldest = Integer.valueOf(split[1]);
                name = split[0];
            }
        }
        System.out.println("Name of the oldest: "+name);
    }
}
